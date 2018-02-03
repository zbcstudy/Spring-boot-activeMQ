package com.fyp.layim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;

/**
 * Created by wd on 2017/11/22.
 */
@SpringBootApplication
@ComponentScan
@EnableJms
public class layimApplication {
    public static void main(String[] args) {
        SpringApplication.run(layimApplication.class);
    }
}
