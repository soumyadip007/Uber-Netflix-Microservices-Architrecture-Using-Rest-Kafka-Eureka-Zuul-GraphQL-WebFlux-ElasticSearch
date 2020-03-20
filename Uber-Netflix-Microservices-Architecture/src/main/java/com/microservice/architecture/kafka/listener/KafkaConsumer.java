//package com.microservice.architecture.kafka.listener;
//
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//import com.microservice.architecture.entity.MS;
//
//@Service
//public class KafkaConsumer {
//
//	
//	@KafkaListener(topics="Kafka1",groupId="string")
//	public void consumeString(String msg)
//	{
//		System.out.println("Consumed message "+msg);
//	}
//	
//	@KafkaListener(topics="Kafka2",groupId="json")
//	public void consumeMS(MS ms)
//	{
//		System.out.println("Consumed message "+ms);
//	}
//}
