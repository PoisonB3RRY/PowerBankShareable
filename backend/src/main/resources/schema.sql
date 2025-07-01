CREATE DATABASE powerbank;

CREATE TABLE powerbank.users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NULL UNIQUE,
    password VARCHAR(100) NULL,
    enabled BOOLEAN NULL DEFAULT TRUE,
    role VARCHAR(32) NULL DEFAULT 'USER',
    created_at TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE powerbank.authorities (
    username VARCHAR(50) NULL,
    authority VARCHAR(50) NULL
);

CREATE TABLE powerbank.power_banks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NULL,
    location VARCHAR(255) NULL,
    latitude DOUBLE NULL,
    longitude DOUBLE NULL,
    status VARCHAR(20) NULL,
    power INT NULL
);

CREATE TABLE powerbank.orders (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT NULL,
    power_bank_id BIGINT NULL,
    start_time DATETIME NULL,
    end_time DATETIME NULL,
    fee DOUBLE NULL
);