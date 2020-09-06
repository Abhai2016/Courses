package com.abhai.concurrency.join;

import com.abhai.concurrency.creatingThreads.MyThread;

public class JoinExample {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
//        myThread.join(); - without this "Main thread" will print at first
        System.out.println("Main thread");
    }
}