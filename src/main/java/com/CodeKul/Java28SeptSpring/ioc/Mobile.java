package com.CodeKul.Java28SeptSpring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(SimConfuguration.class);
        Sim sim=context.getBean(Vodafone.class);
        sim.calling();
        sim.data();
    }
}
