package com.abhai.oop.overloading;

public class Example {
    public static void main(String[] args) {
        Example example = new Example();
        short c = 5;
        example.method(c);

        short a  = 123;
        short b = 124;
        example.newMethod(a, b);
    }

    // 1
    void method(int a) {
        System.out.println("int");
    }

    // 2
    void method(long a) {
        System.out.println("long");
    }

    // will never use
    void method(Integer a) {
        System.out.println("Integer");
    }

    // 3
    void method(double a) {
        System.out.println("double");
    }

    // won't work without casting (byte)b
    void method(Byte a) {
        System.out.println("Byte");
    }

    // won't work without casting (byte)b
    void method(byte... a) {
        System.out.println("byte...");
    }

    // 5
    void method(Object a) {
        System.out.println("Object");
    }

    // if there left only this one and short... then there will be an error
    // so we can use it only separated(or Object... a or short...a)
    void method(Object... a) {
        System.out.println("Object...");
    }

    // 7
    void method(Short... a) {
        System.out.println("Short...");
    }
    // won't work without casting (byte)b
    void method(byte a) {
        System.out.println("byte");
    }

    // 4
    void method(Short a) {
        System.out.println("short");
    }

    // 6
    void method(short... a) {
        System.out.println("short...");
    }



    // 1
    void newMethod(long a, long b) {
        System.out.println("long, long");
    }

    // 2
    void newMethod(Short a, Short b) {
        System.out.println("Short, Short");
    }

    // 3
    void newMethod(short... a) {
        System.out.println("short...");
    }
}
