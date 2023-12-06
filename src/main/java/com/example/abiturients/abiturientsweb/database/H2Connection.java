package com.example.abiturients.abiturientsweb.database;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2Connection {
    private static final String JDBC_URL = "jdbc:h2:mem:testdb";
    private static final String USER = "sa";
    private static final String PASSWORD = "";
    private static final String DRIVER_CLASS = "org.h2.Driver";

    private static H2Connection h2Connection;

    Connection connection;

    private H2Connection() {
        try {
            Class.forName(DRIVER_CLASS);
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static H2Connection getH2Connection() {
        new H2Connection();
        return h2Connection;
    }

    public Connection getConnection() {
        return h2Connection.getConnection();
    }
}
