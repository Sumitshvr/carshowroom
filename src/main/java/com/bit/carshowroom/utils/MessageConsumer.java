package com.bit.carshowroom.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    @KafkaListener(topics = "my-topic",groupId = "my-group-id")
    public void recieve(String message)
    {
        System.out.println(message);
    }
}
