package com.abhai.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        set1.add(1);
        set1.add(1);
        set1.add(3);
        set1.add(2);
        set1.add(2);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("HashSet");
        printCollection(set1); // no iteration order, only unique elements

        Set set2 = new LinkedHashSet();
        set2.add(1);
        set2.add(1);
        set2.add(3);
        set2.add(2);
        set2.add(2);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println("LinkedHashSet");
        printCollection(set2); // guarantees order in which we added elements

        Set set3 = new TreeSet();
        set3.add(1);
        set3.add(1);
        set3.add(3);
        set3.add(2);
        set3.add(2);
        set3.add(1);
        set3.add(2);
        set3.add(3);
        System.out.println("TreeSet");
        printCollection(set3); // ascending ordered collection
    }


    private static void printCollection(Set set) {
        for (Object o : set)
            System.out.println(o);
        System.out.println();
    }
}
