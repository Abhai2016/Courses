package com.abhai.mvc.models;

public class MyModel {
    public Student getStudent() {
        Student student = new Student();
        student.setName("Abhai");
        student.setAge(23);
        return student;
    }
}
