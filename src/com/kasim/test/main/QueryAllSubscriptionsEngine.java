package com.kasim.test.main;

import javax.xml.ws.BindingProvider;

import com.kasim.test.Address;
import com.kasim.test.NamedParam;
import com.kasim.test.ObjectFactory;
import com.kasim.test.Pims;
import com.kasim.test.PimsApiUserInformation;
import com.kasim.test.PimsService;
import com.kasim.test.QueryAllSubscriptionsRequest;
import com.kasim.test.QueryAllSubscriptionsResponse;

public class QueryAllSubscriptionsEngine {
	
	public static void QueryAllSubscriptions(String msg,String Msýsdn) {
	
		PimsService ser = new PimsService();
		ObjectFactory o = new ObjectFactory();
		 
		
		QueryAllSubscriptionsRequest queryAllSubscriptionsRequest =o.createQueryAllSubscriptionsRequest();
		PimsApiUserInformation pimsApiUserInformation = new PimsApiUserInformation();
		
		CrunchifyGetPropertyValues crunchifyGetPropertyValues= new CrunchifyGetPropertyValues();
		
		pimsApiUserInformation.setPimsApiUsername(crunchifyGetPropertyValues.getPimsApiUsername());		
		//pimsApiUserInformation.setPimsApiUsername("MTQzNjI1Mzk4Mzg5N1NBUFBJS0FSR");
		pimsApiUserInformation.setPimsApiPassword(crunchifyGetPropertyValues.getPimsApiPassword());
		//pimsApiUserInformation.setPimsApiPassword("MTQzNjI1Mzk4NDE5N1NBUFBJS0FSR");
	
		Address address = new Address();
  	  address.setAsid("");
  	  address.setMsisdn(Msýsdn);
	
  	 NamedParam namedParam = new NamedParam();
	  namedParam.setKey("");
	  namedParam.setValue("");
	 
	  queryAllSubscriptionsRequest.setPimsApiUserInformation(pimsApiUserInformation);
	  queryAllSubscriptionsRequest.setAddress(address);
	  
	
		String endpointURL = crunchifyGetPropertyValues.getendpointURL();
		
		Pims port = ser.getPimsSoap11();
		
		 BindingProvider bp = (BindingProvider)port;
		 bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
		 endpointURL);

		try {
			QueryAllSubscriptionsResponse response = port.queryAllSubscriptions(queryAllSubscriptionsRequest);
			System.out.println(response.getResultCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	
		
	}
}
