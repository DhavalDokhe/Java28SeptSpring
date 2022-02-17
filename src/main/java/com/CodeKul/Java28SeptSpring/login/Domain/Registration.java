package com.CodeKul.Java28SeptSpring.login.Domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Name can not be Null")
    private String name;

    @NotNull(message = "Email cannot be Null")
    private String email;

    @NotNull(message = "Password cannot be Null")
    private String password;

}
