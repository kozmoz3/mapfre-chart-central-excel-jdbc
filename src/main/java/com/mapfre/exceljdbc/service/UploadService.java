package com.mapfre.exceljdbc.service;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mapfre.exceljdbc.model.DataExcelModel;



@Service
public interface UploadService {
	
	public void create( MultipartFile[] multiPart, DataExcelModel dataModel)throws IOException;

}
