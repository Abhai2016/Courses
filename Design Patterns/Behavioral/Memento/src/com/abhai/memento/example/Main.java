package com.abhai.memento.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jeff", "New Adress", "1234567890");
        System.out.println(employee.toString());
        serialize(employee);

        Employee employee1 = deserialize();
        System.out.println(employee1.toString());
    }


    private static Employee deserialize() {
        Employee employee = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("employee.ser");
            ObjectInputStream objectinputStream = new ObjectInputStream(fileInputStream);
            employee = (Employee) objectinputStream.readObject();
            objectinputStream.close();
            fileInputStream.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        return employee;
    }


    private static void serialize(Employee employee) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
