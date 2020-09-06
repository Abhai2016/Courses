package com.abhai.template.demo;

import com.abhai.template.demo.templates.OrderTemplate;
import com.abhai.template.demo.templates.StoreOrder;
import com.abhai.template.demo.templates.WebOrder;

public class Demo {
    public static void main(String[] args) {
        System.out.println("WebOrder:");
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        System.out.println("StoreOrder");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}
