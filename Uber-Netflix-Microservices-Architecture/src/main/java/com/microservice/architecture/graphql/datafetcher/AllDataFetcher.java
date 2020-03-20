package com.microservice.architecture.graphql.datafetcher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microservice.architecture.entity.Microservices;
import com.microservice.architecture.repository.MicroservicesRepository;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class AllDataFetcher implements DataFetcher {

	@Autowired
	MicroservicesRepository microserviceRepository;

	@Override
	public List<Microservices> get(DataFetchingEnvironment environment) {
		
		return microserviceRepository.findAll();
	}
	
	
}
