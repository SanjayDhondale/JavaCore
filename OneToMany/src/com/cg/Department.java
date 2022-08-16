package com.cg;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name="department")
public class Department
{
    @Id
    private int id;
    private String DepartmentName;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<Employee> employees = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public void  addEmployee(Employee employee){
        employee.setDepartment(this);
        this.getEmployees().add(employee);
    }
}
