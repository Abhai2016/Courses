package com.abhai.oop.inner_classes;

public class SecondClass {
    void method() {
        Demo.Inner inner = new Demo().new Inner();
        inner.method();
    }
}
