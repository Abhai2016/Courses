package com.abhai.template.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person bryan = new Person("Bryan", "1234-5678", 41);
        Person mark = new Person("Mark", "123-321", 39);
        Person chris = new Person("Chris", "987-654-321", 21);

        List<Person> people = new ArrayList<>();
        people.add(bryan);
        people.add(mark);
        people.add(chris);

        System.out.println("Not sorted");
        printContent(people);

        Collections.sort(people);

        System.out.println("Sorted by age");
        printContent(people);
    }

    private static void printContent(List<Person> people) {
        for(Person person : people)
            System.out.println(person.getName());
    }
}
