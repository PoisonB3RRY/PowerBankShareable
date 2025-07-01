package com.example.powerbank.service.impl;

import com.example.powerbank.domain.User;
import com.example.powerbank.domain.UserRegisterDto;
import com.example.powerbank.mapper.UserMapper;
import com.example.powerbank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.powerbank.domain.enums.RoleEnum;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public String register(UserRegisterDto registerUser) {

        // 将注册的用户转化为库表用户
        User user = new User();
        user.setUsername(registerUser.getUserName());
        user.setPassword(registerUser.getPassword());
        user.setEnabled(true);
        user.setRole(RoleEnum.USER.getCode());

        if (userMapper.findByUsername(user.getUsername()) != null) {
            return "用户名已存在";
        }
        userMapper.insertUser(user);
        return "注册成功";
    }
} 