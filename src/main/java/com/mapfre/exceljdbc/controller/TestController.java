package com.mapfre.exceljdbc.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapfre.exceljdbc.api.MigracionDatosResponse;
import com.mapfre.exceljdbc.service.GetTaskOutputService;



@RestController
public class TestController {
	
	//generar entidades wsimport -d src -keep http://10.184.50.67:5555/ws/mmxRam.CentralMedica.svc:migracionDatos2_WSD?WSDL

	@Autowired
	GetTaskOutputService service;
	
	@GetMapping("/index")
	public  MigracionDatosResponse index() {
		return service.getTask("1340072");
	}
}
