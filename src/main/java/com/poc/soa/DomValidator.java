package com.poc.soa;

import static java.lang.System.out;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class DomValidator {
	private static final String SCHEMA_LANG_PROP = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
	private static final String XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";
	private static final String SCHEMA_SOURCE_PROP = "http://java.sun.com/xml/jaxp/properties/schemaSource";

	
	public static void main(String[] args) {
		String schema = "book_salamislice.xsd";
		String xmlDoc = "/soacookbook/src/main/resources/book.xml";
		boolean valid = validate(schema, xmlDoc);
		out.print("Valid? " + valid);
	}

	private static boolean validate(String schema, String xmlDoc) {
		DocumentBuilder builder = createDocumentBuilder(schema);
		ValidationHandler handler = new ValidationHandler();
		builder.setErrorHandler(handler);
		File docFile = new File(xmlDoc);
		try {
			builder.parse(docFile);
		} catch (SAXException se) {
			out.println("Validation Error: " + se.getMessage());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return handler.isValid();
	}

	/**
	 * Convenience method sets up the validating factory.
	 */
	private static DocumentBuilder createDocumentBuilder(String schema) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		factory.setValidating(true);
		factory.setAttribute(SCHEMA_LANG_PROP, XML_SCHEMA);
		factory.setAttribute(SCHEMA_SOURCE_PROP, schema);
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		}
		return builder;
		
	}
}
