package com.abhai.concurrency.synchronized_;

public class Resource {
    private int i;

    public int getI() {
        return i;
    }

    public synchronized void setI(int i) {
        this.i = i;
    }

    public synchronized void changeI() {
        this.i++;
    }
}
