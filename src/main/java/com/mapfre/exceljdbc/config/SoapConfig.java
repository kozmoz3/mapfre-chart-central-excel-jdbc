package com.mapfre.exceljdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.security.core.CredentialsContainer;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import com.mapfre.exceljdbc.connector.SOAPConnector;
import org.apache.http.auth.UsernamePasswordCredentials;
//import com.mapfre.cm.excel.model.UsernamePasswordCredentials;



@Configuration
public class SoapConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshallers  = new Jaxb2Marshaller();
		marshallers.setPackagesToScan("com.mapfre.exceljdbc.api");
		return marshallers;
	}
	
	 @Bean
	    public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
	        SOAPConnector client = new SOAPConnector();
	        client.setDefaultUri("http://10.184.50.67:5555/ws/mmxRam.CentralMedica.svc:migracionDatos3_WSD?WSDL");
	        client.setMarshaller(marshaller);
	        client.setUnmarshaller(marshaller);
	       // client.setMessageSender(getMessageSender());
	       /* ClientInterceptor[] interceptors = new ClientInterceptor[] {securityInterceptor()};
	        client.setInterceptors(interceptors);*/
	       
	        return client;
	    }
	 
	 /*https://codenotfound.com/spring-ws-basic-authentication-example.html*/
	 /*https://leiva.io/2019/12/29/invocar-servicios-soap-desde-spring-boot/*/
	 /*seguridad apache common*/
	 @Bean
	 public HttpComponentsMessageSender getMessageSender() {
	     HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
	     messageSender.setCredentials(new UsernamePasswordCredentials("6delta", "6deltaadmin"));
	     return messageSender;
	 }
	 
	 /*https://memorynotfound.com/spring-ws-username-password-authentication-wss4j/*/
	 
	 @Bean
	    public Wss4jSecurityInterceptor securityInterceptor(){
	        Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
	        wss4jSecurityInterceptor.setSecurementActions("Timestamp UsernameToken");
	        wss4jSecurityInterceptor.setSecurementUsername("6delta");
	        wss4jSecurityInterceptor.setSecurementPassword("6deltaadmin");
	        return wss4jSecurityInterceptor;
	    }
}

