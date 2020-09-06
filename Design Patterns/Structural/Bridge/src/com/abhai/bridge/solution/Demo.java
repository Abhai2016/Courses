package com.abhai.bridge.solution;

import com.abhai.bridge.solution.colors.Blue;
import com.abhai.bridge.solution.colors.Color;
import com.abhai.bridge.solution.colors.Green;
import com.abhai.bridge.solution.colors.Red;
import com.abhai.bridge.solution.shapes.Circle;
import com.abhai.bridge.solution.shapes.Shape;
import com.abhai.bridge.solution.shapes.Square;

public class Demo {
    public static void main(String[] args) {
        Color blue = new Blue();
        Shape square = new Square(blue);

        Color red = new Red();
        Shape circle = new Circle(red);

        Color green = new Green();
        Shape greenCircle = new Circle(green);

        square.applyColor();
        circle.applyColor();
        greenCircle.applyColor();
    }
}
