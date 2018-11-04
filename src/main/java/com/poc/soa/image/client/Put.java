
package com.poc.soa.image.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de put complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="put">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="putData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "put", propOrder = {
    "putData"
})
public class Put {

    protected byte[] putData;

    /**
     * Obtém o valor da propriedade putData.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPutData() {
        return putData;
    }

    /**
     * Define o valor da propriedade putData.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPutData(byte[] value) {
        this.putData = value;
    }

}
