package com.poc.soa.weather;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ndfdXMLPortType", targetNamespace = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NdfdXMLPortType {


    /**
     * Returns National Weather Service digital weather forecast data
     * 
     * @param product
     * @param unit
     * @param latitude
     * @param weatherParameters
     * @param startTime
     * @param endTime
     * @param longitude
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "NDFDgen", action = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl#NDFDgen")
    @WebResult(name = "dwmlOut", partName = "dwmlOut")
    public String ndfDgen(
        @WebParam(name = "latitude", partName = "latitude")
        BigDecimal latitude,
        @WebParam(name = "longitude", partName = "longitude")
        BigDecimal longitude,
        @WebParam(name = "product", partName = "product")
        ProductType product,
        @WebParam(name = "startTime", partName = "startTime")
        XMLGregorianCalendar startTime,
        @WebParam(name = "endTime", partName = "endTime")
        XMLGregorianCalendar endTime,
        @WebParam(name = "Unit", partName = "Unit")
        UnitType unit,
        @WebParam(name = "weatherParameters", partName = "weatherParameters")
        WeatherParametersType weatherParameters);

    /**
     * Returns National Weather Service digital weather forecast data summarized over either 24- or 12-hourly periods
     * 
     * @param unit
     * @param latitude
     * @param format
     * @param numDays
     * @param startDate
     * @param longitude
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "NDFDgenByDay", action = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl#NDFDgenByDay")
    @WebResult(name = "dwmlByDayOut", partName = "dwmlByDayOut")
    public String ndfDgenByDay(
        @WebParam(name = "latitude", partName = "latitude")
        BigDecimal latitude,
        @WebParam(name = "longitude", partName = "longitude")
        BigDecimal longitude,
        @WebParam(name = "startDate", partName = "startDate")
        XMLGregorianCalendar startDate,
        @WebParam(name = "numDays", partName = "numDays")
        BigInteger numDays,
        @WebParam(name = "Unit", partName = "Unit")
        UnitType unit,
        @WebParam(name = "format", partName = "format")
        String format);

    /**
     * Returns National Weather Service digital weather forecast data
     * 
     * @param product
     * @param unit
     * @param weatherParameters
     * @param startTime
     * @param endTime
     * @param listLatLon
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "NDFDgenLatLonList", action = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl#NDFDgenLatLonList")
    @WebResult(name = "dwmlOut", partName = "dwmlOut")
    public String ndfDgenLatLonList(
        @WebParam(name = "listLatLon", partName = "listLatLon")
        String listLatLon,
        @WebParam(name = "product", partName = "product")
        ProductType product,
        @WebParam(name = "startTime", partName = "startTime")
        XMLGregorianCalendar startTime,
        @WebParam(name = "endTime", partName = "endTime")
        XMLGregorianCalendar endTime,
        @WebParam(name = "Unit", partName = "Unit")
        UnitType unit,
        @WebParam(name = "weatherParameters", partName = "weatherParameters")
        WeatherParametersType weatherParameters);

    /**
     * Returns National Weather Service digital weather forecast data summarized over either 24- or 12-hourly periods
     * 
     * @param unit
     * @param format
     * @param numDays
     * @param listLatLon
     * @param startDate
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "NDFDgenByDayLatLonList", action = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl#NDFDgenByDayLatLonList")
    @WebResult(name = "dwmlByDayOut", partName = "dwmlByDayOut")
    public String ndfDgenByDayLatLonList(
        @WebParam(name = "listLatLon", partName = "listLatLon")
        String listLatLon,
        @WebParam(name = "startDate", partName = "startDate")
        XMLGregorianCalendar startDate,
        @WebParam(name = "numDays", partName = "numDays")
        BigInteger numDays,
        @WebParam(name = "Unit", partName = "Unit")
        UnitType unit,
        @WebParam(name = "format", partName = "format")
        String format);

    /**
     * Returns National Weather Service digital weather forecast data encoded in GML for a single time
     * 
     * @param requestedTime
     * @param featureType
     * @param weatherParameters
     * @param listLatLon
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GmlLatLonList", action = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl#GmlLatLonList")
    @WebResult(name = "dwGmlOut", partName = "dwGmlOut")
    public String gmlLatLonList(
        @WebParam(name = "listLatLon", partName = "listLatLon")
        String listLatLon,
        @WebParam(name = "requestedTime", partName = "requestedTime")
        XMLGregorianCalendar requestedTime,
        @WebParam(name = "featureType", partName = "featureType")
        FeatureTypeType featureType,
        @WebParam(name = "weatherParameters", partName = "weatherParameters")
        WeatherParametersType weatherParameters);

    /**
     * Returns National Weather Service digital weather forecast data encoded in GML for a time period
     * 
     * @param compType
     * @param propertyName
     * @param featureType
     * @param startTime
     * @param endTime
     * @param listLatLon
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GmlTimeSeries", action = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl#GmlTimeSeries")
    @WebResult(name = "dwGmlOut", partName = "dwGmlOut")
    public String gmlTimeSeries(
        @WebParam(name = "listLatLon", partName = "listLatLon")
        String listLatLon,
        @WebParam(name = "startTime", partName = "startTime")
        XMLGregorianCalendar startTime,
        @WebParam(name = "endTime", partName = "endTime")
        XMLGregorianCalendar endTime,
        @WebParam(name = "compType", partName = "compType")
        CompTypeType compType,
        @WebParam(name = "featureType", partName = "featureType")
        FeatureTypeType featureType,
        @WebParam(name = "propertyName", partName = "propertyName")
        String propertyName);

    /**
     * Returns a list of latitude and longitude pairs in a rectangular subgrid defined by the lower left and upper right points
     * 
     * @param lowerLeftLatitude
     * @param upperRightLatitude
     * @param lowerLeftLongitude
     * @param upperRightLongitude
     * @param resolution
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "LatLonListSubgrid", action = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl#LatLonListSubgrid")
    @WebResult(name = "listLatLonOut", partName = "listLatLonOut")
    public String latLonListSubgrid(
        @WebParam(name = "lowerLeftLatitude", partName = "lowerLeftLatitude")
        BigDecimal lowerLeftLatitude,
        @WebParam(name = "lowerLeftLongitude", partName = "lowerLeftLongitude")
        BigDecimal lowerLeftLongitude,
        @WebParam(name = "upperRightLatitude", partName = "upperRightLatitude")
        BigDecimal upperRightLatitude,
        @WebParam(name = "upperRightLongitude", partName = "upperRightLongitude")
        BigDecimal upperRightLongitude,
        @WebParam(name = "resolution", partName = "resolution")
        BigDecimal resolution);

    /**
     * Returns a list of latitude and longitude pairs along a line defined by the latitude and longitude of the 2 endpoints
     * 
     * @param endPoint2Lon
     * @param endPoint1Lon
     * @param endPoint2Lat
     * @param endPoint1Lat
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "LatLonListLine", action = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl#LatLonListLine")
    @WebResult(name = "listLatLonOut", partName = "listLatLonOut")
    public String latLonListLine(
        @WebParam(name = "endPoint1Lat", partName = "endPoint1Lat")
        BigDecimal endPoint1Lat,
        @WebParam(name = "endPoint1Lon", partName = "endPoint1Lon")
        BigDecimal endPoint1Lon,
        @WebParam(name = "endPoint2Lat", partName = "endPoint2Lat")
        BigDecimal endPoint2Lat,
        @WebParam(name = "endPoint2Lon", partName = "endPoint2Lon")
        BigDecimal endPoint2Lon);

    /**
     * Returns a list of latitude and longitude pairs with each pair corresponding to an input zip code.
     * 
     * @param zipCodeList
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "LatLonListZipCode", action = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl#LatLonListZipCode")
    @WebResult(name = "listLatLonOut", partName = "listLatLonOut")
    public String latLonListZipCode(
        @WebParam(name = "zipCodeList", partName = "zipCodeList")
        String zipCodeList);

    /**
     * Returns a list of latitude and longitude pairs in a rectangle defined by a central point and distance from that point in the latitudinal and longitudinal directions
     * 
     * @param centerPointLon
     * @param distanceLat
     * @param centerPointLat
     * @param distanceLon
     * @param resolution
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "LatLonListSquare", action = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl#LatLonListSquare")
    @WebResult(name = "listLatLonOut", partName = "listLatLonOut")
    public String latLonListSquare(
        @WebParam(name = "centerPointLat", partName = "centerPointLat")
        BigDecimal centerPointLat,
        @WebParam(name = "centerPointLon", partName = "centerPointLon")
        BigDecimal centerPointLon,
        @WebParam(name = "distanceLat", partName = "distanceLat")
        BigDecimal distanceLat,
        @WebParam(name = "distanceLon", partName = "distanceLon")
        BigDecimal distanceLon,
        @WebParam(name = "resolution", partName = "resolution")
        BigDecimal resolution);

    /**
     * Returns four latitude and longitude pairs for corners of an NDFD grid and the minimum resolution that will return the entire grid
     * 
     * @param sector
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CornerPoints", action = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl#CornerPoints")
    @WebResult(name = "listLatLonOut", partName = "listLatLonOut")
    public String cornerPoints(
        @WebParam(name = "sector", partName = "sector")
        SectorType sector);

    /**
     * Returns a list of latitude and longitude pairs paired with the city names they correspond to
     * 
     * @param displayLevel
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "LatLonListCityNames", action = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl#LatLonListCityNames")
    @WebResult(name = "listCityNamesOut", partName = "listCityNamesOut")
    public String latLonListCityNames(
        @WebParam(name = "displayLevel", partName = "displayLevel")
        BigInteger displayLevel);

}