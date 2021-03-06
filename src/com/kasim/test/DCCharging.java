
package com.kasim.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Direct Charging Web Service API
 * 
 * <p>Java class for DCCharging complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DCCharging">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ItemInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContentProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChargingAddress" type="{http://www.avea.com.tr/pims/schema-common}Address"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DCCharging", propOrder = {
    "amount",
    "itemInfo",
    "itemCategory",
    "contentProvider",
    "accessChannel",
    "chargingAddress"
})
public class DCCharging {

    @XmlElement(name = "Amount")
    protected double amount;
    @XmlElement(name = "ItemInfo")
    protected String itemInfo;
    @XmlElement(name = "ItemCategory")
    protected String itemCategory;
    @XmlElement(name = "ContentProvider")
    protected String contentProvider;
    @XmlElement(name = "AccessChannel", required = true)
    protected String accessChannel;
    @XmlElement(name = "ChargingAddress", required = true)
    protected Address chargingAddress;

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the itemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemInfo() {
        return itemInfo;
    }

    /**
     * Sets the value of the itemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemInfo(String value) {
        this.itemInfo = value;
    }

    /**
     * Gets the value of the itemCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCategory() {
        return itemCategory;
    }

    /**
     * Sets the value of the itemCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCategory(String value) {
        this.itemCategory = value;
    }

    /**
     * Gets the value of the contentProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentProvider() {
        return contentProvider;
    }

    /**
     * Sets the value of the contentProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentProvider(String value) {
        this.contentProvider = value;
    }

    /**
     * Gets the value of the accessChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessChannel() {
        return accessChannel;
    }

    /**
     * Sets the value of the accessChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessChannel(String value) {
        this.accessChannel = value;
    }

    /**
     * Gets the value of the chargingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getChargingAddress() {
        return chargingAddress;
    }

    /**
     * Sets the value of the chargingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setChargingAddress(Address value) {
        this.chargingAddress = value;
    }

}
