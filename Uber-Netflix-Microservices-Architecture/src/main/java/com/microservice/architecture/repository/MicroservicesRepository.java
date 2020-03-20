package com.microservice.architecture.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.architecture.entity.MS;


@Repository("MicroservicesRepository")
public interface MicroservicesRepository extends JpaRepository<MS, Integer> {

	public MS findById(int id);

	//public List<Microservices> findBymicroentity1(String seq);
}
