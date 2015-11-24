package com.oo.domain;

/**
 * Created by dgarcia on 24/11/2015.
 */
public class Employee {

    private Long id;
    private String name;
    private String department;
    private boolean working;

    public Employee(Long id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }

}
