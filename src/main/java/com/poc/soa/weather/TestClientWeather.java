package com.poc.soa.weather;

import java.math.BigInteger;

public class TestClientWeather {
	public static void main(String[] args) {
		NdfdXML service = new NdfdXML();
		System.out.println(service.getServiceName());
		NdfdXMLPortType port = service.getNdfdXMLPort();
		String latLonListCityNames = port.latLonListCityNames(new BigInteger("34"));
		System.out.println(latLonListCityNames);
	}
}
