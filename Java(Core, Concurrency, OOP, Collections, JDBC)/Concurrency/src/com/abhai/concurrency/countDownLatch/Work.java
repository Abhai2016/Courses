package com.abhai.concurrency.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Work extends Thread {
    private CountDownLatch countDownLatch;


    public Work(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work is done");
        countDownLatch.countDown();
    }
}
