package com.mapfre.exceljdbc.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.mapfre.exceljdbc.api.MigracionDatosResponse;





@Service
public interface GetTaskOutputService {
	
	MigracionDatosResponse getTask(String id);

}
