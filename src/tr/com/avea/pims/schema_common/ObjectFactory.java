
package tr.com.avea.pims.schema_common;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tr.com.avea.pims.schema_common package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tr.com.avea.pims.schema_common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NamedParam }
     * 
     */
    public NamedParam createNamedParam() {
        return new NamedParam();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link SubscriptionOfferProfile }
     * 
     */
    public SubscriptionOfferProfile createSubscriptionOfferProfile() {
        return new SubscriptionOfferProfile();
    }

}
