package com.poc.soa.namespace;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.poc.soa.marshal.Author;
import com.poc.soa.marshal.Book;
import com.poc.soa.marshal.Category;

@WebService(serviceName = "CatalogService", 
			name = "Catalog", 
			targetNamespace = "http://ns.soacookbook.com/ws/catalog")
@Stateless
@Local
public class CatalogEJB {

	private Logger logger = Logger.getLogger(CatalogEJB.class.getName());

	@WebMethod
	@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, 
	             use = SOAPBinding.Use.LITERAL, 
			     parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public @WebResult(name = "book", targetNamespace = "http://ns.soacookbook.com/catalog") Book getBook(
		   @WebParam(name = "isbn", targetNamespace = "http://ns.soacookbook.com/catalog") String isbn) {
		logger.info("Executing. ISBN=" + isbn);
		Book book = new Book();

		if ("12345".equals(isbn)) {
			logger.info("Search by ISBN: " + isbn);
			book.setTitle("King Lear");
			Author shakespeare = new Author();
			shakespeare.setFirstName("William");
			shakespeare.setLastName("Shakespeare");
			book.setAuthor(shakespeare);
			book.setCategory(Category.LITERATURE);
			book.setIsbn("12345");
		} else {
			logger.info("Search by ISBN: " + isbn + ". NO RESULTS.");
		}
		
		logger.info("Returning book: " + book.getTitle());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
		return book;
	}

}
