package com.example.ss_prj003.security;

import com.example.ss_prj003.domain.User;
import com.example.ss_prj003.service.UserService;
import com.example.ss_prj003.util.JwtUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CustomUsernamePasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private JwtUtil jwtUtil;
    private AuthenticationManager authenticationManager;
    private UserService userService;

    @Autowired
    public CustomUsernamePasswordAuthenticationFilter(JwtUtil jwtUtil, AuthenticationManager authenticationManager, UserService userService) {
        this.jwtUtil = jwtUtil;
        this.authenticationManager = authenticationManager;
        this.userService = userService;
    }

    //ctrl o > 오버라이딩 목록 중 attemptAuthentication 선택
    //client 요청 시 실행되는 메서드
    //기본적으로 X-WWW 타입으로 받을 수 있음(바꿀 수는 있음)
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        String username = obtainUsername(request);
        String password = obtainPassword(request);

        //필터에서 매니저로 넘겨주는 아이디, 비밀번호에 대한 객체
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                new UsernamePasswordAuthenticationToken(username, password);

        return authenticationManager.authenticate(usernamePasswordAuthenticationToken);
    }

    //성공, 실패했을 때를 만들어 줘야함
    //성공 > ctrl o > successfulAuthentication
    //실패 > ctrl o > unsuccessfulAuthentication
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        Collection<? extends GrantedAuthority> authorities = authResult.getAuthorities();
        Iterator<? extends GrantedAuthority> iterator = authorities.iterator(); //요소 순회
        GrantedAuthority auth = iterator.next();

        String role = auth.getAuthority();
        CustomUserDetails customUserDetails = (CustomUserDetails) authResult.getPrincipal();

        //access token은 header에 저장
        String accessToken = jwtUtil.generateAccessToken(customUserDetails.getUid(), List.of(role));
        response.addHeader("Authorization", "Bearer " +accessToken);

        String refreshToken = jwtUtil.generateRefreshToken(customUserDetails.getUid());

        User user = new User();
        user.setUid(customUserDetails.getUid());
        user.setRefreshToken(refreshToken);
        userService.updateRefreshToken(user);

        //refresh token은 cookie에 저장
        Cookie refreshTokenCookie = new Cookie("refreshToken",refreshToken);
        refreshTokenCookie.setHttpOnly(true);
        refreshTokenCookie.setSecure(false);
        refreshTokenCookie.setPath("/");
        refreshTokenCookie.setMaxAge(14 * 24 * 60 * 60);
        response.addCookie(refreshTokenCookie);
    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        response.setStatus(401);
    }
}
