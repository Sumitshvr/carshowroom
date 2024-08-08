package com.bit.carshowroom.controller;

import com.bit.carshowroom.utils.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaContrller {
    @Autowired
    MessageProducer producer;
    @PostMapping(value = "/send")
    public String sendMessage(@RequestParam("message") String message)
    {
        producer.sendMessage("my-topic",message);
        return "Message sent : "+message;
    }
}




