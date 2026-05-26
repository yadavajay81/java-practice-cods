package com.ajay.springboot_kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.ajay.springboot_kafka.model.Event;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void consume(Event event) {
        System.out.println("Consumed message: " + event.getMessage());
    }

    // Multiple topics
    @KafkaListener(topics = {"topic1", "topic2"}, groupId = "my-group-2")
    public void consumeMultiple(Event event) {
        System.out.println("Received: " + event.getMessage());
    }
}