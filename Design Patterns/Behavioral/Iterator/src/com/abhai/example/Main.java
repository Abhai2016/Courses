package com.abhai.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Bryan");
        names.add("Lila");
        names.add("Jeff");

        /*
         Iterator<String> iterator = names.iterator();

         while(iterator.hasNext()) {
             String name = iterator.next();
             System.out.println(name);
             iterator.remove();
         }
        */

//        foreach loop has iterator and work like it but behind the scene
        for(String name : names)
            System.out.println(name);

        System.out.println("Names' size: " + names.size());
    }
}
