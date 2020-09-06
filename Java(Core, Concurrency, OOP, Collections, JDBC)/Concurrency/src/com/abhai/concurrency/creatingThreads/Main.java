package com.abhai.concurrency.creatingThreads;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        myThread.run(); - will execute run bu in this(main) thread
        myThread.start();
    }
}

