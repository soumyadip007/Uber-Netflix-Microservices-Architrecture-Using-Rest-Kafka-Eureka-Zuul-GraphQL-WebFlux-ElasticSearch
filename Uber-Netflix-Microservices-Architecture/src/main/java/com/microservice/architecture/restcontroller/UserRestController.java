package com.microservice.architecture.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.architecture.entity.Microservices;
import com.microservice.architecture.service.MicroserviceService;

@CrossOrigin(origins ="*",allowedHeaders="*",maxAge=200000) 
@RestController
@RequestMapping("/user")
public class UserRestController {

	
	private MicroserviceService GA4GHService;
	

	@Autowired   
	public UserRestController(MicroserviceService GA4GHService)
	{
		this.GA4GHService=GA4GHService;
	}
	

	@GetMapping
	public List<Microservices> FindAll() {
	
		return GA4GHService.findAll();
	}
	
	@GetMapping("/{pageNo}")
	public List<Microservices> FindPage(@PathVariable int pageNo) {
	
		List<Microservices> list = GA4GHService.findPage(pageNo,100, "id");
		
		return list;
	}
	
	@GetMapping("/{pageNo}/{pageSize}")
	public List<Microservices> FindPageWithSize(@PathVariable int pageNo,
								@PathVariable int pageSize) {
	
		List<Microservices> list = GA4GHService.findPage(pageNo,pageSize, "id");
		
		return list;
	}
	
	@GetMapping("/{pageNo}/sort/{sort}")
	public List<Microservices> FindPageWithSorting(@PathVariable int pageNo,
								@PathVariable String sort) {
	
		List<Microservices> list = GA4GHService.findPage(pageNo,100, sort);
		
		return list;
	}
	
	
	
	@GetMapping("/{pageNo}/{pageSize}/{sort}")
	public List<Microservices> FindPageWithLimitAndSorting(@PathVariable int pageNo,
								@PathVariable int pageSize,
								@PathVariable String sort) {
	
		List<Microservices> list = GA4GHService.findPage(pageNo,pageSize,sort);
		
		return list;
	}
	
	@GetMapping("/limit/{pageSize}")
	public List<Microservices> FindLimit(@PathVariable int pageSize) {
	
		List<Microservices> list = GA4GHService.findPage(0,pageSize,"id");
		
		return list;
	}
	

	@GetMapping("/limit/{pageSize}/{sort}")
	public List<Microservices> FindLimitWithSort(@PathVariable int pageSize,
									@PathVariable String sort) {
	
		List<Microservices> list = GA4GHService.findPage(0,pageSize,sort);
		
		return list;
	}
	
	
	@GetMapping("/id/{theId}")
	public Microservices findById(@PathVariable int theId) {
		
		return GA4GHService.findById(theId);
	}
	
	@GetMapping("/sequencename/{theId}")
	public List<Microservices> findBySequence_Name(@RequestHeader("key") String language,
			@PathVariable String theId) {
		System.out.println(language);
		System.out.println(language);
		System.out.println(language);
		System.out.println(language);
		System.out.println(language);
		
		if(language.equals("ga4ahapisecuritykey"))
			return GA4GHService.findBySequence_Name(theId);
		
		return null;
		

	}

	@GetMapping("/genbank/{theId}")
	public List<Microservices> findByGenBank_Accn(@RequestHeader("key") String language,
			@PathVariable String theId) {
		
		System.out.println(language);
		System.out.println(language);
		System.out.println(language);
		System.out.println(language);
		System.out.println(language);
		
		if(language.equals("ga4ahapisecuritykey"))
			return GA4GHService.findBySequence_Name(theId);
		
		return null;
	}

	@GetMapping("/refseq/{theId}")
	public List<Microservices> findByRefseq_Accn(@PathVariable String theId) {
		
		return GA4GHService.findByRefseq_Accn(theId);
	}
	
	@GetMapping("/sequencelength/{theId}")
	public List<Microservices> findBySequencelength(@PathVariable String theId) {
		
		return GA4GHService.findBySequencelength(theId);
	}
	

}
