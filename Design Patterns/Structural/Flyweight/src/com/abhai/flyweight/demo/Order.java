package com.abhai.flyweight.demo;

import com.abhai.flyweight.demo.flyweights.Item;

public class Order {
    private final int orderNumber;
    private final Item item;


    public Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    public void processOrder() {
        System.out.println("Ordering " + item + " for order number " + orderNumber);
    }
}
