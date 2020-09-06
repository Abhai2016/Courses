package com.abhai.oop.overloading;

import java.io.IOException;

public class Demo {
    private static int calculate(int a, int b) throws IOException {
        return a + b;
    }

    protected final double calculate(double a, double b) throws RuntimeException {
        return a + b;
    }

//   this one we can override because it's not static and final
    public float calculate(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
//        calculate - overloaded methods despite their modificators
        Demo demo = new Demo();
        DemoChild demoChild = new DemoChild();

        try {
            int result = calculate(1, 3);
            double result2 = demo.calculate(2.4, 5.3);
            demoChild.calculate(1, 3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}