package com.abhai;

public class Main {

    public static void main(String[] args) {
        CountDown countDown = new CountDown();

        ThreadCountDown threadCountDown1 = new ThreadCountDown(countDown);
        threadCountDown1.setName("Thread 1");

        ThreadCountDown threadCountDown2 = new ThreadCountDown(countDown);
        threadCountDown2.setName("Thread 2");

        threadCountDown1.start();
        threadCountDown2.start();
    }
}




