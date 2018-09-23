package com.poc.soa.namespace;

import static java.lang.System.out;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceException;

public class CatalogTest {

	public static void dispatchMsgIsbnTest() throws SOAPException {
		try {
			URL wsdl = new URL("http://localhost:8080/soacookbook/CatalogService/Catalog?wsdl");
			String ns = "http://ns.soacookbook.com/ws/catalog";
			String serviceName = "CatalogService";
			QName serviceQName = new QName(ns, serviceName);

			Service service = Service.create(wsdl, serviceQName);

			String portName = "CatalogPort";
			QName portQName = new QName(ns, portName);

			Dispatch<SOAPMessage> dispatch = service.createDispatch(portQName, SOAPMessage.class, Service.Mode.MESSAGE);

			String dataFile = "isbnMsg.txt";

			FileInputStream fileInputStream = new FileInputStream(dataFile);

			SOAPMessage request = MessageFactory.newInstance().createMessage(null, fileInputStream);
			request.writeTo(out);

			out.println("\nInvoking...");

			SOAPMessage response = dispatch.invoke(request);
			
			response.writeTo(System.out);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (WebServiceException wsex) {
			wsex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SOAPException {
		dispatchMsgIsbnTest();
	}

}
