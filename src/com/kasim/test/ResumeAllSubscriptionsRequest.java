
package com.kasim.test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PimsApiUserInformation" type="{http://www.avea.com.tr/pims/schema}PimsApiUserInformation"/>
 *         &lt;element name="ProductKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NamedParam" type="{http://www.avea.com.tr/pims/schema-common}NamedParam" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pimsApiUserInformation",
    "productKey",
    "reasonDescription",
    "namedParam"
})
@XmlRootElement(name = "ResumeAllSubscriptionsRequest")
public class ResumeAllSubscriptionsRequest {

    @XmlElement(name = "PimsApiUserInformation", required = true)
    protected PimsApiUserInformation pimsApiUserInformation;
    @XmlElement(name = "ProductKey", required = true)
    protected String productKey;
    @XmlElement(name = "ReasonDescription")
    protected String reasonDescription;
    @XmlElement(name = "NamedParam")
    protected List<NamedParam> namedParam;

    /**
     * Gets the value of the pimsApiUserInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PimsApiUserInformation }
     *     
     */
    public PimsApiUserInformation getPimsApiUserInformation() {
        return pimsApiUserInformation;
    }

    /**
     * Sets the value of the pimsApiUserInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PimsApiUserInformation }
     *     
     */
    public void setPimsApiUserInformation(PimsApiUserInformation value) {
        this.pimsApiUserInformation = value;
    }

    /**
     * Gets the value of the productKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * Sets the value of the productKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductKey(String value) {
        this.productKey = value;
    }

    /**
     * Gets the value of the reasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonDescription() {
        return reasonDescription;
    }

    /**
     * Sets the value of the reasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonDescription(String value) {
        this.reasonDescription = value;
    }

    /**
     * Gets the value of the namedParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namedParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamedParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedParam }
     * 
     * 
     */
    public List<NamedParam> getNamedParam() {
        if (namedParam == null) {
            namedParam = new ArrayList<NamedParam>();
        }
        return this.namedParam;
    }

}
