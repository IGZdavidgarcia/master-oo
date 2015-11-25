package com.oo.employeemanagement.observers;

import com.oo.employeemanagement.domain.Employee;

public class HrDepartment implements Observer {

    @Override
    public void callMe( Employee employee, String message ) {
        System.out.println( "HR department notified..." );
        System.out.println( message + "; " + employee.getName() );
    }
}
