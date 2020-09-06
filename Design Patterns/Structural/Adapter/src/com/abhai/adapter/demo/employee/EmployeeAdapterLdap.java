package com.abhai.adapter.demo.employee;

public class EmployeeAdapterLdap implements Employee {
    private final EmployeeLdap instance;



    public EmployeeAdapterLdap(EmployeeLdap employeeLdap) {
        this.instance = employeeLdap;
    }



    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getSurname();
    }

    @Override
    public String getLastName() {
        return instance.getGivenName();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    @Override
    public String toString() {
        return instance.toString();
    }
}
