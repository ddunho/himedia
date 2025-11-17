package com.example.ss_prj003.controller;
import com.example.ss_prj003.domain.User;
import com.example.ss_prj003.service.UserService;
import com.example.ss_prj003.util.JwtUtil;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
public class RefreshTokenController {
    private JwtUtil jwtUtil;
    private UserService userService;

    @Autowired
    public RefreshTokenController(JwtUtil jwtUtil, UserService userService) {
        this.jwtUtil = jwtUtil;
        this.userService = userService;
    }

    @PostMapping("/refresh")
    public ResponseEntity<String> refresh(@CookieValue(name = "refreshToken", required = false)String refreshToken, HttpServletResponse response, HttpServletRequest request) {
        String accessToken = request.getHeader("Authorization");

        try{
            jwtUtil.isRefreshTokenExpired(refreshToken);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }

        if (accessToken == null || !accessToken.startsWith("Bearer ")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }

        Optional<User> foundUser = userService.findUser(jwtUtil.getUserUid(accessToken));


        if(foundUser.get().getRefreshToken().equals(refreshToken) == false){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }

        String newAccessToken = jwtUtil.generateAccessToken(jwtUtil.getUserUid(accessToken), jwtUtil.getRole(accessToken));
        response.addHeader("Authorization", "Bearer " + newAccessToken);

        String newRefreshToken = jwtUtil.generateRefreshToken(jwtUtil.getUserUid(accessToken));
        User user = new User();
        user.setUid(jwtUtil.getUserUid(accessToken));
        user.setRefreshToken(newRefreshToken);
        userService.updateRefreshToken(user);

        Cookie refreshTokenCookie = new Cookie("refreshToken", newRefreshToken);
        refreshTokenCookie.setHttpOnly(true);
        refreshTokenCookie.setSecure(false); // HTTPS 환경에서만 전송 (개발 시 false, 배포 시 true 필수)
        refreshTokenCookie.setPath("/");
        refreshTokenCookie.setMaxAge(14 * 24 * 60 * 60);
        response.addCookie(refreshTokenCookie);

        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
