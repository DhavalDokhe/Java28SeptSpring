package com.CodeKul.Java28SeptSpring.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")//singletone
public class Employee {
    private int id;
    private String name;
    private String address;

    public void show() {
        System.out.println("In show");
        System.out.println("In show");
    }
    public Employee(){
        System.out.println("object Created");
    }
}
