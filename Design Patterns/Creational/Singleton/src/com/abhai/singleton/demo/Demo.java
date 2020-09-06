package com.abhai.singleton.demo;

public class Demo {
    public static void main(String[] args) {
        SingletonDemo singletonDemo = SingletonDemo.getInstance();
        System.out.println(singletonDemo);

        SingletonDemo anotherSingletonDemo = SingletonDemo.getInstance();
        System.out.println(anotherSingletonDemo);
    }
}
