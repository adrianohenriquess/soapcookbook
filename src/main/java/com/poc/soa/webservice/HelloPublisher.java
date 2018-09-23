package com.poc.soa.webservice;

import javax.xml.ws.Endpoint;

public class HelloPublisher {
	public static final String URI = "http://localhost:9999/hello";
	
	public static void main(String[] args) {
		HelloWS hello = new HelloWS();
		
		Endpoint endpoint = Endpoint.publish(URI, hello);
		
		boolean status = endpoint.isPublished();
		
		System.out.println("Web service status = " + status);
	}
}
