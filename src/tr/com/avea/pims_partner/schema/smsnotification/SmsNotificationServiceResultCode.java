
package tr.com.avea.pims_partner.schema.smsnotification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmsNotificationServiceResultCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SmsNotificationServiceResultCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="FAILED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmsNotificationServiceResultCode")
@XmlEnum
public enum SmsNotificationServiceResultCode {

    OK,
    FAILED;

    public String value() {
        return name();
    }

    public static SmsNotificationServiceResultCode fromValue(String v) {
        return valueOf(v);
    }

}
