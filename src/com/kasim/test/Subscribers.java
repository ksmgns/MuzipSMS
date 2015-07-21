
package com.kasim.test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subscribers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscribers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OfferKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubscriptionOfferProfile" type="{http://www.avea.com.tr/pims/schema-common}SubscriptionOfferProfile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscribers", propOrder = {
    "productKey",
    "offerKey",
    "subscriptionOfferProfile"
})
public class Subscribers {

    @XmlElement(name = "ProductKey", required = true)
    protected String productKey;
    @XmlElement(name = "OfferKey")
    protected String offerKey;
    @XmlElement(name = "SubscriptionOfferProfile")
    protected List<SubscriptionOfferProfile> subscriptionOfferProfile;

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
     * Gets the value of the offerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferKey() {
        return offerKey;
    }

    /**
     * Sets the value of the offerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferKey(String value) {
        this.offerKey = value;
    }

    /**
     * Gets the value of the subscriptionOfferProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionOfferProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionOfferProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionOfferProfile }
     * 
     * 
     */
    public List<SubscriptionOfferProfile> getSubscriptionOfferProfile() {
        if (subscriptionOfferProfile == null) {
            subscriptionOfferProfile = new ArrayList<SubscriptionOfferProfile>();
        }
        return this.subscriptionOfferProfile;
    }

}
