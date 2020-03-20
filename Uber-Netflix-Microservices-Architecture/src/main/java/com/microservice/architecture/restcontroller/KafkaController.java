//package com.microservice.architecture.restcontroller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("Kafka")
//public class KafkaController {
//
//
//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;
//
//    private static final String TOPIC = "Kafka1";
//
//
//    @GetMapping
//    public String kafka1() {
//
//        kafkaTemplate.send(TOPIC, "Kafka");
//
//        return "Published successfully";
//    }
//	
//}
