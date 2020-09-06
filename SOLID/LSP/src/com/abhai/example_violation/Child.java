package com.abhai.example_violation;

public class Child extends Parent {
    @Override
    public void doSomething() {
        throw new RuntimeException();
    }
}
