package com.poc.soa.rest.form;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Produces("text/html")
@Provider
public class UserHtmlWriter implements MessageBodyWriter<User> {

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return User.class.isAssignableFrom(type);
	}

	@Override
	public long getSize(User t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return -1;
	}

	@Override
	public void writeTo(User user, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders, OutputStream out)
			throws IOException, WebApplicationException {
		System.out.println("writeTo.");
		StringBuilder sb = new StringBuilder("<html><body>");
		sb.append("<h1>User</h1>");
		sb.append("User ID: ").append(user.getId()).append("<br/>");
		sb.append("Name: ").append(user.getName()).append("<br/>");
		sb.append(String.format("Created On: %1$tm.%1$te.%1$tY", user.getCreatedDate()));

		sb.append("<h2>View Another User</h2>");
		int count = 0;
		for (User u : DataBase.users.values()) {
			sb.append("<a href='user/").append(u.getId());
			sb.append("'>");
			sb.append(u.getName()).append("</a> has ID ");
			sb.append(u.getId());
			sb.append("<br />");
			count++;
		}
		sb.append("There are ").append(count).append(" users.");
		// will create another GET request
		sb.append("<br/><br/><a href=''>Create Another User</a>");
		sb.append("</body></html>");
		
		out.write(sb.toString().getBytes());
	}

}
