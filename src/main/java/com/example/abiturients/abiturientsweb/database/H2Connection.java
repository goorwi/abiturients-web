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

    public H2Connection() throws ClassNotFoundException, SQLException {
            Class.forName(DRIVER_CLASS);
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }

    public static H2Connection getH2Connection() throws SQLException, ClassNotFoundException {
        return new H2Connection();
    }

    public Connection getConnection() {
        return connection;
    }
}
