package com.microservice.architecture.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.microservice.architecture.entity.MS;

@Repository
public interface MicroservicesPageRepository extends PagingAndSortingRepository<MS, Integer> {

}
