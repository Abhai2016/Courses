package com.abhai.concurrency.synchronized_;

public class MyThread extends Thread {
    private final Resource resource;


    public MyThread(Resource resource) {
        this.resource = resource;
    }


    @Override
    public void run() {
        resource.changeI();
    }
}
