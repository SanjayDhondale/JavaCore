package com.cg.first;

public class Vodafone implements Sim{

    @Override
    public void Calling() {
        System.out.println("Calling using vodafone sim");
    }

    @Override
    public void Data() {
        System.out.println("browsing using vodafone sim");
    }
}
