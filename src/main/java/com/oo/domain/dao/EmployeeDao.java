package com.oo.domain.dao;

import com.oo.database.DatabaseConnectionManager;
import com.oo.domain.Employee;

public class EmployeeDao {

    private DatabaseConnectionManager databaseConnectionManager = new DatabaseConnectionManager();

    public void saveEmployee( Employee employee ) {

        databaseConnectionManager.connect();
        databaseConnectionManager.getConnectionObject();

        System.out.println("Saved employee");

        databaseConnectionManager.disconnect();
    }

    public void deleteEmployee( Employee employee ) {

        databaseConnectionManager.connect();
        databaseConnectionManager.getConnectionObject();

        System.out.println("Deleted employee");

        databaseConnectionManager.disconnect();
    }

}
