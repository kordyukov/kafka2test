package com.example.kafka2test.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
    @KafkaListener(
            id = "id",
            topics = "myTopic",
            properties = {"bootstrap.server=localhost:9092"}
    )
    public void listen(ConsumerRecord data) {
        System.out.println("!!! "+data.value());
    }
}
