package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class IgniteConnection
{
    private static String jdbcUrl = "jdbc:ignite:thin://127.0.0.1/";
    private static String username = "maf";
    private static String password = "maf";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection (jdbcUrl, username, password);
    }
}