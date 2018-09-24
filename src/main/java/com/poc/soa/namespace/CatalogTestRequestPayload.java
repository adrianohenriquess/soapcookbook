package com.poc.soa.namespace;

import static java.lang.System.out;

import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NodeList;

public class CatalogTestRequestPayload {

	public static void dispatchMsgIsbnTest() throws SOAPException {
		try {
			URL wsdl = new URL("http://localhost:8080/soacookbook/CatalogService/Catalog?wsdl");
			String ns = "http://ns.soacookbook.com/ws/catalog";
			String serviceName = "CatalogService";
			QName serviceQName = new QName(ns, serviceName);

			Service service = Service.create(wsdl, serviceQName);

			String portName = "CatalogPort";
			QName portQName = new QName(ns, portName);

			Dispatch<Source> dispatch = service.createDispatch(portQName, Source.class, Service.Mode.PAYLOAD);

			String payload = "<i:isbn xmlns:i='http://ns.soacookbook.com/catalog'>12345</i:isbn>";
			// Create a SOAP request based on our XML string
			StreamSource request = new StreamSource(new StringReader(payload));

			out.println("\nInvoking...");
			
			Source bookResponse = dispatch.invoke(request);

			 //Now we have to transform our result source object
			 //into a DOM tree to work with it
			 DOMResult dom = new DOMResult();
			 Transformer trans = TransformerFactory.newInstance().newTransformer();
			 trans.transform(bookResponse, dom);

			 //Extract values with XPath
			 XPathFactory xpf = XPathFactory.newInstance();
			 XPath xp = xpf.newXPath();
			 NodeList resultNodes = (NodeList) xp.evaluate("//title", dom.getNode(), XPathConstants.NODESET);
			 
			 String title = resultNodes.item(0).getTextContent();
			 out.println("TITLE=" + title);

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
