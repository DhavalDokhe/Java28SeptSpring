package com.CodeKul.Java28SeptSpring.ioc;

public class Vodafone implements Sim{
    @Override
    public void calling() {
        System.out.println("vodafone calling");
    }

    @Override
    public void data() {
        System.out.println("Vodafone data");
    }
}
