package com.fyp.layim.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            Runnable runnable = CoreThread.threadInstance(i);
            service.execute(runnable);
        }
        service.shutdown();
        System.out.println("thread Main end");
    }
}
