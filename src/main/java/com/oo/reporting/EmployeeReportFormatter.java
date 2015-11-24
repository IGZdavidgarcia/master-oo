package com.oo.reporting;

import com.oo.domain.Employee;

/**
 * Created by dgarcia on 24/11/2015.
 */
public class EmployeeReportFormatter extends ReportFormatter {

    public EmployeeReportFormatter ( Employee employee, FormatType formatType ) {
        super( employee, formatType );
    }

    public String getFormattedEmployee() {
        return getFormattedValue();
    }
}

