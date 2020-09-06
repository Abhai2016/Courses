package com.abhai.decorator.demo.components;

// concrete component

public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        return "Simple Sandwich";
    }
}
