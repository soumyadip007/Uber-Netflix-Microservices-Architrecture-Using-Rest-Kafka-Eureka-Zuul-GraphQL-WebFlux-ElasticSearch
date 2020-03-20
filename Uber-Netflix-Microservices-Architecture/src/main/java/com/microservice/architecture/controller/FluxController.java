package com.microservice.architecture.controller;

import java.time.Duration;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.architecture.entity.MS;
import com.microservice.architecture.service.MicroserviceService;

import reactor.core.publisher.Flux;

@RestController
public class FluxController {

	@GetMapping("/flux")
	public Flux<String> ga4ghFlux()
	{
		return Flux.just("Uber", "Netflix")
				.delayElements(Duration.ofSeconds(1))
				.log();
		
	}
	
	@GetMapping(value="/stream", produces = MediaType.APPLICATION_JSON_VALUE)
	public Flux<String> ga4ghFluxStream()
	{
		return Flux.just("Uber", "Netflix")
				.delayElements(Duration.ofSeconds(1))
				.log();
		
	}
}
