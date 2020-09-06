package com.abhai.strategy.example;

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

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() > o2.getAge())
                    return 1;
                else if (o1.getAge() < o2.getAge())
                    return -1;

                return 0;
            }
        });

        System.out.println("Sorted by age");
        printContent(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("Sorted by name");
        printContent(people);
    }

    private static void printContent(List<Person> people) {
        for(Person person : people)
            System.out.println(person.getName());
    }
}
