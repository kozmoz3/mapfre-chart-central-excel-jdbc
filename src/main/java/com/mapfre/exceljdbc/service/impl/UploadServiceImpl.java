package com.mapfre.exceljdbc.service.impl;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import javax.tools.Diagnostic;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mapfre.exceljdbc.api.Afectado;
import com.mapfre.exceljdbc.api.Contacto;
import com.mapfre.exceljdbc.api.Contratante;
import com.mapfre.exceljdbc.api.DatosMinimos;
import com.mapfre.exceljdbc.api.Diagnosticos;
import com.mapfre.exceljdbc.api.DictamenMedico;
import com.mapfre.exceljdbc.api.GCA;
import com.mapfre.exceljdbc.api.MigracionDatosResponse;
import com.mapfre.exceljdbc.api.Poliza;
import com.mapfre.exceljdbc.api.Proveedor;
import com.mapfre.exceljdbc.api.RMA;
import com.mapfre.exceljdbc.api.ServicioOut;
import com.mapfre.exceljdbc.api.TaskData;
import com.mapfre.exceljdbc.api.TaskInfo;
import com.mapfre.exceljdbc.dao.DatosGeneralesCmHistoricoDao;
import com.mapfre.exceljdbc.dao.DiagnosticoCmDao;
import com.mapfre.exceljdbc.dao.TelefonoProveedorCmDao;
import com.mapfre.exceljdbc.entity.DatosGeneralesCmHistorico;
import com.mapfre.exceljdbc.entity.DiagnosticoCm;
import com.mapfre.exceljdbc.entity.TelefonoProveedorCm;
import com.mapfre.exceljdbc.model.DataExcelModel;
import com.mapfre.exceljdbc.service.GetTaskOutputService;
import com.mapfre.exceljdbc.service.UploadService;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

@Service
public class UploadServiceImpl implements UploadService {

	private static final Logger log = LoggerFactory.getLogger(UploadServiceImpl.class);

//	@Autowired
	// private DatosGeneralesCmHistoricoService datosGeneralesCmHistoricoService;

	@Autowired
	private DatosGeneralesCmHistoricoDao daoDatos;
	
	@Autowired
	private DiagnosticoCmDao diagDao;
	
	@Autowired
	private TelefonoProveedorCmDao telDao;

	@Autowired
	private GetTaskOutputService getTaskOutputService;

	@Override
	public void create(MultipartFile[] multiPart, DataExcelModel dataModel) throws IOException {
		try {
			for (int index = 0; index < multiPart.length; index++) {
				MultipartFile file = multiPart[index];

				// Con esta version se puede xlsx
				Workbook workbook = WorkbookFactory.create(file.getInputStream());
				Sheet worksheet = workbook.getSheetAt(dataModel.getNumHoja());
				List<DatosGeneralesCmHistorico> listData = new ArrayList<DatosGeneralesCmHistorico>();
				
				List<DiagnosticoCm> listDiag = new ArrayList<DiagnosticoCm>();
				
				List<TelefonoProveedorCm> listTelPro = new ArrayList<TelefonoProveedorCm>();

				for (int i = dataModel.getInitRegistro(); i < dataModel.getFinRegistro(); i++) {
					Row row = worksheet.getRow(i);
					String idTask = row.getCell(0).getNumericCellValue() + "";

					String idtaskReplace = idTask.replace(".0", "");
					log.info(
							"Method:create idTaskReplace = " + idtaskReplace + " idtask = " + idTask + " index = " + i);
					// datosGeneralesCmHistoricoService.create(idtaskReplace , i);
					MigracionDatosResponse response = getTaskOutputService.getTask(idtaskReplace);

					if (response != null) {
						ServicioOut servicio = response.getServicioOut();
						if (servicio != null) {
							log.info("Method:create servicio " );
							TaskInfo task = servicio.getTaskInfo();
							TaskData taskData = servicio.getTaskData();
							if (taskData != null) {
								
								DatosGeneralesCmHistorico datos = new DatosGeneralesCmHistorico();
								taskInfor(datos, task, idTask);
								DictamenMedico dictamen = taskData.getDictamenMedico();
								if(dictamen != null) {
								dictamenMedico(datos, taskData);
								rma(datos, taskData);
								gca(datos, taskData);
								}
								datosMinimos(datos, taskData,listDiag, listTelPro,task);
								log.info("Method:create datos= " + datos.toString());
								listData.add(datos);
							}
						}
					}

				}
				daoDatos.insertBatch(listData, 50);
				diagDao.insertBatch(listDiag, 50);
				telDao.insertBatch(listTelPro, 50);

			}
		} catch (Exception ex) {
			log.error("Error -> Method:create " + ex);
		}

	}

	private void datosMinimos(DatosGeneralesCmHistorico datos, TaskData taskData, List<DiagnosticoCm> listDiag ,List<TelefonoProveedorCm> listTelPro,TaskInfo task) {
		DatosMinimos datosMinimos = taskData.getDatosMinimos();

		if (datosMinimos != null) {
			log.info("Method: datosMinimos");
			datos.setFecActDic(datosMinimos.getFecActDic() + "");
			datos.setUsrDictaminador(datosMinimos.getUsrDictaminador());

			contacto(datos, datosMinimos);

			datos.setNumRiesgo(datosMinimos.getNumRiesgo() + "");
			datos.setHabitacion(datosMinimos.getHabitacion());
			datos.setEdad(datosMinimos.getEdad() + "");

			proveedor(datos, datosMinimos, listTelPro, task);

			datos.setObs(datosMinimos.getObs());
			datos.setAreaIngreso(datosMinimos.getAreaIngreso() + "");
			datos.setFecIngreso(datosMinimos.getFecIngreso() + "");
			datos.setFecNacimiento(datosMinimos.getFecNacimiento() + "");

			datos.setTipPago(datosMinimos.getTipPago() + "");
			datos.setSectorDescripcion(datosMinimos.getSectorDescripcion());
			datos.setFecIngreso(datosMinimos.getFecIngreso() + "");
			datos.setProceso(datosMinimos.getProceso());
			datos.setFecOcurrido(datosMinimos.getFecOcurrido() + "");
			datos.setFecProcSini(datosMinimos.getFecProcSini() + "");

			contratante(datos, datosMinimos);

			datos.setResultadoDictamen(datosMinimos.getResultadoDictamen());
			datos.setNumSini(datosMinimos.getNumSini() + "");
			datos.setMonto(datosMinimos.getMonto() + "");

			poliza(datos, datosMinimos);

			datos.setHoraIngreso(datosMinimos.getHoraIngreso());
			datos.setTipIngreso(datosMinimos.getTipIngreso() + "");
			datos.setCodSector(datosMinimos.getCodSector() + "");

			afectado(datos, datosMinimos);

			datos.setMotivoSegmentacion(datosMinimos.getMotivoSegmentacion());
			datos.setTipExp(datosMinimos.getTipExp());
			datos.setNumPoliza(datosMinimos.getNumPoliza());
			datos.setFecDic(datosMinimos.getFecDic() + "");
			datos.setExclusionesRiesgo1("-");
			datos.setTaskLastAceptedBy("-");
			datos.setTopeCoaseguroPd2("-");
			datos.setCoaseguroPd2("-");
			List<Diagnosticos> listDiagnosticos = datosMinimos.getDiagnosticos();
			if(listDiagnosticos.size() > 0) {
				for (int index = 0; index < listDiagnosticos.size(); index++) {
					Diagnosticos diag = listDiagnosticos.get(index);
					DiagnosticoCm diagnosticos = new DiagnosticoCm();
					diagnosticos.setTratamiento(diag.getTratamiento());
					diagnosticos.setTipMedico(diag.getTipMedico());
					diagnosticos.setCpt(diag.getCpt4());
					diagnosticos.setNombreMedico(diag.getNombreMedico());
					diagnosticos.setDescripcion(diag.getDescr());
					diagnosticos.setCoidIcd(diag.getCodIcd());
					diagnosticos.setEspecialidad(diag.getEspecialidad());
					diagnosticos.setFolio(task.getCustomTaskID());
					listDiag.add(diagnosticos);
				}
			}
			
		}

	}

	private void afectado(DatosGeneralesCmHistorico datos, DatosMinimos datosMinimos) {
		Afectado con = datosMinimos.getAfectado();
		if (con != null) {
			log.info("Method:afectado");
			datos.setApePatAfectado(con.getApePat());
			datos.setApeMatAfectado(con.getApeMat());
			datos.setNombreAfectado(con.getNombre());
			datos.setSexoAfectado(con.getSexo());
		}
	}

	private void poliza(DatosGeneralesCmHistorico datos, DatosMinimos datosMinimos) {
		Poliza pol = datosMinimos.getPoliza();
		if (pol != null) {
			log.info("Method:poliza");
			datos.setCodNivel2(pol.getCodNivel1() + "");
			datos.setCodNivel1(pol.getCodNivel1() + "");
			datos.setStatusPoliza(pol.getStatusPoliza());
			datos.setVigenciaFin(pol.getVigenciaFin() + "");
			datos.setStatusPagado(pol.getStatusPago());
			datos.setVigenciaIni(pol.getVigenciaIni() + "");
		}

	}

	private void contratante(DatosGeneralesCmHistorico datos, DatosMinimos datosMinimos) {
		Contratante con = datosMinimos.getContratante();
		if (con != null) {
			log.info("Method:contratante");
			datos.setApePatContratante(con.getApePat());
			datos.setApeMatContratante(con.getApeMat());
			datos.setNombreContratante(con.getNombre());
		}

	}

	private void proveedor(DatosGeneralesCmHistorico datos, DatosMinimos datosMinimos,List<TelefonoProveedorCm> listTelPro,TaskInfo task) {
		Proveedor pro = datosMinimos.getProveedor();
		if (pro != null) {
			log.info("Method:proveedor");
			datos.setSucursal(pro.getSucursal());
			datos.setRfc(pro.getRfc());
			datos.setEmailProveedor(pro.getEmail());
			datos.setApePatProveedor(pro.getApePat());
			datos.setApePatMatProveedor(pro.getApeMat());
			datos.setNombreProveedor(pro.getNombre());
			List<String> listTel = pro.getTelefonos();
			if(listTel.size() > 0 ) {
				for (int index = 0; index < listTel.size(); index++) {
					TelefonoProveedorCm tel = new TelefonoProveedorCm();
					tel.setTel(listTel.get(index));
					tel.setFolio(task.getCustomTaskID());
					listTelPro.add(tel);
				}
			}
			
		}
	}

	private void contacto(DatosGeneralesCmHistorico datos, DatosMinimos datosMinimos) {
		Contacto contacto = datosMinimos.getContacto();
		if (contacto != null) {
			log.info("Method:contacto");
			datos.setTel(contacto.getTel());
			datos.setEmail(contacto.getEmail());
			datos.setApePat(contacto.getApePat());
			datos.setApeMat(contacto.getApeMat());
			datos.setFax(contacto.getFax());
			datos.setNombre(contacto.getNombre());
		}
	}

	private void gca(DatosGeneralesCmHistorico datos, TaskData taskData) {
		DictamenMedico dictamen = taskData.getDictamenMedico();
		if(dictamen != null) {
		GCA gca = dictamen.getGCA();
		if (gca != null) {
			log.info("Method:gca");
			datos.setCoaseguroHonoratioMedtxt(gca.getCoaseguroHonorariosMedicosTxt());
			datos.setCoaseguroHospital(gca.getCoaseguroHospital() + "");
			datos.setDeducible(gca.getDeducible() + "");
			datos.setCoaseguroHonorariosMedicos(gca.getCoaseguroHonorariosMedicos() + "");
			datos.setCoaseguroHospitalTxt(gca.getCoaseguroHospitalTxt());
		}
		}
	}

	private void rma(DatosGeneralesCmHistorico datos, TaskData taskData) {
		DictamenMedico dictamen = taskData.getDictamenMedico();
		if (dictamen != null) {
			RMA rma = dictamen.getRMA();
			if (rma != null) {
				log.info("Method:crma");
				datos.setObsAjuste(rma.getObsAjustes());
				datos.setAyudante(rma.getAyudante() + "");
				datos.setAnestesiologo(rma.getAnestesiologo() + "");
				datos.setAjustes(rma.getAjustes() + "");
				datos.setHospital(rma.getHospital() + "");
				datos.setHonorariosMedicos(rma.getHonorariosMedicos() + "");
				datos.setCirujano(rma.getCirujano() + "");
			}
		}

	}

	private void dictamenMedico(DatosGeneralesCmHistorico datos, TaskData taskData) {
		DictamenMedico dictamen = taskData.getDictamenMedico();
		if (dictamen != null) {
			log.info("Method:dictamenMedico");
			datos.setDeduciblec(dictamen.getDeducibleC() + "");
			datos.setPlan(dictamen.getPlan());
			datos.setAseguradora(dictamen.getAseguradora());
			datos.setTopeCoaseguroC(dictamen.getTopeCoaseguroC() + "");
			datos.setSumaAsegurada(dictamen.getSumaAsegurada() + "");
			datos.setEndosoEspeciales(dictamen.getEndosoEspeciales());
			datos.setExclusionesRiesgo(dictamen.getEndosoEspeciales());

			datos.setTopeCoaseguroPd(dictamen.getTopeCoaseguroPD() + "");

			datos.setSiniestroPrevios(dictamen.getSiniestrosPrevios());

			datos.setCoaseguroPd(dictamen.getCoaseguroPD() + "");
			datos.setTipPoliza(dictamen.getTipPoliza() + "");
			datos.setDictamen(dictamen.getDictamen() + "");
			datos.setCoaseguroC2(dictamen.getCoaseguroC() + "");
			datos.setFecReconocimientoAntiguedad(dictamen.getFecReconocimientoAntiguedad() + "");
			datos.setDeduciblePd(dictamen.getDeduciblePD() + "");
			datos.setFecAntiguedad(dictamen.getFecAmtiguedad() + "");
			datos.setObsExternas(dictamen.getObsExternas());
			datos.setObsInternas(dictamen.getObsInternas());
		}

	}

	private void taskInfor(DatosGeneralesCmHistorico datos, TaskInfo task, String idTask) {
		log.info("Method:taskInfor input " + task.toString());
		if (task != null) {
			datos.setTaskid(idTask);
			datos.setFolio(task.getCustomTaskID());
			datos.setCreatedDate(task.getCreatedDate() + "");
		}
	}

}
