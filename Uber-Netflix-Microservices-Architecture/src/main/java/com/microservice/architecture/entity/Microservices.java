package com.microservice.architecture.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter	
@Setter	
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "microservice")
public class Microservices {



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;		


	@Column(name = "mincroentity1")
	private String mincroentity1;	
	
	@Column(name = "mincroentity2")
	private String mincroentity2;	
	
	@Column(name = "mincroentity3")
	private String mincroentity3;		
	

	@Column(name = "mincroentity4")
	private String mincroentity4;
}
