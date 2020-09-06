package com.abhai.concurrency.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Work(countDownLatch);
        new Work(countDownLatch);
        new Work(countDownLatch);

        countDownLatch.await();
        System.out.println("All job is done");
    }
}
