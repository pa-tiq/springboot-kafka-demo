package com.dantas.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean // add Bean so this gets instantiated and we get a new topic.
    public NewTopic dantasTopic() {
        return TopicBuilder.name("patiq").build();
    }

}