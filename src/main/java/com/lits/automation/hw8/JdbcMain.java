package com.lits.automation.hw8;

import java.sql.*;
import java.util.List;

public class JdbcMain {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/exchange?useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Statement readData = null;

        System.out.println("Registering JDBC driver...");

        Class.forName(JDBC_DRIVER);

        System.out.println("Creating database connection...");
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

        System.out.println("Executing statement...");

        PreparedStatement writeQuery = connection.prepareStatement("INSERT INTO `exchangerate` (`r030`, `txt`,`rate`,`cc`,`exchangedate`) VALUES ('?','?','?','?','?')");
        writeQuery.execute();

        readData = connection.createStatement();
        ResultSet resultSet = readData.executeQuery("SELECT * FROM exchangerate");

        System.out.println("Retrieving data from database...");
        System.out.println("\n exchangeRate:");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int r030 = resultSet.getInt("r030");
            String txt = resultSet.getString("txt");
            Double rate = resultSet.getDouble("rate");
            String cc = resultSet.getString("cc");
            String exchangedate = resultSet.getString("exchangedate");

            System.out.println("\n================\n");
            System.out.println("id: " + id);
            System.out.println("r030: " + r030);
            System.out.println("txt: " + txt);
            System.out.println("rate: " + rate);
            System.out.println("cc: " + cc);
            System.out.println("exchangedate: " + exchangedate);
        }
        System.out.println("Closing connection and releasing resources...");
        resultSet.close();
        readData.close();
        connection.close();
    }
}
