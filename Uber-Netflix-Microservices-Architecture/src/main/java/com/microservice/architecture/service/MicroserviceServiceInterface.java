package com.microservice.architecture.service;

import java.util.List;

import com.microservice.architecture.entity.MS;

public interface MicroserviceServiceInterface {

	public List<MS> findAll();

	public void save(MS OBJ);
	
	public void deleteById(int theId);
	
	public MS findById(int theId);

	//public List<Microservices> findByMicroentity1(String seq);
}
