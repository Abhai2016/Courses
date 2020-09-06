package com.abhai.oop.annotations;

import java.lang.annotation.Inherited;

@Deprecated
public class Demo {
    @Deprecated
    private int i = 0;

    @Deprecated
    public static void main(String[] args) {

    }

    @MyAnnotation(run = false, i = 4, lol = 3.5)
    private void method() {

    }
}

@Inherited
@interface MyAnnotation {
    boolean run() default true;
    int i() default 1;
    double lol();
//    String value(); - you can use it without name value(@MyAnnotation("value"))
}
