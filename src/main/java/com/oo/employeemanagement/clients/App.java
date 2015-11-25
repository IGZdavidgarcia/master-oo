package com.oo.employeemanagement.clients;

import com.oo.employeemanagement.subjects.EmployeeManagementSystem;
import com.oo.employeemanagement.observers.HrDepartment;
import com.oo.employeemanagement.observers.Observer;
import com.oo.employeemanagement.observers.PayrollDepartment;
import com.oo.employeemanagement.domain.Employee;

import java.util.Date;

public class App {

    public static void main( String[] args ) {

        Observer payroll = new PayrollDepartment();
        Observer hrSystem = new HrDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver( payroll );
        ems.registerObserver( hrSystem );

        Employee bob = new Employee( 6, "Bob", new Date(), 42000, false );
        ems.hireNewEmployee( bob );

        ems.modifyEmployeeName( 5, "Peter" );

    }

}