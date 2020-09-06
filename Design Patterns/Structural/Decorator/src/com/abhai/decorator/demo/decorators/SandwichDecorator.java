package com.abhai.decorator.demo.decorators;
// decorator
import com.abhai.decorator.demo.components.Sandwich;

public abstract class SandwichDecorator implements Sandwich {
    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    @Override
    public String make() {
        return customSandwich.make();
    }
}
