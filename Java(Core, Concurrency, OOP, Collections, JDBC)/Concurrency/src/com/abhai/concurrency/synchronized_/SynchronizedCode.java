package com.abhai.concurrency.synchronized_;

public class SynchronizedCode {
    public static void main(String[] args) throws Exception {
        Resource resource = new Resource();
        resource.setI(5);
        MyThread myThread1 = new MyThread(resource);
        MyThread myThread2 = new MyThread(resource);

        myThread1.start();
        myThread1.join();

        myThread2.start();
        myThread2.join();

        System.out.println(resource.getI());
    }
}