
package tr.com.avea.pims.schema_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionOfferProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionOfferProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceProfileAttributeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttrValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionOfferProfile", propOrder = {
    "serviceProfileAttributeKey",
    "attrValue"
})
public class SubscriptionOfferProfile {

    @XmlElement(name = "ServiceProfileAttributeKey", required = true)
    protected String serviceProfileAttributeKey;
    @XmlElement(name = "AttrValue")
    protected String attrValue;

    /**
     * Gets the value of the serviceProfileAttributeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProfileAttributeKey() {
        return serviceProfileAttributeKey;
    }

    /**
     * Sets the value of the serviceProfileAttributeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProfileAttributeKey(String value) {
        this.serviceProfileAttributeKey = value;
    }

    /**
     * Gets the value of the attrValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrValue() {
        return attrValue;
    }

    /**
     * Sets the value of the attrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrValue(String value) {
        this.attrValue = value;
    }

}
