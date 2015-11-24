package com.oo.domain.dao;

import com.oo.database.DatabaseConnectionManager;
import com.oo.domain.Employee;

/**
 * Created by dgarcia on 24/11/2015.
 */
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
