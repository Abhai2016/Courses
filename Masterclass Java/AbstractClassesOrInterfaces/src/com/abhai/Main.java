package com.abhai;

import com.abhai.animals.Dog;
import com.abhai.animals.Parrot;
import com.abhai.animals.Penguin;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie", 4);
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck", 2);
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor", 1);
        penguin.fly();
    }
}
