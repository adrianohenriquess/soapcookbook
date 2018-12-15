package com.poc.soa.rest.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/helloRest")
public class HelloRest {

	
	@GET
	@Produces("text/html")
	public String sayHello() {
		return "<html><body><h1>Hello from REST!</body></h1></html>";
	}
}
