package com.mapfre.exceljdbc.service.impl;



import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapfre.exceljdbc.api.MigracionDatos;
import com.mapfre.exceljdbc.api.MigracionDatosResponse;
import com.mapfre.exceljdbc.config.SoapConfig;
import com.mapfre.exceljdbc.connector.SOAPConnector;
import com.mapfre.exceljdbc.service.GetTaskOutputService;




@Service
public class GetTaskOutputServiceImpl implements GetTaskOutputService{
	
	private static final Logger log = LoggerFactory.getLogger(GetTaskOutputServiceImpl.class);
	
	@Autowired
	SOAPConnector conector;
	
	@Autowired
	SoapConfig config;
	
	private String endpoint = "http://10.184.50.67:5555/ws/mmxRam.CentralMedica.svc:migracionDatos3_WSD";

  //@XmlRootElement

@Override
	public MigracionDatosResponse  getTask(String idtask) {
	try {
		MigracionDatos request = new MigracionDatos();
		request.setTaskID(idtask);
		
		MigracionDatosResponse response = (MigracionDatosResponse)conector.callWebService(endpoint,request);
		log.info("Method:getTask MigracionDatosResponse= "+response.toString());
		return response;	
	}catch(Exception ex) {
		log.error("Error Method:getTask error "+ex);
		return null;
	}
		
	}
	
	
	
	
}
