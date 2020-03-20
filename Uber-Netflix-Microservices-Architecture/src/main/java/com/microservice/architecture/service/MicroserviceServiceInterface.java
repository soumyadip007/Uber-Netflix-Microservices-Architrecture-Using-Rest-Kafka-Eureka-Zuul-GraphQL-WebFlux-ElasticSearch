package com.microservice.architecture.service;

import java.util.List;

import com.microservice.architecture.entity.Microservices;

public interface MicroserviceServiceInterface {

	public List<Microservices> findAll();

	public void save(Microservices OBJ);
	
	public void deleteById(int theId);
	
	public Microservices findById(int theId);

	public List<Microservices> findByMicroentity1(String seq);
}
