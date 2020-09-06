package com.abhai.memento.demo;

import com.abhai.memento.demo.caretaker.Caretaker;
import com.abhai.memento.demo.originator.Employee;

public class Demo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Employee employee = new Employee("Jeff", "Some address", "1234-5678-90");
        System.out.println("Employee before save " + employee.toString());

        caretaker.save(employee);
        employee.setPhone("098-123-645");
        caretaker.save(employee);
        System.out.println("Employee after save " + employee.toString());

        employee.setPhone("123-123-123"); // <--- we haven't saved this
        System.out.println("Employee before revert and without save " + employee.toString());
        caretaker.revert(employee);
        System.out.println("Employee after revert and without save " + employee.toString());
    }
}
