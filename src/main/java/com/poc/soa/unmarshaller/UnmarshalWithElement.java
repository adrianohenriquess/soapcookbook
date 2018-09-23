package com.poc.soa.unmarshaller;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import com.poc.soa.marshal.Book;

public class UnmarshalWithElement {
	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Book.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		StringReader reader = new StringReader(getBookXml());
		
		JAXBElement<Book> b = unmarshaller.unmarshal(new StreamSource(reader), Book.class);
		
		Book book = b.getValue();
		
		System.out.println("Title: " + book.getTitle());
		System.out.println("Author: " + book.getAuthor().getFirstName());
	}
	
	private static String getBookXml(){
		return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
				+ "<book>"
					+ "<author>"
						+ "<firstName>Jacques</firstName>"
						+ "<lastName>Derrida</lastName>"
					+ "</author>"
					+ "<category>PHILOSOPHY</category>"
					+ "<price>34.95</price>"
					+ "<title>Of Grammatology</title>"
				+ "</book>";
		}
}
