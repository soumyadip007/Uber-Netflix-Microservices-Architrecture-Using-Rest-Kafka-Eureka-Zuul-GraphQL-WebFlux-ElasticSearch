package com.microservice.architecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
public class UberNetflixMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberNetflixMicroservicesApplication.class, args);
	}

}
