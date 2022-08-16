package com.cg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();

        Student student = new Student();
        student.setName("Sanjay");

        Address address = new Address();
        address.setStreet("1st Cross Main Road");
        address.setCity("Bangalore");
        address.setState("Karnataka");
        address.setZipcode("560097");

        manager.persist(student);
        student.setAddress(address);
        manager.getTransaction().commit();
        System.out.println("Successfully added Student Details Entry");

        manager.close();
        factory.close();

    }
}
