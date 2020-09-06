package com.abhai.bridge.solution.shapes;

import com.abhai.bridge.solution.colors.Color;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
