package com.abhai.concurrency.atomicVariables;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static AtomicInteger atomicInteger = new AtomicInteger(0);
    // if we are gonna use primitive int then we will have 99.. instead of 10000
    // because i++(int k = i + 1; i = k) isn't atomic so with multiple threads there is can be an issue

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10000; i++)
            new MyThread().start();
        Thread.sleep(1000);
        System.out.println(atomicInteger.get());
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            atomicInteger.incrementAndGet();
        }
    }
}
