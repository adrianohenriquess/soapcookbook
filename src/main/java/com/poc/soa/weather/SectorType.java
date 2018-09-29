package com.poc.soa.weather;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sectorType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="sectorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="conus"/>
 *     &lt;enumeration value="nhemi"/>
 *     &lt;enumeration value="alaska"/>
 *     &lt;enumeration value="guam"/>
 *     &lt;enumeration value="hawaii"/>
 *     &lt;enumeration value="puertori"/>
 *     &lt;enumeration value="npacocn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sectorType")
@XmlEnum
public enum SectorType {

    @XmlEnumValue("conus")
    CONUS("conus"),
    @XmlEnumValue("nhemi")
    NHEMI("nhemi"),
    @XmlEnumValue("alaska")
    ALASKA("alaska"),
    @XmlEnumValue("guam")
    GUAM("guam"),
    @XmlEnumValue("hawaii")
    HAWAII("hawaii"),
    @XmlEnumValue("puertori")
    PUERTORI("puertori"),
    @XmlEnumValue("npacocn")
    NPACOCN("npacocn");
    private final String value;

    SectorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SectorType fromValue(String v) {
        for (SectorType c: SectorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
