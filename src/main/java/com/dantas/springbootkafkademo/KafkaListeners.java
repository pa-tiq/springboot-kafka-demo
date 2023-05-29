package com.dantas.springbootkafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "patiq", groupId = "patiqgroup")
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
