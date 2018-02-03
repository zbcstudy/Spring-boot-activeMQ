package com.fyp.layim.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            Runnable runnable = CoreThread.threadInstance(i);
            executorService.execute(runnable);
        }
        executorService.shutdown();
        System.out.println("thread Main end");
    }
}
