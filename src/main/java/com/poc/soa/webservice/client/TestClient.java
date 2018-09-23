package com.poc.soa.webservice.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

public class TestClient {
	
	public static void main(String[] args) throws MalformedURLException {
		URL wsdlLocation = new URL("http://localhost:8080/soacookbook/HelloWS?wsdl");
		QName serviceName = new QName("http://webservice.soa.poc.com/", "HelloWSService");
		HelloWSService service = new HelloWSService(wsdlLocation, serviceName);
		Hello port = service.getHelloWSPort();
		String hello = port.sayHello("Adriano");
		System.out.println(hello);
	}

}
