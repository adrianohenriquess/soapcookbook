package com.poc.soa.rest.exception;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("statuscode")
public class CustomStatusCode {

	@GET
	public Response doGet() {
		ResponseBuilder responseBuilder = Response.status(Response.Status.BAD_REQUEST);
		Response response = responseBuilder.build();
		throw new WebApplicationException(response);
	}
}
