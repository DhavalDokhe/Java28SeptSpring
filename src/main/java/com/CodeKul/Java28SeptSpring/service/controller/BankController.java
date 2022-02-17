package com.CodeKul.Java28SeptSpring.service.controller;

import com.CodeKul.Java28SeptSpring.service.domain.Bank;
import com.CodeKul.Java28SeptSpring.service.serviceD.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @Autowired
    private BankService bankService;

    @PostMapping("saveBank")
    public  String saveBank(@RequestBody Bank bank){
        bankService.saveBank(bank);
        return "bank saved";
    }

}
