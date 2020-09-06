package com.abhai;

import static com.abhai.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Message from " + currentThread().getName() +  " class");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException interruptedException) {
            System.out.println("Interrupted by another thread: " + interruptedException.getMessage());
            return;
        }

        System.out.println(ANSI_BLUE + "3 seconds have passed so I'm awake");
    }
}
