
package com.kasim.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "PimsService", targetNamespace = "http://www.avea.com.tr/pims/schema", wsdlLocation = "http://testpims.avea.com.tr/ws/services/Pims.wsdl")
public class PimsService
    extends Service
{

    private final static URL PIMSSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.kasim.test.PimsService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.kasim.test.PimsService.class.getResource(".");
            //TODO get this parameter from configuration
            url = new URL(baseUrl, "http://testpims.avea.com.tr/ws/services/Pims.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/Users/Kas\u0131m/Desktop/pimscalismalari/Pims.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PIMSSERVICE_WSDL_LOCATION = url;
    }

    public PimsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PimsService() {
        super(PIMSSERVICE_WSDL_LOCATION, new QName("http://www.avea.com.tr/pims/schema", "PimsService"));
    }

    /**
     * 
     * @return
     *     returns Pims
     */
    @WebEndpoint(name = "PimsSoap11")
    public Pims getPimsSoap11() {
        return super.getPort(new QName("http://www.avea.com.tr/pims/schema", "PimsSoap11"), Pims.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Pims
     */
    @WebEndpoint(name = "PimsSoap11")
    public Pims getPimsSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.avea.com.tr/pims/schema", "PimsSoap11"), Pims.class, features);
    }

}