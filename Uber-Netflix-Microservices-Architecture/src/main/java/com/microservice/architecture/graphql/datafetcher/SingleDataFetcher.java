package com.microservice.architecture.graphql.datafetcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microservice.architecture.entity.Microservices;
import com.microservice.architecture.repository.GA4GHRepository;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class DataFetcher implements DataFetcher {

	@Autowired
	GA4GHRepository ga4ghRepository;

	@Override
	public Microservices get(DataFetchingEnvironment environment) {
		
		String key= environment.getArgument("id");
		int i=Integer.parseInt(key);
		return ga4ghRepository.findById(i);
	}

}
