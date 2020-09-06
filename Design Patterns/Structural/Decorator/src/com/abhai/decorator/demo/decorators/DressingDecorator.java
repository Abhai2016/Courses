package com.abhai.decorator.demo.decorators;

import com.abhai.decorator.demo.components.Sandwich;

public class DressingDecorator extends SandwichDecorator {
    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addDressing();
    }

    public String addDressing() {
        return " + mustard";
    }
}
