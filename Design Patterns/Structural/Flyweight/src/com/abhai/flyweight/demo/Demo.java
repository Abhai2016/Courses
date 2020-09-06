package com.abhai.flyweight.demo;

public class Demo {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("Roomba", 321);
        inventorySystem.takeOrder("Headphones", 123);
        inventorySystem.takeOrder("Samsung TV", 361);
        inventorySystem.takeOrder("Samsung TV", 223);
        inventorySystem.takeOrder("Roomba", 432);
        inventorySystem.takeOrder("Headphones", 911);

        inventorySystem.process();
        System.out.println(inventorySystem.report());
    }
}
