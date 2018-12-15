package com.poc.soa.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class UserClient {

	private static String SERVICE_URL = "http://localhost:8080/soacookbook/rest/user/";

	public static void main(String[] args) {
		System.out.println("Creating new user.");
		createUser(777, "eben");

		getUser(777);

		System.out.println("All done.");
	}

	private static void createUser(int id, String username) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(SERVICE_URL + id);
		String userXml = "<?xml version='1.0' encoding='UTF-8' ?>" +
				 		 "<user>" +
				 		 	"<id>" + id + "</id>" +
				 		 	"<username>" + username + "</username>" +
				 		 "</user>";
		Response response = target.request().post(Entity.entity(userXml, MediaType.APPLICATION_XML));
		if (response.getStatus() == 200) {
			System.out.println("Sucesso: " + response.getStatus());
		}
		client.close();
	}

	private static void getUser(int id) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(SERVICE_URL + id);
		Response response = target.request().get();
		if (response.getStatus() == 200) {
			System.out.println("Sucesso: " + response.getStatus());
		}
		client.close();
	}
}
