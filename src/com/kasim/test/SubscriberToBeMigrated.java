
package com.kasim.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SubscriberToBeMigrated complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberToBeMigrated">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionOfferProfile" type="{http://www.avea.com.tr/pims/schema-common}SubscriptionOfferProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.avea.com.tr/pims/schema-common}Address"/>
 *         &lt;element name="OriginalCreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NextRenewalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NextIntervalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PartnerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberToBeMigrated", propOrder = {
    "subscriptionOfferProfile",
    "address",
    "originalCreateDate",
    "nextRenewalDate",
    "nextIntervalCount",
    "partnerReference"
})
public class SubscriberToBeMigrated {

    @XmlElement(name = "SubscriptionOfferProfile")
    protected List<SubscriptionOfferProfile> subscriptionOfferProfile;
    @XmlElement(name = "Address", required = true)
    protected Address address;
    @XmlElement(name = "OriginalCreateDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar originalCreateDate;
    @XmlElement(name = "NextRenewalDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar nextRenewalDate;
    @XmlElement(name = "NextIntervalCount")
    protected Integer nextIntervalCount;
    @XmlElement(name = "PartnerReference")
    protected String partnerReference;

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

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the originalCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getOriginalCreateDate() {
        return originalCreateDate;
    }

    /**
     * Sets the value of the originalCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCreateDate(Calendar value) {
        this.originalCreateDate = value;
    }

    /**
     * Gets the value of the nextRenewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getNextRenewalDate() {
        return nextRenewalDate;
    }

    /**
     * Sets the value of the nextRenewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextRenewalDate(Calendar value) {
        this.nextRenewalDate = value;
    }

    /**
     * Gets the value of the nextIntervalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNextIntervalCount() {
        return nextIntervalCount;
    }

    /**
     * Sets the value of the nextIntervalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNextIntervalCount(Integer value) {
        this.nextIntervalCount = value;
    }

    /**
     * Gets the value of the partnerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerReference() {
        return partnerReference;
    }

    /**
     * Sets the value of the partnerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerReference(String value) {
        this.partnerReference = value;
    }

}
