package com.oo.clients;

import com.oo.domain.Employee;
import com.oo.domain.dao.EmployeeDao;
import com.oo.reporting.EmployeeReportFormatter;
import com.oo.reporting.FormatType;

/**
 * Created by dgarcia on 24/11/2015.
 */
public class ClientModule {

    private static EmployeeDao employeeDao = new EmployeeDao();

    public static void hireNewEmployee(Employee employee) {

        employeeDao.saveEmployee( employee );

    }

    public static void terminateEmployee(Employee employee) {

        employeeDao.deleteEmployee( employee );

    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {

        EmployeeReportFormatter employeeReportFormatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(employeeReportFormatter.getFormattedEmployee());

    }

    public static void main(String[] args) {

        Employee pepe = new Employee(1L, "Pepe", "Emfermería", true);
        hireNewEmployee( pepe );
        printEmployeeReport(pepe, FormatType.XML);

    }

}
