
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
 *         &lt;element name="SubscriptionOfferProfile" type="{http://www.avea.com.tr/pims/schema-common}SubscriptionOfferProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CurrentSubscriptionKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewOfferKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ImmediateUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PartnerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "subscriptionOfferProfile",
    "currentSubscriptionKey",
    "newOfferKey",
    "immediateUpgrade",
    "partnerReference",
    "namedParam"
})
@XmlRootElement(name = "UpgradeSubscriptionRequest")
public class UpgradeSubscriptionRequest {

    @XmlElement(name = "PimsApiUserInformation", required = true)
    protected PimsApiUserInformation pimsApiUserInformation;
    @XmlElement(name = "SubscriptionOfferProfile")
    protected List<SubscriptionOfferProfile> subscriptionOfferProfile;
    @XmlElement(name = "CurrentSubscriptionKey", required = true)
    protected String currentSubscriptionKey;
    @XmlElement(name = "NewOfferKey", required = true)
    protected String newOfferKey;
    @XmlElement(name = "ImmediateUpgrade")
    protected boolean immediateUpgrade;
    @XmlElement(name = "PartnerReference")
    protected String partnerReference;
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
     * Gets the value of the currentSubscriptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentSubscriptionKey() {
        return currentSubscriptionKey;
    }

    /**
     * Sets the value of the currentSubscriptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentSubscriptionKey(String value) {
        this.currentSubscriptionKey = value;
    }

    /**
     * Gets the value of the newOfferKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewOfferKey() {
        return newOfferKey;
    }

    /**
     * Sets the value of the newOfferKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewOfferKey(String value) {
        this.newOfferKey = value;
    }

    /**
     * Gets the value of the immediateUpgrade property.
     * 
     */
    public boolean isImmediateUpgrade() {
        return immediateUpgrade;
    }

    /**
     * Sets the value of the immediateUpgrade property.
     * 
     */
    public void setImmediateUpgrade(boolean value) {
        this.immediateUpgrade = value;
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
