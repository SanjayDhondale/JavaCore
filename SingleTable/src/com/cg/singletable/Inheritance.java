package com.cg.singletable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Inheritance {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

        Employee employee = new Employee();
        employee.setName("RAM");
        employee.setSalary(11000);
        em.persist(employee);

        Manager manager = new Manager();
        manager.setName("Abhi");
        manager.setSalary(15000);
        manager.setDepartmentName("ECE");
        em.persist(manager);

        em.getTransaction().commit();
        System.out.println("Successfully Added an Employee and a Manager");
        em.close();
        factory.close();
    }
}
