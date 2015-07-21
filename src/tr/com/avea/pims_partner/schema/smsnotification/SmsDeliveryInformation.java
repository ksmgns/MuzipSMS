
package tr.com.avea.pims_partner.schema.smsnotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import tr.com.avea.pims.schema_common.Address;


/**
 * <p>Java class for SmsDeliveryInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmsDeliveryInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.avea.com.tr/pims/schema-common}Address" minOccurs="0"/>
 *         &lt;element name="SmsDeliveryStatus" type="{http://www.avea.com.tr/pims-partner/schema/smsNotification}SmsDeliveryStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmsDeliveryInformation", propOrder = {
    "address",
    "smsDeliveryStatus"
})
public class SmsDeliveryInformation {

    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "SmsDeliveryStatus")
    protected SmsDeliveryStatus smsDeliveryStatus;

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
     * Gets the value of the smsDeliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SmsDeliveryStatus }
     *     
     */
    public SmsDeliveryStatus getSmsDeliveryStatus() {
        return smsDeliveryStatus;
    }

    /**
     * Sets the value of the smsDeliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsDeliveryStatus }
     *     
     */
    public void setSmsDeliveryStatus(SmsDeliveryStatus value) {
        this.smsDeliveryStatus = value;
    }

}
