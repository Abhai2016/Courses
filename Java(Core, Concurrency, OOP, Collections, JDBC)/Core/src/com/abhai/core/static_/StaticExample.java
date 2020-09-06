package com.abhai.core.static_;

public class StaticExample {
    static StaticExample staticExample = new StaticExample(); // returnInt, Clean, Constructor -
    // - initializes non static fields and methods
    static int n = 4;
    static int i = returnStaticInt();

    static int k = 3;
    int j = returnInt();

    static {
        System.out.println("Static Initializer");
    }

    {
        System.out.println("Clean");
    }

    StaticExample() {
        System.out.println("Constructor");
    }

    static int returnStaticInt() {
        System.out.println(n);
        System.out.println(k);
        System.out.println("Return Static Int");
        return 1;
    }

    int returnInt() {
        System.out.println("Return int");
        return 2;
    }

    public static void main(String[] args) {
        new StaticExample();
        new StaticExample();
    }
}
