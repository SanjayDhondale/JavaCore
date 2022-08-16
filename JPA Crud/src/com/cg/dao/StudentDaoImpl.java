package com.cg.dao;

import com.cg.entities.Student;

import javax.persistence.EntityManager;

public class StudentDaoImpl implements StudentDao{
    private final EntityManager entityManager;
    public  StudentDaoImpl(){
        entityManager = JPAUtil.getEntityManager();
    }

    @Override
    public Student findStudentById(int id){
        return entityManager.find(Student.class, id);
    }

    @Override
    public void addStudent(Student student){
        entityManager.persist(student);
    }

    @Override
    public void removeStudent(Student student){
        entityManager.remove(student);
    }

    @Override
    public void updateStudent(Student student){
        entityManager.merge(student);
    }

    @Override
    public void beginTransaction(){
        entityManager.getTransaction().begin();
    }

    @Override
    public void commitTransaction(){
        entityManager.getTransaction().commit();
    }
}
