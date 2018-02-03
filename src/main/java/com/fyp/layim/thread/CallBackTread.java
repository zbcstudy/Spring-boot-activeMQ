package com.fyp.layim.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallBackTread {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        sonTask sonTask = new sonTask("thread son1");
        FutureTask<String> task = new FutureTask<String>(sonTask);
        new Thread(task).start();
        System.out.println(task.get());

        FutureTask task1 = new FutureTask(new myTask(),22);
        new Thread(task1).start();
        System.out.println("result_"+task1.get());
    }


    static class sonTask implements Callable<String>{

        private String name = "";

        sonTask(String name) {
            this.name = name;
        }

        @Override
        public String call() throws Exception {
            Thread.sleep(1000l);
            System.out.println(name + ": 任务执行完成");
            return "result_1";
        }
    }

    static class myTask implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(2000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("任务2执行完成");
        }
    }

}
