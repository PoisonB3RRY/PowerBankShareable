package com.example.powerbank.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.powerbank.domain.User;

@Mapper
public interface UserMapper {
    User findByUsername(@Param("username") String username);
    int insertUser(User user);
} 