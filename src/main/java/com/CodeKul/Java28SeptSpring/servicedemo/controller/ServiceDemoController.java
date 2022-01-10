package com.CodeKul.Java28SeptSpring.servicedemo.controller;

import com.CodeKul.Java28SeptSpring.servicedemo.domain.ServiceDemo;
import com.CodeKul.Java28SeptSpring.servicedemo.service.ServiceDemoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceDemoController {

    @Autowired
    private ServiceDemoInterface serviceDemoInterface;

    @PostMapping("saveServiceDemo")
    public String saveService(@RequestBody ServiceDemo serviceDemo){
        serviceDemoInterface.saveServiceDemo(serviceDemo);
        return "saved";
    }
}
