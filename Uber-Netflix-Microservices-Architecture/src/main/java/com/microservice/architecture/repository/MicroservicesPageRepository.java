package com.microservice.architecture.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.microservice.architecture.entity.Microservices;

@Repository
public interface GA4GHPageRepository extends PagingAndSortingRepository<Microservices, Integer> {

}
