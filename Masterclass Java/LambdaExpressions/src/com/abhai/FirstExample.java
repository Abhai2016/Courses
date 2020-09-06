package com.abhai;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FirstExample {

    public static void main(String[] args) {
        // Instead of this
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from the Runnable");
            }
        }).start();

        // We can write this
        new Thread(()-> {
            System.out.println("Printing from the Runnable");
            System.out.println("Line 2");
            System.out.format("This is line %d\n", 3);
        }).start();


        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

        /*
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        });
        */

        //  Collections.sort(employees, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));
        // Collections.sort(employees, Comparator.comparing(Employee::getName));
        employees.sort(Comparator.comparing(Employee::getName));

        for(Employee employee : employees) {
            System.out.println(employee.getName());
        }

        /*
        String someString = doingStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String string1, String string2) {
                return string1.toUpperCase() + " " + string2.toUpperCase();
            }
        }, employees.get(0).getName(), employees.get(1).getName());
         */

        UpperConcat upperConcat = (s1, s2) -> s1.toUpperCase() + " " + s2.toUpperCase();
        String someString = doingStringStuff(upperConcat, employees.get(0).getName(), employees.get(1).getName());
        System.out.println(someString);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);


        // functional programming
        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });
        // or
//        for(Employee employee : employees) {
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//        }


//        Employee employee; // won't work because value changes
//
//        for(int i=0; i<employees.size(); i++) {
//            employee = employees.get(i); // won't work, values has be final or effectively final(doesn't change)
//            Employee employee = employee.get(i); // will work
//            System.out.println(employee.getName());
//            new Thread(() -> System.out.println(employee.getAge())).start();
//        }
    }

    static String doingStringStuff(UpperConcat upperConcat, String string1, String string2) {
        return upperConcat.upperAndConcat(string1, string2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    String upperAndConcat(String string1, String string2);
}

class AnotherClass {

    public String doSomething() {
        int i = 0;

        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expression's class is " + getClass().getSimpleName());
            System.out.println("i in the lambda expression = " + i);
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

        System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
        return FirstExample.doingStringStuff(uc,"String1","String2");

    }

    public void printValue() {

        int number = 25;

        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value is " + number);
        };

        new Thread(r).start();
    }
}
