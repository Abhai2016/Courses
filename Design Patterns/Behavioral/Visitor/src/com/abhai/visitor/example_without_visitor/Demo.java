package com.abhai.visitor.example_without_visitor;

import com.abhai.visitor.example_without_visitor.parts.*;

public class Demo {
    public static void main(String[] args) {
        PartsOrder partsOrder = new PartsOrder();
        AtvPart fender = new Fender();
        AtvPart wheel = new Wheel();
        AtvPart oil = new Oil();

        partsOrder.addPart(fender);
        partsOrder.addPart(wheel);
        partsOrder.addPart(oil);

        System.out.println(partsOrder.calculateShipping());
    }
}
