package com.fyp.layim.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            Runnable runnable = CoreThread.threadInstance(i);
            executor.execute(runnable);
        }
        executor.shutdown();
        System.out.println("thread Main end");
    }
}
