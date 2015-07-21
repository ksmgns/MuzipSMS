
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
 *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Msisdn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Profile" type="{http://www.avea.com.tr/pims/schema}MapProfile"/>
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
    "pimsApiUserInformation",
    "keyword",
    "msisdn",
    "profile",
    "namedParam"
})
@XmlRootElement(name = "MapIvtRequest")
public class MapIvtRequest {

    @XmlElement(name = "PimsApiUserInformation", required = true)
    protected PimsApiUserInformation pimsApiUserInformation;
    @XmlElement(name = "Keyword", required = true)
    protected String keyword;
    @XmlElement(name = "Msisdn", required = true)
    protected String msisdn;
    @XmlElement(name = "Profile", required = true)
    protected MapProfile profile;
    @XmlElement(name = "NamedParam")
    protected List<NamedParam> namedParam;

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
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link MapProfile }
     *     
     */
    public MapProfile getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapProfile }
     *     
     */
    public void setProfile(MapProfile value) {
        this.profile = value;
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
