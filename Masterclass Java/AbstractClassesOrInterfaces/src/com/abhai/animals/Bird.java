package com.abhai.animals;

import com.abhai.animals.interfaces.ICanFly;

public class Bird extends Animal implements ICanFly {

    public Bird(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
