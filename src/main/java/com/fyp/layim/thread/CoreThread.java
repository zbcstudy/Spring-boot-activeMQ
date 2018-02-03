package com.fyp.layim.thread;

public class CoreThread {
    public static Runnable threadInstance(final int num) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("into: " + num);
                    Thread.sleep(1000);
                    System.out.println("end: " + num);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        return runnable;
    }
}
