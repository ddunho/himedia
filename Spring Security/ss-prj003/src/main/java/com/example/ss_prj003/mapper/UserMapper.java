package com.example.ss_prj003.mapper;

import com.example.ss_prj003.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface UserMapper {
    Optional<User> findUserByUserId(String userId);
    Optional<User> findUserByUserUid(int userUid);
    void updateRefreshToken(User user);
}
