package com.abhai.adapter.demo.employee;

public class EmployeeAdapterCSV implements Employee {
    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV employeeCSV) {
        this.instance = employeeCSV;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    @Override
    public String toString() {
        return instance.toString();
    }
}
