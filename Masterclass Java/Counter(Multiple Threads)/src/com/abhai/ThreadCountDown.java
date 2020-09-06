package com.abhai;

public class ThreadCountDown extends Thread {
    private final CountDown countDown;

    public ThreadCountDown(CountDown countDown) {
        this.countDown = countDown;
    }

    @Override
    public void run() {
        countDown.doCountDown();
    }
}
