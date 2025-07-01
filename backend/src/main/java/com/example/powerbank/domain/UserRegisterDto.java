package com.example.powerbank.domain;

import lombok.Data;

@Data
public class UserRegisterDto {
    private String userName;
    private String confirmPassword;
    private String password;
}
