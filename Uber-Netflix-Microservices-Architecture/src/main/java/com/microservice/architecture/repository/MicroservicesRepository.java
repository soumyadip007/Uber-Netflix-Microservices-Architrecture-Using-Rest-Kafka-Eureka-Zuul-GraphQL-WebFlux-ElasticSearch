package com.microservice.architecture.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.architecture.entity.Microservices;


@Repository("MicroservicesRepository")
public interface MicroservicesRepository extends JpaRepository<Microservices, Integer> {

	public Microservices findById(int id);

	public List<Microservices> findByMicroentity1(String seq);
}
