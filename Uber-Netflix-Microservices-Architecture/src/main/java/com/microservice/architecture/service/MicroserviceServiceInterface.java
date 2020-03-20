package com.microservice.architecture.service;

import java.util.List;

import com.microservice.architecture.entity.Microservices;

public interface MicroserviceServiceInterface {

	public List<Microservices> findAll();

	public void save(Microservices OBJ);
	
	public void deleteById(int theId);
	
	public Microservices findById(int theId);

	public List<Microservices> findBySequence_Name(String seq);
	
	public List<Microservices> findByGenBank_Accn(String seq);
	
	public List<Microservices> findByRefseq_Accn(String seq);
	
	public List<Microservices> findBySequencelength(String seq);
}
