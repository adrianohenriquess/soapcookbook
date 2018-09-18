package com.poc.soa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _Book_QNAME = new QName("http://ns.soacookbook.com/venetianblind", "book");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.poc.soa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookType }
     * 
     */
    public BookType createBookType() {
        return new BookType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.soacookbook.com/venetianblind", name = "book")
    public JAXBElement<BookType> createBook(BookType value) {
        return new JAXBElement<BookType>(_Book_QNAME, BookType.class, null, value);
    }

}
