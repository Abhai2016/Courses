package com.abhai;

import java.sql.*;

public class Main {
    private static final String DB_NAME = "testJavaDB.db";
    private static final String CONNECTION = "jdbc:sqlite:C:\\Work\\Java\\Course\\TestDB\\";

    private static final String TABLE_CONTACTS = "contacts";

    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_PHONE = "phone";
    private static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(CONNECTION + DB_NAME);
            // connection.setAutoCommit(false); // even with executing this program database won't be changed because of this flag
            Statement statement = connection.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS + " (" + COLUMN_NAME + " TEXT, " + COLUMN_PHONE + " INT, " + COLUMN_EMAIL + " TEXT)");
            // statement.execute("INSERT INTO " + TABLE_CONTACTS + " VALUES('Tim', 1234567890, 'tim@gmail.com')");
            // statement.execute("INSERT INTO " + TABLE_CONTACTS + " VALUES('John', 0987654321, 'john@gmail.com')");
            // statement.execute("INSERT INTO " + TABLE_CONTACTS + " VALUES('Tom', 1234509876, 'tom@gmail.com')");
            // insertContact(statement, "Abhai", 1234567890, "abhai2013@gmail.com");

            // statement.execute("UPDATE " + TABLE_CONTACTS + " SET " + COLUMN_PHONE + " = '1234567098' WHERE " + COLUMN_NAME + " = 'Tom'");
            // statement.execute("DELETE FROM " + TABLE_CONTACTS + " WHERE " + COLUMN_NAME + " = 'John'");
            // statement.execute("DELETE FROM " + TABLE_CONTACTS + "); // deletes all rows

            statement.execute("SELECT * FROM " + TABLE_CONTACTS);
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString(COLUMN_NAME) + " Phone: " + resultSet.getInt(COLUMN_PHONE) + " Email: " + resultSet.getString(COLUMN_EMAIL));
            }

            statement.close();
            connection.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS + " VALUES(" + name + ", " + phone + ", " + email + ")");
    }
}
