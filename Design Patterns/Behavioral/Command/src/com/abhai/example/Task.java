package com.abhai.example;

public class Task implements Runnable {
    int num1;
    int num2;


    Task(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    @Override
    public void run() { // execute method
        System.out.println(num1 * num2); // receiver
    }
}
