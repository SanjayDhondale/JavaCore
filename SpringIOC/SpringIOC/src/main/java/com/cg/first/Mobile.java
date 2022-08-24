package com.cg.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");

        Jio j = (Jio)c.getBean("jio");
        j.Calling();
        j.Data();

        Vodafone v = c.getBean("vodafone", Vodafone.class);
        v.Data();
        v.Calling();

    }
}
