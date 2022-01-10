package com.CodeKul.Java28SeptSpring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
    private   int id;
    private String name;
    private String address;

    //field based is used mostly.
    @Autowired
    private Employee employee;

    @Autowired
    private Employee employee1;


    //setter method
//    @Autowired
//    public void setEmployee()

    public void getData() {
        employee.show();
    }
}
