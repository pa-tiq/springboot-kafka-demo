package com.dantas.api;

import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dantas.models.MessageRequest;

@RestController
@RequestMapping
public class MessageController {

    private KafkaTemplate<String, String> kafkaTemplate;

    public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    // this API will listen to POST requests and publish the received messages
    // to the given topic in Kafka
    @PostMapping(value = "/post")
    public void publish(@RequestBody MessageRequest request) {
        kafkaTemplate.send("patiq", request.message());
    }

    // you can test this API by running the following code in your terminal:
    // curl -X POST http://localhost:8080/messages -H "Content-Type:
    // application/json" -d '{"message":"API with Kafka!"}'

    @GetMapping("/test")
    // @KafkaListener(topics = "patiq", groupId = "patiqgroup")
    public String getMethod() {
        return "oi";
    }
}
