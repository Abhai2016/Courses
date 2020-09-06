package com.abhai.concurrency.threadLocal;

public class Demo {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) throws Exception {
        threadLocal.set("Main thread");
        Thread threadOne = new ThreadOne();
        Thread threadTwo = new ThreadTwo();

        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();

        System.out.println("Main thread : " + threadLocal.get());
    }

    private static class ThreadOne extends Thread {
        @Override
        public void run() {
            threadLocal.set("Thread One");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread One : " + threadLocal.get());
        }
    }

    private static class ThreadTwo extends Thread {
        @Override
        public void run() {
            threadLocal.set("Thread Two");
            System.out.println("Thread Two : " + threadLocal.get());
        }
    }
}
