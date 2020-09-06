package com.abhai.singleton.demo;

public class SingletonDemo {
    private static SingletonDemo instance = null;

    public static SingletonDemo getInstance() {
        if (instance == null)
            synchronized(SingletonDemo.class) {
                instance = new SingletonDemo(); // lazily loaded
            }

        return instance;
    }
}
