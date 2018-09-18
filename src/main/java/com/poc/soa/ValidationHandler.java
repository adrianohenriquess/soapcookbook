package com.poc.soa;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class ValidationHandler extends DefaultHandler {
	private boolean valid = true;
	private SAXException se;
	
	@Override
	public void error(SAXParseException se) throws SAXException {
		this.se = se;
		valid = false;
		throw se;
	}
	
	/**
	* The default implementation does nothing.
	*/
	@Override
	public void fatalError(SAXParseException se) throws SAXException {
		this.se = se;
		valid = false;
		throw se;		
	}

	public boolean isValid() {
		return valid;
	}
}
