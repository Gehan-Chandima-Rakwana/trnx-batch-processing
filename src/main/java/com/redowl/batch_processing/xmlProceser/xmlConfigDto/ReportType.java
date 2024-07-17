//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.10 at 08:34:16 PM IST 
//


package com.redowl.batch_processing.xmlProceser.xmlConfigDto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for report_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="report_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AIFA"/&gt;
 *     &lt;enumeration value="AIFT"/&gt;
 *     &lt;enumeration value="ALR"/&gt;
 *     &lt;enumeration value="CFIR"/&gt;
 *     &lt;enumeration value="CTR"/&gt;
 *     &lt;enumeration value="EFT"/&gt;
 *     &lt;enumeration value="FPR"/&gt;
 *     &lt;enumeration value="IFT"/&gt;
 *     &lt;enumeration value="IRD"/&gt;
 *     &lt;enumeration value="LSTRT"/&gt;
 *     &lt;enumeration value="PUBC"/&gt;
 *     &lt;enumeration value="SAR"/&gt;
 *     &lt;enumeration value="SCAM"/&gt;
 *     &lt;enumeration value="SDI"/&gt;
 *     &lt;enumeration value="STL"/&gt;
 *     &lt;enumeration value="STR-N"/&gt;
 *     &lt;enumeration value="TRSAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "report_type")
@XmlEnum
public enum ReportType {

    AIFA("AIFA"),
    AIFT("AIFT"),
    ALR("ALR"),
    CFIR("CFIR"),
    CTR("CTR"),
    EFT("EFT"),
    FPR("FPR"),
    IFT("IFT"),
    IRD("IRD"),
    LSTRT("LSTRT"),
    PUBC("PUBC"),
    SAR("SAR"),
    SCAM("SCAM"),
    SDI("SDI"),
    STL("STL"),
    @XmlEnumValue("STR-N")
    STR_N("STR-N"),
    TRSAR("TRSAR");
    private final String value;

    ReportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportType fromValue(String v) {
        for (ReportType c: ReportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
