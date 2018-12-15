package com.poc.soa.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("/products/{id}")
//Para tres digitos no minimo, senao não faz consulta
//@Path("/products/{id: \\d{3}}")
public class ProductResource {

	@Context
	private UriInfo context;
	
	public ProductResource() {}
	
	@GET
	@Produces("text/plain")
	public String getProduct(@PathParam("id") int productId) {
		switch (productId) {
		case 1: return "A Shiny New Bike";
		case 2: return "Big Wheel";
		case 3: return "Taser: Toddler Edition";
		default: return "No such product";
		}
	}
}
