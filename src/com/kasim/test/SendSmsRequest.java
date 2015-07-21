
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
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmsType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReceiverAddress" type="{http://www.avea.com.tr/pims/schema-common}Address"/>
 *         &lt;element name="SmsHeader" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.avea.com.tr/pims/schema}Charging"/>
 *         &lt;element name="NamedParam" type="{http://www.avea.com.tr/pims/schema-common}NamedParam" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "pimsApiUserInformation",
    "sessionId",
    "smsType",
    "receiverAddress",
    "smsHeader",
    "message",
    "charging",
    "namedParam",
    "partnerReference"
})
@XmlRootElement(name = "SendSmsRequest")
public class SendSmsRequest {

    @XmlElement(name = "PimsApiUserInformation", required = true)
    protected PimsApiUserInformation pimsApiUserInformation;
    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "SmsType", required = true)
    protected String smsType;
    @XmlElement(name = "ReceiverAddress", required = true)
    protected Address receiverAddress;
    @XmlElement(name = "SmsHeader", required = true)
    protected String smsHeader;
    @XmlElement(name = "Message", required = true)
    protected String message;
    @XmlElement(name = "Charging", namespace = "http://www.avea.com.tr/pims/schema", required = true)
    protected Charging charging;
    @XmlElement(name = "NamedParam")
    protected List<NamedParam> namedParam;
    @XmlElement(name = "PartnerReference")
    protected String partnerReference;

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
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the smsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsType() {
        return smsType;
    }

    /**
     * Sets the value of the smsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsType(String value) {
        this.smsType = value;
    }

    /**
     * Gets the value of the receiverAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * Sets the value of the receiverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setReceiverAddress(Address value) {
        this.receiverAddress = value;
    }

    /**
     * Gets the value of the smsHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsHeader() {
        return smsHeader;
    }

    /**
     * Sets the value of the smsHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsHeader(String value) {
        this.smsHeader = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the charging property.
     * 
     * @return
     *     possible object is
     *     {@link Charging }
     *     
     */
    public Charging getCharging() {
        return charging;
    }

    /**
     * Sets the value of the charging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charging }
     *     
     */
    public void setCharging(Charging value) {
        this.charging = value;
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
