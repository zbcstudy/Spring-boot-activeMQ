package com.fyp.layim.activeMQ;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class LogConsumer {

    private static final Logger log = LoggerFactory.getLogger(LogConsumer.class);

    @JmsListener(destination = QueueName.LOG_QUEUE)
    public void receivedQueue(String msg) {
        log.info("have received message from " + QueueName.LOG_QUEUE + ", msg:" + msg);
    }
}
