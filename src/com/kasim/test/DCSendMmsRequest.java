
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
 *         &lt;element name="Attachment" type="{http://www.avea.com.tr/pims/schema-common}Attachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverAddress" type="{http://www.avea.com.tr/pims/schema-common}Address"/>
 *         &lt;element name="MmsHeader" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MessagePriority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Charging" type="{http://www.avea.com.tr/pims/schema}DCCharging"/>
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
    "attachment",
    "sessionId",
    "receiverAddress",
    "mmsHeader",
    "messagePriority",
    "message",
    "subject",
    "charging",
    "namedParam",
    "partnerReference"
})
@XmlRootElement(name = "DCSendMmsRequest")
public class DCSendMmsRequest {

    @XmlElement(name = "PimsApiUserInformation", required = true)
    protected PimsApiUserInformation pimsApiUserInformation;
    @XmlElement(name = "Attachment")
    protected List<Attachment> attachment;
    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "ReceiverAddress", required = true)
    protected Address receiverAddress;
    @XmlElement(name = "MmsHeader", required = true)
    protected String mmsHeader;
    @XmlElement(name = "MessagePriority", required = true)
    protected String messagePriority;
    @XmlElement(name = "Message", required = true)
    protected String message;
    @XmlElement(name = "Subject", required = true)
    protected String subject;
    @XmlElement(name = "Charging", required = true)
    protected DCCharging charging;
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
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<Attachment>();
        }
        return this.attachment;
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
     * Gets the value of the mmsHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmsHeader() {
        return mmsHeader;
    }

    /**
     * Sets the value of the mmsHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmsHeader(String value) {
        this.mmsHeader = value;
    }

    /**
     * Gets the value of the messagePriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessagePriority() {
        return messagePriority;
    }

    /**
     * Sets the value of the messagePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagePriority(String value) {
        this.messagePriority = value;
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
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the charging property.
     * 
     * @return
     *     possible object is
     *     {@link DCCharging }
     *     
     */
    public DCCharging getCharging() {
        return charging;
    }

    /**
     * Sets the value of the charging property.
     * 
     * @param value
     *     allowed object is
     *     {@link DCCharging }
     *     
     */
    public void setCharging(DCCharging value) {
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
