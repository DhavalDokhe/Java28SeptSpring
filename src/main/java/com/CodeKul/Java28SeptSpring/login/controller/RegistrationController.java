package com.CodeKul.Java28SeptSpring.login.controller;

import com.CodeKul.Java28SeptSpring.login.Domain.Registration;
import com.CodeKul.Java28SeptSpring.login.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
public class RegistrationController {

    @Autowired
    private RegistrationRepo registrationRepo;

    @PostMapping("register")
    public String register(@Valid @RequestBody Registration registration){
        registrationRepo.save(registration);
        return "Registration Successfully";
    }

    @PostMapping("login")
    public String login(@RequestBody LoginDto loginDto){

        Registration registration
                =registrationRepo.findByEmailAndPassword(loginDto.getEmail(),loginDto.getPassword());
        if (registration.getEmail()!=null){
            return "Login Successfully";
        }else
            return "Failed";
    }

}
