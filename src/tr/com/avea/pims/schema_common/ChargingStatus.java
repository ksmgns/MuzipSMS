
package tr.com.avea.pims.schema_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INIT"/>
 *     &lt;enumeration value="COMMITED"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="PARTIALLY_COMMITED"/>
 *     &lt;enumeration value="RESERVED"/>
 *     &lt;enumeration value="PARTIALLY_RESERVED"/>
 *     &lt;enumeration value="RELEASED"/>
 *     &lt;enumeration value="TIMED_OUT"/>
 *     &lt;enumeration value="TO_BE_RETRIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChargingStatus")
@XmlEnum
public enum ChargingStatus {

    INIT,
    COMMITED,
    FAILED,
    PARTIALLY_COMMITED,
    RESERVED,
    PARTIALLY_RESERVED,
    RELEASED,
    TIMED_OUT,
    TO_BE_RETRIED;

    public String value() {
        return name();
    }

    public static ChargingStatus fromValue(String v) {
        return valueOf(v);
    }

}
