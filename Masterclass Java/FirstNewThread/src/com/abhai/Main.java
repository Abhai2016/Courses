package com.abhai;

import static com.abhai.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_YELLOW + "Message from the main thread");

        new Thread(() -> System.out.println(ANSI_RED + "Message from the anonymous class thread")).start();

        AnotherThread anotherThread = new AnotherThread();
        anotherThread.setName("==== Another Thread ===");
        anotherThread.start();
        // anotherThread.interrupt();

        new Thread(new MyRunnable() {
            @Override
            public void run() {
                // super.run();
                System.out.println(ANSI_PURPLE + "Message from the anonymous MyRunnable class");
                try {
                    //anotherThread.join(); // waits until anotherThread terminates
                    anotherThread.join(1000); // waits until anotherThread terminates or time runs out
                    System.out.println(ANSI_PURPLE + "Another thread terminated or time ran out so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_PURPLE + "Couldn't wait after all. So I woke up.");
                }

            }
        }).start();

        //Thread thread = new Thread(new MyRunnable());
        //thread.start();

        System.out.println(ANSI_YELLOW + "Another message from the main thread");
    }
}
