
package tr.com.avea.pims_partner.schema.smsnotification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmsDeliveryStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SmsDeliveryStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Delivered"/>
 *     &lt;enumeration value="DeliveryUncertain"/>
 *     &lt;enumeration value="DeliveryImpossible"/>
 *     &lt;enumeration value="MessageWaiting"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmsDeliveryStatus")
@XmlEnum
public enum SmsDeliveryStatus {

    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("DeliveryUncertain")
    DELIVERY_UNCERTAIN("DeliveryUncertain"),
    @XmlEnumValue("DeliveryImpossible")
    DELIVERY_IMPOSSIBLE("DeliveryImpossible"),
    @XmlEnumValue("MessageWaiting")
    MESSAGE_WAITING("MessageWaiting");
    private final String value;

    SmsDeliveryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SmsDeliveryStatus fromValue(String v) {
        for (SmsDeliveryStatus c: SmsDeliveryStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
