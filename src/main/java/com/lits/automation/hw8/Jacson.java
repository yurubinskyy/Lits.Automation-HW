package com.lits.automation.hw8;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;


import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;
import java.util.stream.Collectors;

public class Jacson {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/exchange?useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        URL url = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=&json");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        Exchange exchange = new Exchange();

        List<Exchange> exchangeList = objectMapper.readValue(url, new TypeReference<List<Exchange>>() {});

        List<Exchange> filteredList = exchangeList.stream()
                .filter(s -> s.getRate() > 15)
                .collect(Collectors.toList());

        System.out.println(filteredList);

        //Set to DB
        Connection connection = null;
        Statement readData = null;

        System.out.println("Registering JDBC driver...");

        Class.forName(JDBC_DRIVER);

        System.out.println("Creating database connection...");
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

        System.out.println("Executing statement...");

        for(int i = 0 ; i<filteredList.size(); i++){
            PreparedStatement writeQuery = connection.prepareStatement("INSERT INTO `exchangerate` (`r030`, `txt`,`rate`,`cc`,`exchangedate`) VALUES (?,?,?,?,?)");
            writeQuery.setInt(1, filteredList.get(i).getR030());
            writeQuery.setString(2, filteredList.get(i).getTxt());
            writeQuery.setDouble(3, filteredList.get(i).getRate());
            writeQuery.setString(4, filteredList.get(i).getCc());
            writeQuery.setString(5, filteredList.get(i).getExchangedate());
            writeQuery.execute();
        }

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
