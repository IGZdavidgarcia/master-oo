package com.oo.hospital.clients;

import com.oo.hospital.domain.Employee;
import com.oo.hospital.domain.dao.EmployeeDao;
import com.oo.hospital.reporting.EmployeeReportFormatter;
import com.oo.hospital.reporting.FormatType;

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
