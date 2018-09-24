package com.poc.soa.namespace;

import static java.lang.System.out;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class CatalogTestRequestNoJava {

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

			SOAPMessage request = MessageFactory.newInstance().createMessage();

			// obtendo a composição da soapMessage
			SOAPPart soapPart = request.getSOAPPart();
			SOAPEnvelope env = soapPart.getEnvelope();
			SOAPBody body = env.getBody();

			String iNs = "http://ns.soacookbook.com/catalog";
			String elementName = "isbn";
			QName isbnQName = new QName(iNs, elementName);

			body.addBodyElement(isbnQName).setValue("12345");

			// debug print what we're sending
			request.writeTo(out);

			out.println("\nInvoking...");

			SOAPMessage response = dispatch.invoke(request);

			Document doc = response.getSOAPBody().extractContentAsDocument();

			NodeList isbnNodes = (NodeList) doc.getElementsByTagName("lastName");

			String value = isbnNodes.item(0).getTextContent();
			out.println("\nAuthor LastName=" + value);
			
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
