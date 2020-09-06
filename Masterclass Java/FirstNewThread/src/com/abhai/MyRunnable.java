package com.abhai;

import static com.abhai.ThreadColor.*;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_PURPLE + "Message from the MyRunnable class");
    }
}
