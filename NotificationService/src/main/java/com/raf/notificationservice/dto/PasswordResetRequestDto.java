package com.raf.notificationservice.dto;

public class PasswordResetRequestDto {

    private String email;

    public PasswordResetRequestDto() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
