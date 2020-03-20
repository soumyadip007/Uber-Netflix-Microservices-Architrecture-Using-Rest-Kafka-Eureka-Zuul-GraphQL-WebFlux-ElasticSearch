package com.microservice.architecture.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.architecture.entity.MS;
import com.microservice.architecture.service.MicroserviceService;

@CrossOrigin(origins ="*",allowedHeaders="*",maxAge=200000) 
@RestController
@RequestMapping("/user")
public class UserRestController {

	
	private MicroserviceService microservice;
	

	@Autowired   
	public UserRestController(MicroserviceService microservice)
	{
		this.microservice=microservice;
	}
	

	@GetMapping
	public List<MS> FindAll() {
	
		return microservice.findAll();
	}
	
	@GetMapping("/{pageNo}")
	public List<MS> FindPage(@PathVariable int pageNo) {
	
		List<MS> list = microservice.findPage(pageNo,100, "id");
		
		return list;
	}
	
	@GetMapping("/{pageNo}/{pageSize}")
	public List<MS> FindPageWithSize(@PathVariable int pageNo,
								@PathVariable int pageSize) {
	
		List<MS> list = microservice.findPage(pageNo,pageSize, "id");
		
		return list;
	}
	
	@GetMapping("/{pageNo}/sort/{sort}")
	public List<MS> FindPageWithSorting(@PathVariable int pageNo,
								@PathVariable String sort) {
	
		List<MS> list = microservice.findPage(pageNo,100, sort);
		
		return list;
	}
	
	
	
	@GetMapping("/{pageNo}/{pageSize}/{sort}")
	public List<MS> FindPageWithLimitAndSorting(@PathVariable int pageNo,
								@PathVariable int pageSize,
								@PathVariable String sort) {
	
		List<MS> list = microservice.findPage(pageNo,pageSize,sort);
		
		return list;
	}
	
	@GetMapping("/limit/{pageSize}")
	public List<MS> FindLimit(@PathVariable int pageSize) {
	
		List<MS> list = microservice.findPage(0,pageSize,"id");
		
		return list;
	}
	

	@GetMapping("/limit/{pageSize}/{sort}")
	public List<MS> FindLimitWithSort(@PathVariable int pageSize,
									@PathVariable String sort) {
	
		List<MS> list = microservice.findPage(0,pageSize,sort);
		
		return list;
	}
	
	
	@GetMapping("/id/{theId}")
	public MS findById(@PathVariable int theId) {
		
		return microservice.findById(theId);
	}
	
	@GetMapping("/microentity1/{theId}")
	public List<MS> findByMicroentity1(@RequestHeader("key") String language,
			@PathVariable String theId) {
		System.out.println(language);
		System.out.println(language);
		System.out.println(language);
		System.out.println(language);
		System.out.println(language);
		
		return null;
		

	}

	

}
