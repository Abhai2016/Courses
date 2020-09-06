package com.abhai.concurrency.volatile_;

public class Main {
    private volatile static int i = 0;

    public static void main(String[] args) {
        new WriteThread().start();
        new ReadThread().start();
    }

    static class WriteThread extends Thread {
        @Override
        public void run() {
            while (i < 5) {
                System.out.println("i increments to " + (++i));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class ReadThread extends Thread {
        @Override
        public void run() {
            int localVar = i;
            while (localVar < 5)
                if (localVar != i) { // without keyword volatile there will be a deadlock
                    System.out.println("new value of i is " + i);
                    localVar = i;
                }
        }
    }
}
