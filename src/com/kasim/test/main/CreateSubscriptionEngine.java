package com.kasim.test.main;

import com.kasim.test.CreateSubscriptionRequest;
import com.kasim.test.CreateSubscriptionResponse;
import com.kasim.test.NamedParam;
import com.kasim.test.ObjectFactory;
import com.kasim.test.Pims;
import com.kasim.test.PimsApiUserInformation;
import com.kasim.test.PimsService;
import javax.xml.ws.BindingProvider;
import com.kasim.test.Address;
import com.kasim.test.SubscriptionOfferProfile;

public class CreateSubscriptionEngine {
	
	
	public static void createSubscription(String Msýsdn) {
	PimsService ser = new PimsService();
	ObjectFactory o = new ObjectFactory();
	
	CreateSubscriptionRequest createSubscriptionRequest=o.createCreateSubscriptionRequest();
	
	PimsApiUserInformation pimsApiUserInformation = new PimsApiUserInformation();

	CrunchifyGetPropertyValues crunchifyGetPropertyValues = new CrunchifyGetPropertyValues();
	
	pimsApiUserInformation.setPimsApiUsername(crunchifyGetPropertyValues.getPimsApiUsername());
	//pimsApiUserInformation.setPimsApiUsername("MTQzNjI1Mzk4Mzg5N1NBUFBJS0FSR");
	pimsApiUserInformation.setPimsApiPassword(crunchifyGetPropertyValues.getPimsApiPassword());
	//pimsApiUserInformation.setPimsApiPassword("MTQzNjI1Mzk4NDE5N1NBUFBJS0FSR");

		
	
	SubscriptionOfferProfile subscriptionOfferProfile = new SubscriptionOfferProfile();

	    subscriptionOfferProfile.setServiceProfileAttributeKey(crunchifyGetPropertyValues.getServiceProfileAttributeKey());
		subscriptionOfferProfile.setAttrValue("");
		
		
	      Address address = new Address();
	    	  address.setAsid("");
	    	  address.setMsisdn(Msýsdn);
		
	
	      NamedParam namedParam = new NamedParam();
	    	  namedParam.setKey("");
	    	  namedParam.setValue("");
	    	 
	
	
		createSubscriptionRequest.setPimsApiUserInformation(pimsApiUserInformation);
		createSubscriptionRequest.setAddress(address);
		createSubscriptionRequest.setOfferKey(crunchifyGetPropertyValues.getOfferKey());
		createSubscriptionRequest.setPartnerReference(crunchifyGetPropertyValues.getPartnerReference());
		
	
	
	
		String endpointURL = crunchifyGetPropertyValues.getendpointURL();
	
	Pims port = ser.getPimsSoap11();
	
	 BindingProvider bp = (BindingProvider)port;
	 bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
	 endpointURL);

	try {
		CreateSubscriptionResponse response = port.createSubscription(createSubscriptionRequest);
		System.out.println(response.getResultCode());
	} catch (Exception e) {
		e.printStackTrace();
	}

	}
}
