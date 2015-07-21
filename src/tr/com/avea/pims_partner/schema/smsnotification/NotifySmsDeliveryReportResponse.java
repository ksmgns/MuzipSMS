
package tr.com.avea.pims_partner.schema.smsnotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="resultCode" type="{http://www.avea.com.tr/pims-partner/schema/smsNotification}SmsNotificationServiceResultCode" minOccurs="0"/>
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
    "resultCode"
})
@XmlRootElement(name = "NotifySmsDeliveryReportResponse")
public class NotifySmsDeliveryReportResponse {

    protected SmsNotificationServiceResultCode resultCode;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link SmsNotificationServiceResultCode }
     *     
     */
    public SmsNotificationServiceResultCode getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsNotificationServiceResultCode }
     *     
     */
    public void setResultCode(SmsNotificationServiceResultCode value) {
        this.resultCode = value;
    }

}
