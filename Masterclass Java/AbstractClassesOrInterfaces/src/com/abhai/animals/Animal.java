package com.abhai.animals;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
