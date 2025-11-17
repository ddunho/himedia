package com.example.ss_prj003.domain;

import java.time.LocalDateTime;

public class User {
    private int uid;
    private String userId;
    private String userPw;
    private String nickname;
    private LocalDateTime signupDate;
    private String auth;
    private String refreshToken;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", userId='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                ", nickname='" + nickname + '\'' +
                ", signupDate=" + signupDate +
                ", auth='" + auth + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                '}';
    }

    public User() {
    }

    public User(int uid, String userId, String userPw, String nickname, LocalDateTime signupDate, String auth, String refreshToken) {
        this.uid = uid;
        this.userId = userId;
        this.userPw = userPw;
        this.nickname = nickname;
        this.signupDate = signupDate;
        this.auth = auth;
        this.refreshToken = refreshToken;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public LocalDateTime getSignupDate() {
        return signupDate;
    }

    public void setSignupDate(LocalDateTime signupDate) {
        this.signupDate = signupDate;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
