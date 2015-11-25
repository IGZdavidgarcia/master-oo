package com.oo.employeemanagement.subjects;

import com.oo.employeemanagement.domain.Employee;
import com.oo.employeemanagement.domain.EmployeeDao;
import com.oo.employeemanagement.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements Subject {

    private List<Observer> observers;
    private List<Employee> employees;

    private EmployeeDao employeeDao;

    // ------> These are the state variables that notifies the observers when they change;
    private Employee employee;
    private String msg;

    public EmployeeManagementSystem() {
        observers = new ArrayList<>();
        employeeDao = new EmployeeDao();
        employees = employeeDao.generateEmployees();
    }

    @Override
    public void registerObserver( Observer observer ) {
        observers.add( observer );
    }

    @Override
    public void removeObserver( Observer observer ) {
        observers.remove( observer );
    }

    @Override
    public void notifyObservers() {

        for( Observer department : observers ) {
            department.callMe( employee, msg );
        }

    }

    public void hireNewEmployee( Employee newEmployee ) {

        employee = newEmployee;
        msg = "New HIRE: ";
        employees.add( employee );

        notifyObservers();
    }

    public void modifyEmployeeName( int employeeId, String name ) {

        boolean notify = false;

        for( Employee employee : employees ) {

            if( employeeId == employee.getId() ) {

                employee.setName( name );
                this.employee = employee;
                this.msg = "Employee name has been modified";

                notify = true;

            }

        }

        if( notify ) {

            notifyObservers();

        }

    }

}
