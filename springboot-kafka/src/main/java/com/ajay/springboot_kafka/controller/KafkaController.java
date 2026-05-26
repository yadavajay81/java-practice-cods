package com.ajay.springboot_kafka.controller;

import org.springframework.web.bind.annotation.*;

import com.ajay.springboot_kafka.model.Event;
import com.ajay.springboot_kafka.producer.KafkaProducer;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    public KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public String publishMessage(@RequestBody Event event) {
        kafkaProducer.sendMessage("my-topic", event);
        return "Message sent successfully!";
    }
}