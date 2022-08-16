package com.cg.client;

import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {
    public static void main(String[] args) {
        StudentService service = new StudentServiceImpl();
        Student student = new Student();

        student = service.findStudentById(100);
        service.removeStudent(student);

        student.setId(100);
        student.setName("Sachin");
        service.addStudent(student);

        student = service.findStudentById(100);
        System.out.println("ID:"+student.getId());
        System.out.println("Name:"+student.getName());

        student = service.findStudentById(100);
        student.setName("Sachin Tendulkar");
        service.updateStudent(student);

        student = service.findStudentById(100);
        System.out.println("ID:"+student.getId());
        System.out.println("Name:"+student.getName());


        System.out.println("End of Program/Life cycle completed...");
    }
}
