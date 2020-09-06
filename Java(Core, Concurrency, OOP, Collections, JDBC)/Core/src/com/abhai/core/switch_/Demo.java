package com.abhai.core.switch_;

public class Demo {
    public static void main(String[] args) {
        int i = 10;
        switch (i) { // we can put there primitives, ENUM and String(Since Java 7)
            case 1:
                System.out.println(1);
            default:
                System.out.println("default");
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            case 4:
                System.out.println(4);
        }
    }
}
