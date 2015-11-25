package com.oo.employeemanagement.domain;

import java.util.Date;

public class Employee {

    private int id;
    private String name;
    private Date hireDate;
    private int salary;
    private boolean working;

    public Employee(int id, String name, Date hireDate, int salary, boolean working) {
        this.id = id;
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.working = working;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", working=" + working +
                '}';
    }
}
