
package com.kasim.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PimsApiUserInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PimsApiUserInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PimsApiUsername" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PimsApiPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PimsApiUserInformation", propOrder = {
    "pimsApiUsername",
    "pimsApiPassword"
})
public class PimsApiUserInformation {

    @XmlElement(name = "PimsApiUsername", required = true)
    protected String pimsApiUsername;
    @XmlElement(name = "PimsApiPassword", required = true)
    protected String pimsApiPassword;

    /**
     * Gets the value of the pimsApiUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPimsApiUsername() {
        return pimsApiUsername;
    }

    /**
     * Sets the value of the pimsApiUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPimsApiUsername(String value) {
        this.pimsApiUsername = value;
    }

    /**
     * Gets the value of the pimsApiPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPimsApiPassword() {
        return pimsApiPassword;
    }

    /**
     * Sets the value of the pimsApiPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPimsApiPassword(String value) {
        this.pimsApiPassword = value;
    }

}
