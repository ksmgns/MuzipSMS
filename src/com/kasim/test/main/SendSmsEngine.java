package com.kasim.test.main;

import java.io.IOException;

import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.kasim.test.Address;
import com.kasim.test.Charging;
import com.kasim.test.NamedParam;
import com.kasim.test.ObjectFactory;
import com.kasim.test.Pims;
import com.kasim.test.PimsApiUserInformation;
import com.kasim.test.PimsService;
import com.kasim.test.SendSmsRequest;
import com.kasim.test.SendSmsResponse;

import tr.com.avea.pims_partner.schema.smsnotification.callPimsNotif;

public class SendSmsEngine {
	public static void sendSms(String msg,String Msýsdn) {
		PimsService ser = new PimsService();
		ObjectFactory o = new ObjectFactory();
		SendSmsRequest sendSmsRequest = o.createSendSmsRequest();
		CrunchifyGetPropertyValues crunchifyGetPropertyValues = new CrunchifyGetPropertyValues();

		Charging charging = new Charging();
		 
		charging.setAccessChannel(crunchifyGetPropertyValues.getAccessChannel());
		 
		charging.setServiceKey(crunchifyGetPropertyValues.getServiceKey());

		Address add = new Address();
		add.setMsisdn(Msýsdn);
		charging.setChargingAddress(add);

		charging.setItemInfo("");
		charging.setItemCategory("");
		charging.setContentProvider("");

		sendSmsRequest.setCharging(charging);

		PimsApiUserInformation pimsApiUserInformation = new PimsApiUserInformation();
		 
	
		
	
		pimsApiUserInformation.setPimsApiUsername(crunchifyGetPropertyValues.getPimsApiUsername());
		
		//pimsApiUserInformation.setPimsApiUsername("MTQzNjI1Mzk4Mzg5N1NBUFBJS0FSR");
		pimsApiUserInformation.setPimsApiPassword(crunchifyGetPropertyValues.getPimsApiPassword());
		//pimsApiUserInformation.setPimsApiPassword("MTQzNjI1Mzk4NDE5N1NBUFBJS0FSR");
		sendSmsRequest.setPimsApiUserInformation(pimsApiUserInformation);
		
		sendSmsRequest.setMessage(msg+"hello4");
		 
		sendSmsRequest.setPartnerReference(crunchifyGetPropertyValues.getPartnerReference());
		
		sendSmsRequest.setSmsHeader(crunchifyGetPropertyValues.getSmsHeader());
		
		sendSmsRequest.setSmsType(crunchifyGetPropertyValues.getSmsType());
		sendSmsRequest.setSessionId("");


		Address receiverAdd = new Address();
		receiverAdd.setMsisdn(Msýsdn);
		receiverAdd.setAsid(null);
		sendSmsRequest.setReceiverAddress(receiverAdd);
		
	 //TODO get this parameter from configuration
	//	String endpointURL = "http://testpims.avea.com.tr:80/ws/services";
		String endpointURL = crunchifyGetPropertyValues.getendpointURL();
		
		Pims port = ser.getPimsSoap11();

		 BindingProvider bp = (BindingProvider)port;
		 bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
		 endpointURL);

		try {
			SendSmsResponse response = port.sendSms(sendSmsRequest);
			System.out.println(response.getResultCode());
			
			final Logger logger = Logger.getLogger(callPimsNotif.class);
			
			PropertyConfigurator.configure("log4j.properties");
			
			logger.info("<OfferKey>= " + response.getOfferKey() + " <TransactionKey>="+response.getTransactionKey()+ " <MessageKey>="+response.getMessageKey()+ " <ServiceKey>="+crunchifyGetPropertyValues.getServiceKey()+ " <SmsHeader>="+crunchifyGetPropertyValues.getSmsHeader()+ " \n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
