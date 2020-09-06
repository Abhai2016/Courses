package com.abhai.example;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task(12, 14); // encapsulates request
        Task task2 = new Task(4, 6);

        Thread thread1 = new Thread(task1);
        thread1.start(); // invoker

        Thread thread2 = new Thread(task2);
        thread2.start();
    }
}
