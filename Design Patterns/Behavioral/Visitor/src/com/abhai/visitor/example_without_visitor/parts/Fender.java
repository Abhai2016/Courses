package com.abhai.visitor.example_without_visitor.parts;

public class Fender implements AtvPart {
    @Override
    public double calculateShipping() {
        return 3;
    }
}
