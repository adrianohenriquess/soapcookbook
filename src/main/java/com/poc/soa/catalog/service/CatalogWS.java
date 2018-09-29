package com.poc.soa.catalog.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.poc.soa.catalog.service.Catalog;

@WebService(serviceName = "CatalogService", name = "Catalog", targetNamespace = "http://ns.soacookbook.com")
public class CatalogWS implements Catalog {

	public CatalogWS() {}

	@Override
	@WebMethod
	public @WebResult(name = "title") String getTitle(@WebParam(name = "id") String id) {
		if ("12345".equals(id))
			return "Hamlet";
		if ("98765".equals(id))
			return "King Lear";
		if ("55555".equals(id))
			return "Macbeth";

		return "--Item not in catalog--";
	}

}
