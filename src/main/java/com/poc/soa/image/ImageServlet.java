package com.poc.soa.image;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

import org.apache.commons.io.IOUtils;

import com.poc.soa.image.client.Image;
import com.poc.soa.image.client.ImageService;

@WebServlet(urlPatterns = "/ImageServlet")
public class ImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@WebServiceRef(type = Image.class)
	private ImageService service;

	public ImageServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Image port = service.getImagePort();

		byte[] putData = getFileAsBytes();
		String result = port.put(putData);
		
		PrintWriter out = response.getWriter();

		try {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>WebServiceRef Test</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Title= " + result + "</h1>");
			out.println("</body>");
			out.println("</html>");

		} finally {
			out.close();
		}
	}

	private byte[] getFileAsBytes() throws IOException {
		InputStream is = getClass().getResourceAsStream("/image.jpg");
		
		byte[] bytes = IOUtils.toByteArray(is);

		// Read the bytes in
		int offset = 0;
		int numRead = 0;
		while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
			offset += numRead;
		}

		is.close();
		return bytes;
	}

}
