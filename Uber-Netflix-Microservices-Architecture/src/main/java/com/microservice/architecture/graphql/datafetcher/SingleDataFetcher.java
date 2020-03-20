package com.microservice.architecture.graphql.datafetcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microservice.architecture.entity.MS;
import com.microservice.architecture.repository.MicroservicesRepository;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class SingleDataFetcher implements DataFetcher {

	@Autowired
	MicroservicesRepository microserviceRepository;

	@Override
	public MS get(DataFetchingEnvironment environment) {
		
		String key= environment.getArgument("id");
		int i=Integer.parseInt(key);
		return microserviceRepository.findById(i);
	}

}
