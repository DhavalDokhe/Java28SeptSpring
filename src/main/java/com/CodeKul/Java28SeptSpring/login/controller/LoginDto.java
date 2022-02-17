package com.CodeKul.Java28SeptSpring.login.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class LoginDto {

    @NotNull(message = "Not to be null")
    private String email;

    @NotNull(message = "Not to be null")
    private String password;
}
