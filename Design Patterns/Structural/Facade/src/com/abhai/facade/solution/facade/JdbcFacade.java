package com.abhai.facade.solution.facade;

import com.abhai.facade.solution.model.Address;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {
    private Connection connection;

    public JdbcFacade() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Work\\Design Patterns\\Structural\\Facade\\testDB.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int createTable() {
        int count = 0;
        try {
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("CREATE TABLE IF NOT EXISTS Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");
            System.out.println("Table Created");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("INSERT INTO Address (ID, StreetName, City) VALUES (1, '1234 some street', 'Layton')");
            System.out.println(count + " record(s) created");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getAddresses() {
        List<Address> addresses = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Address");

            while(resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));

                Address address = new Address();
                address.setId(resultSet.getString(1));
                address.setStreetName(resultSet.getString(2));
                address.setCity(resultSet.getString(3));

                addresses.add(address);
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return addresses;
    }
}
