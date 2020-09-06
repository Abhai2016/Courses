package com.abhai.facade.violation;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Work\\Design Patterns\\Structural\\Facade\\testDB.db");

            Statement statement = connection.createStatement();
            int count = statement.executeUpdate("CREATE TABLE IF NOT EXISTS Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");
            System.out.println("Table Created");
            statement.close();

            statement = connection.createStatement();
            count = statement.executeUpdate("INSERT INTO Address (ID, StreetName, City) VALUES (1, '1234 some street', 'Layton')");
            System.out.println(count + " record(s) created");
            statement.close();

            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Address");

            while(resultSet.next())
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
