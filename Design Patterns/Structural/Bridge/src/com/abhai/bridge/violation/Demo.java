package com.abhai.bridge.violation;

import com.abhai.bridge.violation.shapes.circles.BlueCircle;
import com.abhai.bridge.violation.shapes.circles.Circle;
import com.abhai.bridge.violation.shapes.squares.GreenSquare;
import com.abhai.bridge.violation.shapes.squares.RedSquare;
import com.abhai.bridge.violation.shapes.squares.Square;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new BlueCircle();
        Square square = new RedSquare();
        Square greenSquare = new GreenSquare();

        circle.applyColor();
        square.applyColor();
        greenSquare.applyColor();
    }
}
