package com.abhai.flyweight.demo.flyweights;
// Instances of Item will be Flyweights
public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
