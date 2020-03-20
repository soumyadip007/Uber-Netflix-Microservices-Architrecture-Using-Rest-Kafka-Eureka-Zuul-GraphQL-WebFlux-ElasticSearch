package com.microservice.architecture.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.architecture.entity.Microservices;


@Repository("GA4GHRepository")
public interface MicroservicesRepository extends JpaRepository<Microservices, Integer> {

	public Microservices findById(int id);
	
	public List<Microservices> findBySequencename(String seq);
	
	public List<Microservices> findByGenbankaccn(String seq);
	
	public List<Microservices> findByRefseqaccn(String seq);
	
	public List<Microservices> findBySequencelength(String seq);
}
