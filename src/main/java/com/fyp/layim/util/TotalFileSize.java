package com.fyp.layim.util;

import java.io.File;

public class TotalFileSize {

    public long getFileTotalSize(final File file) {

        if (file.isFile()) {
            return file.length();
        }

        File[] childrenFiles = file.listFiles();
        long total = 0;
        if (childrenFiles != null) {
            for (File childrenFile : childrenFiles) {
                if (childrenFile.isFile()) {
                    total += getFileTotalSize(childrenFile);
                }
            }
        }
        return total;
    }


    public static void main(String[] args) {
        String path = "G:\\文档";
        long start = System.currentTimeMillis();
        File file = new File(path);
        TotalFileSize totalFileSize = new TotalFileSize();
        long fileTotalSize = totalFileSize.getFileTotalSize(file);
        long end = System.currentTimeMillis();
        System.out.println("花费的时间是：" + (end - start) + "ms");
        System.out.println(fileTotalSize);
    }
}
