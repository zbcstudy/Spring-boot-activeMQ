package com.fyp.layim.controller;

import com.fyp.layim.activeMQ.LogProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ActiveMQController {

    @Autowired
    private LogProducer logProducer;

    @GetMapping("/activemq")
    @ResponseBody
    public String activeMQ(@RequestParam("msg") String msg) {
        if (msg == null || msg.trim().length() == 0) {
            msg = "this is null message";
        }
        logProducer.send(msg);

        return "message send success";
    }
}
