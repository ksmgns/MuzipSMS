package tr.com.avea.pims_partner.schema.smsnotification;

import javax.xml.ws.Endpoint;

public class Publish {
	 public static void main(String[] args ){
	       Endpoint.publish("http://localhost:8032/com.avea.pims_partner.schema.smsnotification?wsdl", new callPimsNotif());
	       // Endpoint.publish("http://0.0.0.0:8032/com.avea.pims_partner.schema.smsnotification?wsdl", new callPimsNotif());
	 	      
	 }
}
