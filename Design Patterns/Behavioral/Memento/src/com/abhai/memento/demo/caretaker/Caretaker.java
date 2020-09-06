package com.abhai.memento.demo.caretaker;

import com.abhai.memento.demo.memento.EmployeeMemento;
import com.abhai.memento.demo.originator.Employee;

import java.util.Stack;

public class Caretaker {
    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee employee) {
        employeeHistory.push(employee.save());
    }

    public void revert(Employee employee) {
        employee.revert(employeeHistory.pop());
    }
}
