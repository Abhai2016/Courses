package com.abhai.oop.overriding;

public class Parent {

    /* Override won't work
    static void method() {
        System.out.println(1);
    }
    */



    /* Override will work
    Parent method() {
        System.out.println(1);
    }
    */



     /* Override won't work
    void method(Parent parent) {
        System.out.println(1);
    }
    */



    /* Override will work(we can don't override exception)
    void method() throws Exception {
        System.out.println(1);
    }
    */
}
