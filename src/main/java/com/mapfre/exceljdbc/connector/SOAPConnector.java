package com.mapfre.exceljdbc.connector;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;



public class SOAPConnector extends WebServiceGatewaySupport{

	private static final Logger  log = LoggerFactory.getLogger(SOAPConnector.class);

	public Object callWebService(String url, Object request){
		try {
		log.info("Method:callWebService [url = "+url +" , request = "+request.toString());
		JAXBElement res = (JAXBElement)getWebServiceTemplate().marshalSendAndReceive(url, request);
		log.info("Method: callWebService  vlue =  "+res.getValue());
		//return res;
		return res.getValue();
		}catch(Exception ex) {
			log.error("Error Method:callWebService error -> "+ex);
			return null;
		}
    }
	
}