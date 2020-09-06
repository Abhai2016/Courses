package com.abhai.bridge.solution.shapes;

import com.abhai.bridge.solution.colors.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
