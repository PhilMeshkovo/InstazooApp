package com.example.Instazoo.payload.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginRequest {

    @NotEmpty(message = "Username cannot be null")
    private String username;

    @NotEmpty(message = "Password cannot be null")
    private String password;

}
