package com.abhai;

import static com.abhai.ThreadColor.*;

public class CountDown {
    // public synchronized void doCountDown() - to not allow access to instance variables for another threads until this one terminates
    public void doCountDown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ANSI_BLUE;
                break;
            case "Thread 2:":
                color = ANSI_PURPLE;
                break;
            default:
                color = ANSI_RED;
        }
        
        // synchronized(color) - won't work because color is local variable
        synchronized(this) {
            for (int i = 10; i > 0; i--)
                System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
        }
    }
}
