package com.abhai.oop.inner_classes;

public class Demo {
    private int i = 5;
    static int q = 4;

    static class StaticClass {
        void method() {
//            System.out.println(i);
            System.out.println("Static class has an access only to static fields and methods, q: " + q);
        }
    }

    Inner inner = new Inner();

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.method();

        Inner inner = demo.new Inner();
        inner.method();
        System.out.println("External class has an access to the fields in inner class, k : " + inner.k);

        StaticClass staticClass = new StaticClass();
        staticClass.method();
    }

    void method() {
        class NewInner {
            void method() {
                System.out.println("Local inner class and it has an access to all fields external's class, i : " + i);
            }
        }
        NewInner newInner = new NewInner();
        newInner.method();
    }
    class Inner {
        private int k = 6;

        void method() {
            System.out.println("Inner class has an access to the fields external class, " + "q: " + q + " i : " + i);
        }
    }
}
