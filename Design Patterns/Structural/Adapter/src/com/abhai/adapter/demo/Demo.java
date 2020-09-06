package com.abhai.adapter.demo;

import com.abhai.adapter.demo.employee.Employee;
import com.abhai.adapter.demo.employee.EmployeeClient;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();
        System.out.println(employees);
    }
}
