package com.abhai.core.static_;

public class Demo {
    static int i;
    int j;

    static {
        System.out.println("Static initializer");
    }

    {
        System.out.println("Initializer");
    }

    {
        System.out.println("Second Initializer");
    }

    public Demo() {
        i++;
        System.out.println("Constructor");
    }

    private static void staticMethod() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        System.out.println(Demo.i);
        Demo.staticMethod();
        new Demo();
        new Demo();
        new Demo();
        new Demo();
        System.out.println(Demo.i);
    }
}
