package com.poc.soa.image.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(serviceName = "ImageService", name = "Image", targetNamespace = "http://client.image.soa.poc.com")
public class ImageWS implements Image {

	@WebMethod
	@SOAPBinding(parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
	public @WebResult(name="putResponse", 
					  targetNamespace="http://client.image.soa.poc.com") 
			String put(@WebParam(name="putData", 
					             targetNamespace="http://client.image.soa.poc.com")
			byte[] binaryData) {
		System.out.println(binaryData.length);
		System.out.println(binaryData);
		return "do Work!";
	}

}
