package com.microservice.architecture.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.microservice.architecture.entity.Microservices;

@Repository
public interface MicroservicesPageRepository extends PagingAndSortingRepository<Microservices, Integer> {

}
