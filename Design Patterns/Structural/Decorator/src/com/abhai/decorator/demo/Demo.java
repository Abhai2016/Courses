package com.abhai.decorator.demo;

import com.abhai.decorator.demo.components.Sandwich;
import com.abhai.decorator.demo.components.SimpleSandwich;
import com.abhai.decorator.demo.decorators.DressingDecorator;
import com.abhai.decorator.demo.decorators.MeatDecorator;

public class Demo {
    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
    }
}
