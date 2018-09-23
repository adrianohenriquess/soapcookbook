package com.poc.soa.marshal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

import static java.lang.System.out;

public class MarshalToConsole {
	public static void main(String[] args) throws ParserConfigurationException {
		try {
			Book book = new Book();
			Author a = new Author();
			a.setFirstName("Jacques");
			a.setLastName("Derrida");
			book.setAuthor(a);
			book.setPrice(34.95);
			book.setTitle("Of Grammatology");
			book.setCategory(Category.PHILOSOPHY);
			Class[] c = { Book.class };
			JAXBContext ctx = JAXBContext.newInstance(c);
			Marshaller m = ctx.createMarshaller();
			// could also use System.out here
			m.marshal(book, out);
			out.println("\nAll done.");
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setNamespaceAware(true);
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.newDocument();
			
			m.marshal(book, doc);
			
			String title = doc.getDocumentElement().
					getElementsByTagName("title").item(0).getTextContent();
			
			out.println(title);
		} catch (JAXBException ex) {
			ex.printStackTrace();
		}
	}
}
