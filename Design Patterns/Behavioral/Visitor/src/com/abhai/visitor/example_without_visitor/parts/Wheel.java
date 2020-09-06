package com.abhai.visitor.example_without_visitor.parts;

public class Wheel implements AtvPart {
    @Override
    public double calculateShipping() {
        return 12;
    }
}
