package com.mapfre.exceljdbc.util;

public class InsertDatosgenUtil {
	//?
	/*public static String insertDatos() {
		return "Insert into USRWM9COM.XXMPF_BPM_CM_HISTORICO_DATO (TASKID,FOLIO,CREATED_DATE,DEDUCIBLEC,PLAN,ASEGURADORA,TOPE_COASEGURO_C,OBS_AJUSTE,AYUDANTE,ANESTESIOLOGO,AJUSTES,HOSPITAL,HONORARIOS_MEDICOS,CIRUJANO,SUMA_ASEGURADA,TOPE_COASEGURO_PD,SINIESTROS_PREVIOS,COASEGURO_PD,TOPE_COASEGURO_PD2,SINIESTOS_PREVIOS2,COASEGURO_PD2,TIP_POLIZA,DICTAMEN,COASEGURO_C2,FEC_RECONOCIMIENTO_ANTIGUEDAD,COASEGURO_HONORARIO_MED_TXT,COASEGURO_HOSPITAL,DEDUCIBLE,COASEGURO_HONORARIO_MEDICOS,COASEGURO_HOSPITAL_TXT,DEDUCIBLE_PD,FEC_AMTIGUEDAD,FEC_ACT_DIC,USR_DICTAMINADOR,TEL,EMAIL,APE_PAT,APE_MAT,FAX,NOMBRE,NUM_RIESGO,HABITACION,TASK_LAST_ACEPTED_BY,EDAD,SUCURSAL,RFC,APE_PAT_PROVEEDOR,APE_PAT_MAT_PROVEEDOR,NOMBRE_PROVEEDOR,OBS,AREA_INGRESO,FEC_INGRESO,FEC_NACIMIENTO,TIP_PAGO,FEC_EGRESO,PROCESO,FEC_OCURRIDO,FEC_PROC_SINI,APE_PAT_CONTRATANTE,APE_MAT_CONTRATANTE,NOMBRE_CONTRATANTE,RESULTADO_DICTAMEN,NUM_SINI,MONTO,COD_NIVEL2,COD_NIVEL1,STATUS_POLIZA,VIGENCIA_FIN,STATUS_PAGADO,VIGENCIA_INI,HORA_INGRESO,TIP_INGRESO,COD_SECTOR,APE_PAT_AFECTADO,APE_MAT_AFECTADO,SEXO_AFECTADO,NOMBRE_AFECTADO,MOTIVO_SEGMENTACION,TIP_EXP,NUM_POLIZA,FEC_DIC,EXCLUSIONES_RIESGO1) "
				+ " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);" ;
	}*/
	
	public static String insertDatos() {
		return w;
	}
	static String w = "insert" + 
			"    into" + 
			"        xxmpf_bpm_cm_historico_dato " + 
			"        (ajustes, anestesiologo, ape_mat, ape_mat_afectado, ape_mat_contratante, ape_pat, ape_pat_afectado, ape_pat_contratante, ape_pat_mat_proveedor" + 
			", ape_pat_proveedor, area_ingreso, aseguradora, ayudante, cirujano, coaseguro_c2, coaseguro_honorario_medicos, coaseguro_honorario_med_txt, coaseguro_" + 
			"hospital, coaseguro_hospital_txt, coaseguro_pd, coaseguro_pd2, cod_nivel1, cod_nivel2, cod_sector, created_date, deducible, deducible_pd, deduciblec," + 
			"dictamen, edad, email, email_proveedor, endoso_especiales, exclusiones_riesgo, exclusiones_riesgo1, fax, fec_act_dic, fec_amtiguedad, fec_dic, fec_egr" + 
			"eso, fec_ingreso, fec_nacimiento, fec_ocurrido, fec_proc_sini, fec_reconocimiento_antiguedad, habitacion, honorarios_medicos, hora_ingreso, hospital," + 
			"monto, motivo_segmentacion, nombre, nombre_afectado, nombre_contratante, nombre_proveedor, num_poliza, num_riesgo, num_sini, obs, obs_ajuste, obs_exte" + 
			"rnas, obs_internas, plan, proceso, resultado_dictamen, rfc, sector_descripcion, sexo_afectado, siniestros_previos, siniestos_previos2, status_pagado," + 
			"status_poliza, sucursal, suma_asegurada, task_last_acepted_by, taskid, tel, tip_exp, tip_ingreso, tip_pago, tip_poliza, tope_coaseguro_c, tope_coasegu" + 
			"ro_pd, tope_coaseguro_pd2, usr_dictaminador, vigencia_fin, vigencia_ini, folio)" + 
			"    values" + 
			"        (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
			      + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
			      + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
			      + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
			      + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
			      + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
			      + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
			      + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
			      + " ?, ?, ?, ?, ?, ?, ?, ?)";

}
