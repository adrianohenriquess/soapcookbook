package com.poc.soa.rest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("/product1/{id}")
public class ProductQuery {

	@Context
	private UriInfo context;

	public ProductQuery() {
	}

	@GET
	@Produces("text/xml")
	public String getProducts(@PathParam("id") int productId,
			@QueryParam("results") @DefaultValue("5") int numResults) {
		StringBuilder result = new StringBuilder("<products>");

		// return the number of results requested
		for (int i = 0; i < numResults; i++) {
			result.append("<p>Product " + i + "</p>");
		}
		result.append("</products>");
		return result.toString();
	}
}
