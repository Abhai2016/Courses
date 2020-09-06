package com.abhai.adapter.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] arrayOfInts = new Integer[] {42, 43, 44};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);
        System.out.println(arrayOfInts);
        System.out.println(listOfInts);
    }
}
