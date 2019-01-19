package com.poc.soa.rest.exception;

import java.io.File;
import java.io.FileNotFoundException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("exception")
public class ExceptionService {

	@GET
	public Response doGet() throws FileNotFoundException {
		File file = new File("/path/doesnt/exist/file.txt");
		if (!file.exists()) {
			System.out.println("Couln't find file");
			throw new FileNotFoundException("My custom message");
		}
		Response response = Response.ok(file).build();
		return response;
	}
	
}
