package com.dantas.springbootkafkademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringbootKafkaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafkaDemoApplication.class, args);
	}

	/*
	 * this sends a message to the Kafka Broker. to consume this message via
	 * terminal, use this command inside of the kafka folder:
	 * bin/kafka-console-consumer.sh --topic dantas --from-beginning
	 * --bootstrap-server localhost:9092
	 * we also have the KafkaListeners class with the consumer.
	 */
	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
		return args -> {
			kafkaTemplate.send("patiq", "hi, Kafka! :)");
		};
	}

}
