package com.abhai;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private final String name;
    private List<Employee> employees;


    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    @Override
    public String toString() {
        return name;
    }
}
