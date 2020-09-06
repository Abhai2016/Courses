package com.abhai.adapter.demo.employee;

import java.util.StringTokenizer;

public class EmployeeCSV {
    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;


    public EmployeeCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if (tokenizer.hasMoreElements())
            id = Integer.parseInt(tokenizer.nextToken());
        if (tokenizer.hasMoreElements())
            firstName = tokenizer.nextToken();
        if (tokenizer.hasMoreElements())
            lastName = tokenizer.nextToken();
        if (tokenizer.hasMoreElements())
            emailAddress = tokenizer.nextToken();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "EmployeeCSV{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
