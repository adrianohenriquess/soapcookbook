package com.poc.soa.catalog.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://ns.soacookbook.com")
public interface Catalog {
	
	@WebMethod
	@WebResult(name = "title")
	String getTitle(@WebParam(name = "id") String id);
}
