package com.poc.soa.rest.form;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

@Path("/forms/user")
@Produces("text/html")
public class FormService {

	@GET
	public Response create() {
		return Response.ok(NEW_USER_FORM_HTML).build();
	}

	@POST
	@Consumes("application/x-www-form-urlencoded")
	@Produces("text/html")
	public Response doCreate(@FormParam("id")    String  id,
							 @FormParam("fname") String  fname,
							 @Context            UriInfo uriInfo) {
		User user = new User();
		user.setId(id);
		user.setName(fname);
		user.setCreatedDate(new Date());
		DataBase.users.put(id, user);
		// create URI here with entity response
		URI createdUri = UriBuilder.fromUri(uriInfo.getRequestUri().toString()).path("{a}").build(user.getId());
		System.out.println("Created URI: " + createdUri);
		Response response = Response.created(createdUri).entity(user).location(createdUri).build();
		return response;
	}

	@GET
	@Path("/{id}")
	public Response viewOne(@PathParam("id") String id) {
		User u = DataBase.users.get(id);
		StringBuilder sb = new StringBuilder("<html><body>");
		sb.append("<h1>View User Details</h1>");
		sb.append("User ID: ").append(u.getId()).append("<br/>");
		sb.append("Name: ").append(u.getName()).append("<br/>");
		sb.append(String.format("Created On: %1$tm.%1$te.%1$tY",
		u.getCreatedDate()) );
		sb.append("</body></html>");
		Response response = Response.ok(sb.toString()).build();
		System.out.println("Built response.");
		return response;
	}
	
	private static String NEW_USER_FORM_HTML = new StringBuilder("<html><body>")
			.append("<h1>Create User</h1>")
			.append("<form name='userForm' method='POST' action=''>")
			.append("ID: <input type='text' name='id' size='3' />").append("<br/>")
			.append("Name: <input type='text' name='fname' />").append("<br/>")
			.append("<input type='submit' name='submit' value='Create'/>").append("</form>").append("</body></html>")
			.toString();
}
