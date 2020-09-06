package com.abhai.oop.overloading;

class DemoChild extends Demo {
//    hiding or overloading but not overriding
    void calculate(int a, int b) {
        System.out.println("Overloaded method" + a + b);
    }

    @Override
    public float calculate(float a, float b) {
        return super.calculate(a, b);
    }
}