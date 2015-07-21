
package tr.com.avea.pims_partner.schema.smsnotification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import tr.com.avea.pims.schema_common.Address;
import tr.com.avea.pims.schema_common.NamedParam;


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
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmsServiceActivationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenderAddress" type="{http://www.avea.com.tr/pims/schema-common}Address" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PartNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "sessionId",
    "smsServiceActivationNumber",
    "senderAddress",
    "message",
    "messageKey",
    "partTotal",
    "partNo",
    "namedParam"
})
@XmlRootElement(name = "NotifySmsReceptionRequest")
public class NotifySmsReceptionRequest {

    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "SmsServiceActivationNumber")
    protected String smsServiceActivationNumber;
    @XmlElement(name = "SenderAddress")
    protected Address senderAddress;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "MessageKey")
    protected String messageKey;
    @XmlElement(name = "PartTotal")
    protected Integer partTotal;
    @XmlElement(name = "PartNo")
    protected Integer partNo;
    @XmlElement(name = "NamedParam")
    protected List<NamedParam> namedParam;

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
     * Gets the value of the smsServiceActivationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsServiceActivationNumber() {
        return smsServiceActivationNumber;
    }

    /**
     * Sets the value of the smsServiceActivationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsServiceActivationNumber(String value) {
        this.smsServiceActivationNumber = value;
    }

    /**
     * Gets the value of the senderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getSenderAddress() {
        return senderAddress;
    }

    /**
     * Sets the value of the senderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setSenderAddress(Address value) {
        this.senderAddress = value;
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
     * Gets the value of the messageKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageKey() {
        return messageKey;
    }

    /**
     * Sets the value of the messageKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageKey(String value) {
        this.messageKey = value;
    }

    /**
     * Gets the value of the partTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartTotal() {
        return partTotal;
    }

    /**
     * Sets the value of the partTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartTotal(Integer value) {
        this.partTotal = value;
    }

    /**
     * Gets the value of the partNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartNo() {
        return partNo;
    }

    /**
     * Sets the value of the partNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartNo(Integer value) {
        this.partNo = value;
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
