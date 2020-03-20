package com.microservice.architecture.kafka.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.microservice.architecture.entity.MS;

@EnableKafka
@Configuration
public class KafkaConfiguration {

	
	@Bean
	public  ConsumerFactory<String,String> consumerFactory(){
		
		
		Map<String, Object> config=new HashMap<>();
		
		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"120.0.0.1");
		config.put(ConsumerConfig.GROUP_ID_CONFIG,"group_id");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,"120.0.0.1");
		
		return new DefaultKafkaConsumerFactory<>(config);
	}
	
	@Bean
	public  ConsumerFactory<String,MS> consumerUser(){
		
		
		Map<String, Object> config=new HashMap<>();
		
		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"120.0.0.1");
		config.put(ConsumerConfig.GROUP_ID_CONFIG,"group_id");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,"120.0.0.1");
		
		return new DefaultKafkaConsumerFactory<>(config);
	}
}
