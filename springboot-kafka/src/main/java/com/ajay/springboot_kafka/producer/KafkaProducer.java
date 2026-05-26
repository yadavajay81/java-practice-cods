package com.ajay.springboot_kafka.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.ajay.springboot_kafka.model.Event;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
public class KafkaProducer {
    
    private final KafkaTemplate<String, Event> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, Event> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, Event event) {
        kafkaTemplate.send(topic, event.getId(), event)
        .whenComplete((result, ex) -> {
            if (ex == null) {
                System.out.println("Sent message=[" + event + "] with offset=[" + 
                    result.getRecordMetadata().offset() + "]");
            } else {
                System.out.println("Failed to send message=[" + event + "] due to : " + 
                    ex.getMessage());
            }
        });
    }
}