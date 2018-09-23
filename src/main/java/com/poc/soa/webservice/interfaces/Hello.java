package com.poc.soa.webservice.interfaces;

import javax.jws.WebService;

@WebService
public interface Hello {
	
	String sayHello(String name);

}
