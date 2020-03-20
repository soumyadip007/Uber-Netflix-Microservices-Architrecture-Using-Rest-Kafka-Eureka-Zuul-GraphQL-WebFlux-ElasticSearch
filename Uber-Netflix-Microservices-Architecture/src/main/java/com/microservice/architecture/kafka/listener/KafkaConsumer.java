package com.microservice.architecture.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	
	@KafkaListener(topics="Kafka1",groupId="string")
	public void consume(String msg)
	{
		System.out.println("Consumed message "+msg);
	}
}
