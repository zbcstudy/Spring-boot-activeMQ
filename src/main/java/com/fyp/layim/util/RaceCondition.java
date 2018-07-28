package com.fyp.layim.util;

public class RaceCondition {

    private static boolean tag;

    public static void main(String[] args) {
        new Thread(() -> {
            int i = 0;
            while (tag) {
                i++;
            }
            System.out.println("Done!" + i);

        }).start();

        System.out.println("os: "+ System.getProperty("os.name"));
        //获取系统可用的核心处理数
        System.out.println(Runtime.getRuntime().availableProcessors());
        try {
            Thread.sleep(2000l);
            tag = true;
            System.out.println("flag done set to true");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
