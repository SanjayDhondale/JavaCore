package com.cg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();

        Department department1 = new Department();
        department1.setId(101);
        department1.setDepartmentName("DEL EMC");

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Samarth");
        employee.setSalary(50000);

        department1.addEmployee(employee);

        manager.persist(department1);

        manager.getTransaction().commit();
        System.out.println("Added employee and manager");

        manager.close();
        factory.close();

    }
}
