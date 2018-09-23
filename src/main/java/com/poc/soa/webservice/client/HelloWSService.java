package com.poc.soa.webservice.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "HelloWSService", 
				  targetNamespace = "http://webservice.soa.poc.com/", 
				  wsdlLocation = "http://localhost:8080/soacookbook/HelloWS?wsdl")
public class HelloWSService extends Service {

    private final static URL HELLOWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOWSSERVICE_EXCEPTION;
    private final static QName HELLOWSSERVICE_QNAME = new QName("http://webservice.soa.poc.com/", "HelloWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/soacookbook/HelloWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOWSSERVICE_WSDL_LOCATION = url;
        HELLOWSSERVICE_EXCEPTION = e;
    }

    public HelloWSService() {
        super(__getWsdlLocation(), HELLOWSSERVICE_QNAME);
    }

    public HelloWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOWSSERVICE_QNAME, features);
    }

    public HelloWSService(URL wsdlLocation) {
        super(wsdlLocation, HELLOWSSERVICE_QNAME);
    }

    public HelloWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOWSSERVICE_QNAME, features);
    }

    public HelloWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Hello
     */
    @WebEndpoint(name = "HelloWSPort")
    public Hello getHelloWSPort() {
        return super.getPort(new QName("http://webservice.soa.poc.com/", "HelloWSPort"), Hello.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Hello
     */
    @WebEndpoint(name = "HelloWSPort")
    public Hello getHelloWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.soa.poc.com/", "HelloWSPort"), Hello.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWSSERVICE_EXCEPTION!= null) {
            throw HELLOWSSERVICE_EXCEPTION;
        }
        return HELLOWSSERVICE_WSDL_LOCATION;
    }

}
