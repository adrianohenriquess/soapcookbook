package com.poc.soa.catalog.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

import com.soacookbook.ns.Catalog;
import com.soacookbook.ns.CatalogService;

@WebServlet(urlPatterns = "/InjectionServlet")
public class InjectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@WebServiceRef(type = Catalog.class)
	private CatalogService service;

	public InjectionServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		Catalog port = service.getCatalogPort();
		String title = port.getTitle("12345");

		try {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>WebServiceRef Test</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Title= " + title + "</h1>");
			out.println("</body>");
			out.println("</html>");

		} finally {
			out.close();
		}
	}

}
