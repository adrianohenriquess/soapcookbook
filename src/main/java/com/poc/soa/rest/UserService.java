package com.poc.soa.rest;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.poc.soa.entity.User;

@Path("/user/{id}")
@Singleton
public class UserService {

	private Map<Integer, User> userDatabase;

	public UserService() {
		userDatabase = new HashMap<>();
	}

	@POST
	@Consumes("application/xml")
	public Response postUser(User user) {
		System.out.println("Post User");
		userDatabase.put(user.getId(), user);

		URI createdURI = UriBuilder.fromPath("user/" + user.getId()).build(user);

		System.out.println("post: createdUri: " + createdURI);

		// return a 201 'created' status
		return Response.created(createdURI).build();
	}

	@GET
	public Response getUser(@PathParam("id") int id) {
		System.out.println("Get User.");
		// get from database...
		User user = userDatabase.get(id);
		Response.ResponseBuilder responseBuilder = Response.ok(user).entity(user);
		Response response = responseBuilder.build();
		System.out.println("get: Found User: " + user);
		return response;
	}
}
