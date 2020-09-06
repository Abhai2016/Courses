package com.abhai;

import java.util.concurrent.locks.ReentrantLock;

public class Solution {
    private static ReentrantLock lock = new ReentrantLock(true); //fair lock allows each thread executes one by one iterations
    // ReentrantLock allows thread finished the whole execution and only then gives another thread to execute

    public static void main(String[] args) {
        Thread t1 = new Thread(new Worker(ThreadColor.ANSI_RED), "Priority 10");
        Thread t2 = new Thread(new Worker(ThreadColor.ANSI_BLUE), "Priority 8");
        Thread t3 = new Thread(new Worker(ThreadColor.ANSI_GREEN), "Priority 6");
        Thread t4 = new Thread(new Worker(ThreadColor.ANSI_CYAN), "Priority 4");
        Thread t5 = new Thread(new Worker(ThreadColor.ANSI_PURPLE), "Priority 2");

        t1.setPriority(10);
        t2.setPriority(8);
        t3.setPriority(6);
        t4.setPriority(4);
        t5.setPriority(2);

        // We can that there is no first in first out. OS chooses which thread will be next and with priorities
        // we can't say that the result will be the same every time we execute the program. It's kinda thread's race
        // because when lock is available each thread wants to execute

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

    private static class Worker implements Runnable {
        private int runCount = 1;
        private String threadColor;

        public Worker(String threadColor) {
            this.threadColor = threadColor;
        }

        @Override
        public void run() {
            for(int i=0; i<100; i++) {
                lock.lock();
                try {
                    System.out.format(threadColor + "%s: runCount = %d\n", Thread.currentThread().getName(), runCount++);
                    // execute critial section of code
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
