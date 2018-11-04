package com.poc.soa.image.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://client.image.soa.poc.com")
public interface Image {
	
	@WebMethod
	public @WebResult(name="putResponse", targetNamespace="http://client.image.soa.poc.com") 
			String put(@WebParam(name="putData", targetNamespace="http://client.image.soa.poc.com")
			 byte[] binaryData);

}
