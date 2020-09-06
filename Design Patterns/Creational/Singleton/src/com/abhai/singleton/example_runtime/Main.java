package com.abhai.singleton.example_runtime;

public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        System.out.println(runtime);

        Runtime anotherRuntime = Runtime.getRuntime();
        System.out.println(anotherRuntime);

        if (runtime == anotherRuntime)
            System.out.println("They are the same instance");
    }
}
