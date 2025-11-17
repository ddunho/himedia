package com.example.ss_prj003.service;

import com.example.ss_prj003.domain.User;
import com.example.ss_prj003.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void updateRefreshToken(User user){
        userMapper.updateRefreshToken(user);
    }
    public Optional<User> findUser(int useruid){
        return userMapper.findUserByUserUid(useruid);
    }
}
