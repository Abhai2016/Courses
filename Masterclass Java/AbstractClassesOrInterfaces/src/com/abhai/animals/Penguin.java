package com.abhai.animals;

public class Penguin extends Bird {

    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("But I'm not good at that, can I go swim instead?");
    }
}
