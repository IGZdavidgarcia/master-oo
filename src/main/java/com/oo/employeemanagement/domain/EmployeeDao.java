package com.oo.employeemanagement.domain;

import com.oo.employeemanagement.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    Employee emp1 = new Employee( 1, "Mike", null, 35000, false );
    Employee emp2 = new Employee( 2, "Rose", null, 29000, false );
    Employee emp3 = new Employee( 3, "Candice", null, 75000, false );
    Employee emp4 = new Employee( 4, "Matt", null, 62000, false );
    Employee emp5 = new Employee( 5, "Heather", null, 50000, false );

    List<Employee> employees;

    public List<Employee> generateEmployees() {

        employees = new ArrayList<>();

        employees.add( emp1 );
        employees.add( emp2 );
        employees.add( emp3 );
        employees.add( emp4 );
        employees.add( emp5 );

        return employees;
    }

    public void add( Employee employee ) {
        employees.add( employee );
    }

}
