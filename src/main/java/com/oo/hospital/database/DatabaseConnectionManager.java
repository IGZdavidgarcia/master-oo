package com.oo.hospital.database;

public class DatabaseConnectionManager {

    public DatabaseConnection getManagerInstance() {
        DatabaseConnection databaseConnection = new DatabaseConnection();

        System.out.println("Instantiated new database connection");

        return databaseConnection;
    }

    public void connect() {

        System.out.println("Connected to database");

    }

    public void getConnectionObject() {

        System.out.println("Retrieved connection object");

    }

    public void disconnect() {

        System.out.println("Disconnected from database");

    }
}
