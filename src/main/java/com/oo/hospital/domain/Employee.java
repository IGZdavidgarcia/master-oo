package com.oo.hospital.domain;

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
