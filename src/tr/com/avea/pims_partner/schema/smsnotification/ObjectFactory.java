
package tr.com.avea.pims_partner.schema.smsnotification;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tr.com.avea.pims_partner.schema.smsnotification package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tr.com.avea.pims_partner.schema.smsnotification
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SmsDeliveryInformation }
     * 
     */
    public SmsDeliveryInformation createSmsDeliveryInformation() {
        return new SmsDeliveryInformation();
    }

    /**
     * Create an instance of {@link NotifySmsDeliveryReportResponse }
     * 
     */
    public NotifySmsDeliveryReportResponse createNotifySmsDeliveryReportResponse() {
        return new NotifySmsDeliveryReportResponse();
    }

    /**
     * Create an instance of {@link NotifySmsDeliveryReportRequest }
     * 
     */
    public NotifySmsDeliveryReportRequest createNotifySmsDeliveryReportRequest() {
        return new NotifySmsDeliveryReportRequest();
    }

    /**
     * Create an instance of {@link NotifySmsReceptionRequest }
     * 
     */
    public NotifySmsReceptionRequest createNotifySmsReceptionRequest() {
        return new NotifySmsReceptionRequest();
    }

    /**
     * Create an instance of {@link NotifySmsReceptionResponse }
     * 
     */
    public NotifySmsReceptionResponse createNotifySmsReceptionResponse() {
        return new NotifySmsReceptionResponse();
    }

}
