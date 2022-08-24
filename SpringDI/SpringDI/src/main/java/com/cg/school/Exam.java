package com.cg.school;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");

        Student student = c.getBean("s1", Student.class);
        student.setName("sanjay");
        System.out.println(student.getName());
    }
}
