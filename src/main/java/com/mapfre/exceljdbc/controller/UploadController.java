package com.mapfre.exceljdbc.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mapfre.exceljdbc.model.DataExcelModel;
import com.mapfre.exceljdbc.service.UploadService;


@Controller
public class UploadController {
	
	private static final Logger  log = LoggerFactory.getLogger(UploadController.class);
	
	@Autowired
	private UploadService uploadService;
	
	@GetMapping("/upload")
	public String index(Model model) {
		model.addAttribute("data", new DataExcelModel());
		return "upload/index";
	}

	
	@PostMapping("/upload_show")
    public String show(Model model, DataExcelModel data, @RequestParam("archivoImagen") MultipartFile[] multiPart)throws IOException {
		log.info("Method:show input [ "+data.toString());
		
		if( multiPart.length > 0) {
			log.info("Method store hay archivo num archivos = "+multiPart.length);
			uploadService.create(multiPart, data);
		//	documentoService.save(multiPart, folio, serverUrl);
		}
		model.addAttribute("data", data);
		return "upload/index";
	}

}
