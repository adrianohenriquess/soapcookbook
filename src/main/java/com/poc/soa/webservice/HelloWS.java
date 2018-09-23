package com.poc.soa.webservice;

import javax.jws.WebService;

import com.poc.soa.webservice.interfaces.Hello;

@WebService(endpointInterface = "com.poc.soa.webservice.interfaces.Hello")
public class HelloWS implements Hello {

	@Override
	public String sayHello(String name) {
		return "Hello, " + name + "!";
	}

}
