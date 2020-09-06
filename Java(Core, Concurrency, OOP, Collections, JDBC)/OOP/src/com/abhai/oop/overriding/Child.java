package com.abhai.oop.overriding;

public class Child extends Parent {

    /* Override won't work
    static void method() {
        System.out.println(2);
    }
    */



    /* Override will work
    Child method() {
        System.out.println(2);
    }
    */



    /* Override won't work
    void method(Child child) {
        System.out.println(1);
    }
    */



    /* Override will work(we can override exception but it's not a necessary)
    void method() {
        System.out.println(2);
    }
    */
}
