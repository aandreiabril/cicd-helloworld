package com.drei.cicdhelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drei.cicdhelloworld.model.HelloCiCdWorldModel;
import com.drei.cicdhelloworld.service.HelloWorldService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/v1/cicdHelloWorld")
public class Controller {
	
	private final HelloWorldService service;
	
	public Controller(HelloWorldService service) {
		this.service = service;
	}
	
	@GetMapping
	public HelloCiCdWorldModel HelloCiCdWorld() {
		log.info("in helloCiCdWorld service");
		return(service.HelloCiCdWorld());
	}
	

}
