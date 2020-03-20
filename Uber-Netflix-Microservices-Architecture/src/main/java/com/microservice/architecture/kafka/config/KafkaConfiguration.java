package com.microservice.architecture.kafka.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.ConsumerFactory;

@EnableKafka
@Configuration
public class KafkaConfiguration {

	
	@Bean
	public  ConsumerFactory<String,String> consumerFactory(){
		
		
		Map<String, Object> config=new HashMap<>();
		
		
	}
}
