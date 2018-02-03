package com.fyp.layim.config;

import com.fyp.layim.activeMQ.QueueName;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

@Configuration
public class QueueConfig {

    @Bean
    public Queue logQueue() {
        return new ActiveMQQueue(QueueName.LOG_QUEUE);
    }
}
