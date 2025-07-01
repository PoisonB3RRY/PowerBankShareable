package com.example.powerbank.controller;

import com.example.powerbank.domain.User;
import com.example.powerbank.domain.UserRegisterDto;
import com.example.powerbank.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody UserRegisterDto registerUser) {

        log.info("注册用户：" + registerUser.getUserName());
        return userService.register(registerUser);
    }
} 