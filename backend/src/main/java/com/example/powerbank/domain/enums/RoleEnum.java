package com.example.powerbank.domain.enums;

public enum RoleEnum {

    ADMIN("ADMIN", "管理员"),
    USER("USER", "用户");
    
    private String code;
    private String desc;

    public String getCode() {
        return code;
    }
    public String getDesc() {
        return desc;
    }

    RoleEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}