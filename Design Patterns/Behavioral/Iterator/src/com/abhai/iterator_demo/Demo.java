package com.abhai.iterator_demo;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        BikeRepository bikes = new BikeRepository();

        bikes.addBike("First one");
        bikes.addBike("Second one");
        bikes.addBike("Third one");

        Iterator<String> iterator = bikes.iterator();

        while(iterator.hasNext())
            System.out.println(iterator.next());

//        for(String bike : bikes)
//            System.out.println(bike);
    }
}
