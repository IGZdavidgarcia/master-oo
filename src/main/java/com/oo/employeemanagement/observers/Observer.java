package com.oo.employeemanagement.observers;

import com.oo.employeemanagement.domain.Employee;

public interface Observer {

    void callMe( Employee employee, String message );
}
