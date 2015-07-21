
package com.kasim.test;

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
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResultCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PartnerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargingKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "resultCode",
    "resultCodeDescription",
    "transactionKey",
    "partnerReference",
    "chargingKey"
})
@XmlRootElement(name = "DCReservePurchaseResponse")
public class DCReservePurchaseResponse {

    @XmlElement(name = "ResultCode", required = true)
    protected String resultCode;
    @XmlElement(name = "ResultCodeDescription")
    protected String resultCodeDescription;
    @XmlElement(name = "TransactionKey", required = true)
    protected String transactionKey;
    @XmlElement(name = "PartnerReference")
    protected String partnerReference;
    @XmlElement(name = "ChargingKey")
    protected String chargingKey;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCodeDescription() {
        return resultCodeDescription;
    }

    /**
     * Sets the value of the resultCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCodeDescription(String value) {
        this.resultCodeDescription = value;
    }

    /**
     * Gets the value of the transactionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionKey() {
        return transactionKey;
    }

    /**
     * Sets the value of the transactionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionKey(String value) {
        this.transactionKey = value;
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
     * Gets the value of the chargingKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargingKey() {
        return chargingKey;
    }

    /**
     * Sets the value of the chargingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargingKey(String value) {
        this.chargingKey = value;
    }

}
