package com.microservice.architecture.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.architecture.graphql.service.GraphQLService;

import graphql.ExecutionResult;

@CrossOrigin(origins ="*",allowedHeaders="*",maxAge=200000) 
@RestController
@RequestMapping("/micro")
public class GraphQLController {

	@Autowired
    GraphQLService graphQLService;
	
	 @PostMapping
	 public ResponseEntity<Object> graph(@RequestBody String query) {
	        ExecutionResult execute = graphQLService.getGraphQL().execute(query);

	        return new ResponseEntity<>(execute, HttpStatus.OK);
	    }
}
