package com.poc.soa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CategoryType")
@XmlEnum
public enum CategoryType {

    LITERATURE,
    PHILOSOPHY,
    PROGRAMMING;

    public String value() {
        return name();
    }

    public static CategoryType fromValue(String v) {
        return valueOf(v);
    }

}
