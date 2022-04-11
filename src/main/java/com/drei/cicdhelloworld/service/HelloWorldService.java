package com.drei.cicdhelloworld.service;

import org.springframework.stereotype.Service;

import com.drei.cicdhelloworld.model.HelloCiCdWorldModel;

@Service
public class HelloWorldService {

	public HelloCiCdWorldModel HelloCiCdWorld() {
		HelloCiCdWorldModel model = new HelloCiCdWorldModel();
		model.setMessage("Hello CiCd World");
		return(model);
	}

}
