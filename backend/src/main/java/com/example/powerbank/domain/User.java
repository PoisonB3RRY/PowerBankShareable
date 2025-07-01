package com.example.powerbank.domain;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private Boolean enabled;
    private String role;
    private Timestamp created_at;
    private Timestamp updated_at;
} 