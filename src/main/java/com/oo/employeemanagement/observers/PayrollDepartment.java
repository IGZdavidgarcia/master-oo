package com.oo.employeemanagement.observers;

import com.oo.employeemanagement.domain.Employee;

public class PayrollDepartment implements Observer {

    @Override
    public void callMe( Employee employee, String message ) {
        System.out.println( "Payroll department notified..." );
        System.out.println( message + "; " + employee.getName() );
    }
}
