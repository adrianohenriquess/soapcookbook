package com.poc.soa;

import static java.lang.System.out;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class UpdateXMLValue {

	public static void main(String[] args) throws Exception {
		InputStream xmlSource = UpdateXMLValue.class.getResourceAsStream("CatalogEJB.xml");

		// find the book titled 'Hamlet' and select its price.
		String xpath = "/catalog/book[title='Hamlet']/price";

		String value = "8.95";

		// we're throwing any exception out
		updateValueInXmlFile(xmlSource, xpath, value);

		out.println("All done.");
	}

	private static void updateValueInXmlFile(InputStream fileIn, String xpathExpression, String newValue)
			throws IOException {
		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {
			final DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(fileIn);
			final XPath xpath = XPathFactory.newInstance().newXPath();
			NodeList nodes = (NodeList) xpath.evaluate(xpathExpression, document, XPathConstants.NODESET);

			// Update the nodes we found
			for (int i = 0, len = nodes.getLength(); i < len; i++) {
				Node node = nodes.item(i);
				node.setTextContent(newValue);
			}
			
			// Get file ready to write
			final Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			StreamResult result = new StreamResult(new FileWriter("Catalog2.xml"));
			transformer.transform(new DOMSource(document), result);
			
			// Write file out
			result.getWriter().flush();
			result.getWriter().close();

		} catch (XPathExpressionException xpee) {
			out.println(xpee);
			throw new IOException("Cannot parse XPath.", xpee);
		} catch (DOMException dome) {
			out.println(dome);
			throw new IOException("Cannot create DOM tree", dome);
		} catch (TransformerConfigurationException tce) {
			out.println(tce);
			throw new IOException("Cannot create transformer.", tce);
		} catch (IllegalArgumentException iae) {
			out.println(iae);
			throw new IOException("Illegal Argument.", iae);
		} catch (ParserConfigurationException pce) {
			out.println(pce);
			throw new IOException("Cannot create parser.", pce);
		} catch (SAXException saxe) {
			out.println(saxe);
			throw new IOException("Error reading XML document.", saxe);
		} catch (TransformerFactoryConfigurationError tfce) {
			out.println(tfce);
			throw new IOException("Cannot create trx factory.", tfce);
		} catch (TransformerException te) {
			out.println(te);
			throw new IOException("Cannot write values.", te);
		}
	}

}
