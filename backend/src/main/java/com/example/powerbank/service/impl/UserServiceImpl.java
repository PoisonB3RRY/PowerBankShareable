package com.example.powerbank.service.impl;

import com.example.powerbank.domain.User;
import com.example.powerbank.mapper.UserMapper;
import com.example.powerbank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.powerbank.domain.enums.RoleEnum;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public String register(User user) {
        if (userMapper.findByUsername(user.getUsername()) != null) {
            return "用户名已存在";
        }
        user.setEnabled(true);
        user.setRole(RoleEnum.USER.getCode());
        userMapper.insertUser(user);
        return "注册成功";
    }
} 