package com.fyp.layim.activeMQ;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.util.ArrayList;

@Component
public class LogProducer implements CommandLineRunner{

    private static final Logger log = LoggerFactory.getLogger(LogProducer.class);

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue logQueue;

    @Override
    public void run(String... args) throws Exception {
        send("this is a log message");
        log.info("log message was sent to the queue named sample.log");
    }

    public void send(String message) {

        this.jmsMessagingTemplate.convertAndSend(logQueue, message);
        ArrayList<String> strings = new ArrayList<>();
        //strings.for
        for (String string : strings) {

        }
        //strings.fori
        for (int i = 0; i < strings.size(); i++) {
            
        }
    }
}
