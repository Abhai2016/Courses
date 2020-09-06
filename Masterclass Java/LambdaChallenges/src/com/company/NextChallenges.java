package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextChallenges {
    public static void main(String[] args) {
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );


        // Challenge №9(8 in comments)
        // List<String> upperCaseTopNames2015 = new ArrayList<>();
        // topNames2015.forEach(name -> upperCaseTopNames2015.add(name.substring(0,1).toUpperCase() + name.substring(1)));
        // upperCaseTopNames2015.sort(String::compareTo); // upperCaseTopNames2015.sort((s1, s2) -> s1.compareTo(s2));
        // upperCaseTopNames2015.forEach(System.out::println); // upperCaseTopNames2015.forEach(s -> System.out.println(s));

        // Challenge №10
        topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .sorted()
                .forEach(System.out::println);

        // Challenge №11
        long count = topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println(count);

        // Challenge №12
        topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo);
        // output - nothing because there's no terminal operation
        // stream chains are evaluated lazily. Nothing happens until a terminal operation is added to the chain

        // Challenge №13 - fix challenge 12
        topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .count(); // or collect(Collectors.toList())
    }
}
