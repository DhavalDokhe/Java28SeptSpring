package com.CodeKul.Java28SeptSpring.bank.controller;


import com.CodeKul.Java28SeptSpring.bank.domain.User;
import com.CodeKul.Java28SeptSpring.bank.repositrory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

@Autowired
    private UserRepository userRepository;

@PostMapping("saveUser")
public String saveUser(@RequestBody User user){
    userRepository.save(user);
    return "user saved";
}
}
