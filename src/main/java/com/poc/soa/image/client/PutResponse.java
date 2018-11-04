
package com.poc.soa.image.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de putResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="putResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="putResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "putResponse", propOrder = {
    "putResponse"
})
public class PutResponse {

    protected String putResponse;

    /**
     * Obtém o valor da propriedade putResponse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPutResponse() {
        return putResponse;
    }

    /**
     * Define o valor da propriedade putResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPutResponse(String value) {
        this.putResponse = value;
    }

}
