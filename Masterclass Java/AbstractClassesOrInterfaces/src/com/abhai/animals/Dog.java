package com.abhai.animals;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Dog is breathing");
    }
}
