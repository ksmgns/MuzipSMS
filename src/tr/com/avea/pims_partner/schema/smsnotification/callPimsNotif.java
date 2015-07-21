package tr.com.avea.pims_partner.schema.smsnotification;

import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.kasim.test.main.CreateSubscriptionEngine;
import com.kasim.test.main.SendSmsEngine;

@WebService(endpointInterface="tr.com.avea.pims_partner.schema.smsnotification.Pims")

public class callPimsNotif implements Pims {
	final Logger logger = Logger.getLogger(callPimsNotif.class);

	@Override
	public NotifySmsDeliveryReportResponse notifySmsDeliveryReport(
			NotifySmsDeliveryReportRequest notifySmsDeliveryReportRequest) {
		notifySmsDeliveryReportRequest.getClass();
		// TODO Auto-generated method stub
		NotifySmsDeliveryReportResponse notifySmsDeliveryReportResponse = new NotifySmsDeliveryReportResponse();
		notifySmsDeliveryReportResponse.setResultCode(SmsNotificationServiceResultCode.OK);
PropertyConfigurator.configure("log4j.properties");
		
		logger.info("<smsDeliveryStatus>= " + notifySmsDeliveryReportRequest.getDeliveryInformation().smsDeliveryStatus+ " <msýsdn>="+notifySmsDeliveryReportRequest.getDeliveryInformation().getAddress().getMsisdn());
		
		return notifySmsDeliveryReportResponse;
	}

	@Override
	public NotifySmsReceptionResponse notifySmsReception(NotifySmsReceptionRequest notifySmsReceptionRequest) {
		notifySmsReceptionRequest.getClass();
		// TODO Auto-generated method stub
		
		final Logger logger = Logger.getLogger(callPimsNotif.class);
		
		PropertyConfigurator.configure("log4j.properties");
		
		logger.info("<mesaj>= " + notifySmsReceptionRequest.getMessage() + " <msýsdn>="+notifySmsReceptionRequest.getSenderAddress().getMsisdn());
		
 
		NotifySmsReceptionResponse notifySmsReceptionResponse = new NotifySmsReceptionResponse();
		notifySmsReceptionResponse.setResultCode(SmsNotificationServiceResultCode.OK);
		CreateSubscriptionEngine createSubscriptionEngine = new CreateSubscriptionEngine();
		createSubscriptionEngine.createSubscription(notifySmsReceptionRequest.getSenderAddress().getMsisdn());
		SendSmsEngine sendSmsEngine = new SendSmsEngine();
		sendSmsEngine.sendSms(notifySmsReceptionRequest.getMessage(),notifySmsReceptionRequest.getSenderAddress().getMsisdn());
		
		return notifySmsReceptionResponse;
	}

}
