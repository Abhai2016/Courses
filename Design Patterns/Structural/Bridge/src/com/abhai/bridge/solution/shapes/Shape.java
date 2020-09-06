package com.abhai.bridge.solution.shapes;

import com.abhai.bridge.solution.colors.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }


    public abstract void applyColor();
}
