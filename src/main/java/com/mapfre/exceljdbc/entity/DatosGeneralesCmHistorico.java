package com.mapfre.exceljdbc.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

/*
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
*/

//@Entity
//@Table(name = "XxmpfBpmCmHistoricoDato")
public class DatosGeneralesCmHistorico {

	@Id
	private String folio;

	@Column("TASKID")
	private String taskid;

	@Column("CREATED_DATE")
	private String createdDate;

	@Column("DEDUCIBLEC")
	private String deduciblec;

	@Column("PLAN")
	private String plan;

	@Column("ASEGURADORA")
	private String aseguradora;

	@Column("TOPE_COASEGURO_C")
	private String topeCoaseguroC;

	@Column("OBS_AJUSTE")
	private String obsAjuste;

	@Column("AYUDANTE")
	private String ayudante;

	@Column("ANESTESIOLOGO")
	private String anestesiologo;

	@Column("AJUSTES")
	private String ajustes;

	@Column("HOSPITAL")
	private String hospital;

	@Column("HONORARIOS_MEDICOS")
	private String honorariosMedicos;

	@Column("CIRUJANO")
	private String cirujano;

	@Column("SUMA_ASEGURADA")
	private String sumaAsegurada;

	@Column("ENDOSO_ESPECIALES")
	private String endosoEspeciales;

	@Column("EXCLUSIONES_RIESGO")
	private String exclusionesRiesgo;

	@Column("TOPE_COASEGURO_PD")
	private String topeCoaseguroPd;

	@Column("SINIESTROS_PREVIOS")
	private String siniestroPrevios;

	@Column("COASEGURO_PD")
	private String coaseguroPd;

	@Column("TOPE_COASEGURO_PD2")
	private String topeCoaseguroPd2;

	@Column("SINIESTOS_PREVIOS2")
	private String siniestrosPrevios;

	@Column("COASEGURO_PD2")
	private String coaseguroPd2;

	@Column("TIP_POLIZA")
	private String tipPoliza;

	@Column("DICTAMEN")
	private String dictamen;

	//@Column(name = "COASEGURO_C2")
	private String coaseguroC2;

	//@Column(name = "FEC_RECONOCIMIENTO_ANTIGUEDAD")
	private String fecReconocimientoAntiguedad;

	//@Column(name = "COASEGURO_HONORARIO_MED_TXT")
	private String coaseguroHonoratioMedtxt;

	//@Column(name = "COASEGURO_HOSPITAL")
	private String coaseguroHospital;

	//@Column(name = "DEDUCIBLE")
	private String deducible;

	//@Column(name = "COASEGURO_HONORARIO_MEDICOS")
	private String coaseguroHonorariosMedicos;

	@Column("COASEGURO_HOSPITAL_TXT")
	private String coaseguroHospitalTxt;

	@Column("DEDUCIBLE_PD")
	private String deduciblePd;

	@Column("FEC_AMTIGUEDAD")
	private String fecAntiguedad;

	@Column("OBS_EXTERNAS")
	private String obsExternas;

	@Column("OBS_INTERNAS")
	private String obsInternas;

	@Column("FEC_ACT_DIC")
	private String fecActDic;

	@Column("USR_DICTAMINADOR")
	private String usrDictaminador;

	
	//@Column(name = "TEL")
	private String tel;

	//@Column(name = "EMAIL")
	private String email;

	//@Column(name = "APE_PAT")
	private String apePat;
	
	//@Column(name = "APE_MAT")
	private String apeMat;

	//@Column(name = "FAX")
	private String fax;

	//@Column(name = "NOMBRE")
	private String nombre;

	//@Column(name = "NUM_RIESGO")
	private String numRiesgo;

	//@Column(name = "HABITACION")
	private String habitacion;

	//@Column(name = "TASK_LAST_ACEPTED_BY")
	private String taskLastAceptedBy;

	//@Column(name = "EDAD")
	private String edad;

	//@Column(name = "SUCURSAL")
	private String sucursal;

	//@Column(name = "RFC")
	private String rfc;

	//@Column(name = "EMAIL_PROVEEDOR")
	private String emailProveedor;

	//@Column(name = "APE_PAT_PROVEEDOR")
	private String apePatProveedor;

	//@Column(name = "APE_PAT_MAT_PROVEEDOR")
	private String apePatMatProveedor;

	//@Column(name = "NOMBRE_PROVEEDOR")
	private String nombreProveedor;

	//@Column(name = "OBS")
	private String obs;

	//@Column(name = "AREA_INGRESO")
	private String areaIngreso;

	//@Column(name = "FEC_INGRESO")
	private String fecIngreso;

	//@Column(name = "FEC_NACIMIENTO")
	private String fecNacimiento;

	//@Column(name = "TIP_PAGO")
	private String tipPago;

	//@Column(name = "SECTOR_DESCRIPCION")
	private String sectorDescripcion;

	//@Column(name = "FEC_EGRESO")
	private String fecEgreso;

	//@Column(name = "PROCESO")
	private String proceso;

	//@Column(name = "FEC_OCURRIDO")
	private String fecOcurrido;

	//@Column(name = "FEC_PROC_SINI")
	private String fecProcSini;

	//@Column(name = "APE_PAT_CONTRATANTE")
	private String apePatContratante;

	//@Column(name = "APE_MAT_CONTRATANTE")
	private String apeMatContratante;

	//@Column(name = "NOMBRE_CONTRATANTE")
	private String nombreContratante;

	//@Column(name = "RESULTADO_DICTAMEN")
	private String resultadoDictamen;

	//@Column(name = "NUM_SINI")
	private String numSini;

	//@Column(name = "MONTO")
	private String monto;

	//@Column(name = "COD_NIVEL2")
	private String codNivel2;

	//@Column(name = "COD_NIVEL1")
	private String codNivel1;

	//@Column(name = "STATUS_POLIZA")
	private String statusPoliza;

	//@Column(name = "VIGENCIA_FIN")
	private String vigenciaFin;

	//@Column(name = "STATUS_PAGADO")
	private String statusPagado;

	//@Column(name = "VIGENCIA_INI")
	private String vigenciaIni;

	//@Column(name = "HORA_INGRESO")
	private String horaIngreso;

	//@Column(name = "TIP_INGRESO")
	private String tipIngreso;

	//@Column(name = "COD_SECTOR")
	private String codSector;

	//@Column(name = "APE_PAT_AFECTADO")
	private String apePatAfectado;

	//@Column(name = "APE_MAT_AFECTADO")
	private String apeMatAfectado;

	//@Column(name = "SEXO_AFECTADO")
	private String sexoAfectado;

	//@Column(name = "NOMBRE_AFECTADO")
	private String nombreAfectado;

	//@Column(name = "MOTIVO_SEGMENTACION")
	private String motivoSegmentacion;

	//@Column(name = "TIP_EXP")
	private String tipExp;

	//@Column(name = "NUM_POLIZA")
	private String numPoliza;

	//@Column(name = "FEC_DIC")
	private String fecDic;

	//@Column(name = "EXCLUSIONES_RIESGO1")
	private String exclusionesRiesgo1;

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		if (folio == null) {
			this.folio = "-";
		} else {
			this.folio = folio;
		}
	}

	public String getTaskid() {
		return taskid;
	}

	public void setTaskid(String taskid) {
		if (taskid == null) {
			this.taskid = "-";
		} else {
			this.taskid = taskid;
		}

	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		if (createdDate == null) {
			this.createdDate = "-";
		} else {
			this.createdDate = createdDate;
		}
	}

	public String getDeduciblec() {
		return deduciblec;
	}

	public void setDeduciblec(String deduciblec) {
		if (deduciblec == null) {
			this.deduciblec = "-";
		} else {
			this.deduciblec = deduciblec;
		}
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		if (plan == null) {
			this.plan = "-";
		} else {
			this.plan = plan;
		}
	}

	public String getAseguradora() {
		return aseguradora;
	}

	public void setAseguradora(String aseguradora) {
		if (aseguradora == null) {
			this.aseguradora = "-";
		} else {
			this.aseguradora = aseguradora;
		}
	}

	public String getTopeCoaseguroC() {
		return topeCoaseguroC;
	}

	public void setTopeCoaseguroC(String topeCoaseguroC) {
		if (topeCoaseguroC == null) {
			this.topeCoaseguroC = "-";
		} else {
			this.topeCoaseguroC = topeCoaseguroC;
		}
	}

	public String getObsAjuste() {
		return obsAjuste;
	}

	public void setObsAjuste(String obsAjuste) {
		if (obsAjuste == null) {
			this.obsAjuste = "-";
		} else {
			this.obsAjuste = obsAjuste;
		}
	}

	public String getAyudante() {
		return ayudante;
	}

	public void setAyudante(String ayudante) {
		if (ayudante == null) {
			this.ayudante = "-";
		} else {
			this.ayudante = ayudante;
		}
	}

	public String getAnestesiologo() {
		return anestesiologo;
	}

	public void setAnestesiologo(String anestesiologo) {
		if (anestesiologo == null) {
			this.anestesiologo = "-";
		} else {
			this.anestesiologo = anestesiologo;
		}
	}

	public String getAjustes() {
		return ajustes;
	}

	public void setAjustes(String ajustes) {
		if (ajustes == null) {
			this.ajustes = "-";
		} else {
			this.ajustes = ajustes;
		}
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		if (hospital == null) {
			this.hospital = "-";
		} else {
			this.hospital = hospital;
		}
	}

	public String getHonorariosMedicos() {
		return honorariosMedicos;
	}

	public void setHonorariosMedicos(String honorariosMedicos) {
		if (honorariosMedicos == null) {
			this.honorariosMedicos = "-";
		} else {
			this.honorariosMedicos = honorariosMedicos;
		}
	}

	public String getCirujano() {
		return cirujano;
	}

	public void setCirujano(String cirujano) {
		if (cirujano == null) {
			this.cirujano = "-";
		} else {
			this.cirujano = cirujano;
		}
	}

	public String getSumaAsegurada() {
		return sumaAsegurada;
	}

	public void setSumaAsegurada(String sumaAsegurada) {
		if (sumaAsegurada == null) {
			this.sumaAsegurada = "-";
		} else {
			this.sumaAsegurada = sumaAsegurada;
		}
	}

	public String getEndosoEspeciales() {
		return endosoEspeciales;
	}

	public void setEndosoEspeciales(String endosoEspeciales) {
		if (endosoEspeciales == null) {
			this.endosoEspeciales = "-";
		} else {
			this.endosoEspeciales = endosoEspeciales;
		}
	}

	public String getExclusionesRiesgo() {
		return exclusionesRiesgo;
	}

	public void setExclusionesRiesgo(String exclusionesRiesgo) {
		if (exclusionesRiesgo == null) {
			this.exclusionesRiesgo = "-";
		} else {
			this.exclusionesRiesgo = exclusionesRiesgo;
		}
	}

	public String getTopeCoaseguroPd() {
		return topeCoaseguroPd;
	}

	public void setTopeCoaseguroPd(String topeCoaseguroPd) {
		if (topeCoaseguroPd == null) {
			this.topeCoaseguroPd = "-";
		} else {
			this.topeCoaseguroPd = topeCoaseguroPd;
		}
	}

	public String getSiniestroPrevios() {
		return siniestroPrevios;
	}

	public void setSiniestroPrevios(String siniestroPrevios) {
		if (siniestroPrevios == null) {
			this.siniestroPrevios = "-";
		} else {
			this.siniestroPrevios = siniestroPrevios;
		}
	}

	public String getCoaseguroPd() {
		return coaseguroPd;
	}

	public void setCoaseguroPd(String coaseguroPd) {
		if (coaseguroPd == null) {
			this.coaseguroPd = "-";
		} else {
			this.coaseguroPd = coaseguroPd;
		}
	}

	public String getTopeCoaseguroPd2() {
		return topeCoaseguroPd2;
	}

	public void setTopeCoaseguroPd2(String topeCoaseguroPd2) {
		if (topeCoaseguroPd2 == null) {
			this.topeCoaseguroPd2= "-";
		} else {
			this.topeCoaseguroPd2 = topeCoaseguroPd2;
		}
	}

	public String getSiniestrosPrevios() {
		return siniestrosPrevios;
	}

	public void setSiniestrosPrevios(String siniestrosPrevios) {
		if (siniestrosPrevios == null) {
			this.siniestrosPrevios= "-";
		} else {
			this.siniestrosPrevios = siniestrosPrevios;
		}
	}

	public String getCoaseguroPd2() {
		return coaseguroPd2;
	}

	public void setCoaseguroPd2(String coaseguroPd2) {
		if (coaseguroPd2 == null) {
			this.coaseguroPd2 = "-";
		} else {
			this.coaseguroPd2 = coaseguroPd2;
		}
	}

	public String getTipPoliza() {
		return tipPoliza;
	}

	public void setTipPoliza(String tipPoliza) {
		if (tipPoliza == null) {
			this.tipPoliza = "-";
		} else {
			this.tipPoliza = tipPoliza;
		}
	}

	public String getDictamen() {
		return dictamen;
	}

	public void setDictamen(String dictamen) {
		if (dictamen == null) {
			this.dictamen = "-";
		} else {
			this.dictamen = dictamen;
		}
	}

	public String getCoaseguroC2() {
		return coaseguroC2;
	}

	public void setCoaseguroC2(String coaseguroC2) {
		if (coaseguroC2 == null) {
			this.coaseguroC2 = "-";
		} else {
			this.coaseguroC2 = coaseguroC2;
		}
	}

	public String getFecReconocimientoAntiguedad() {
		return fecReconocimientoAntiguedad;
	}

	public void setFecReconocimientoAntiguedad(String fecReconocimientoAntiguedad) {
		if (fecReconocimientoAntiguedad == null) {
			this.fecReconocimientoAntiguedad = "-";
		} else {
			this.fecReconocimientoAntiguedad = fecReconocimientoAntiguedad;
		}
	}

	public String getCoaseguroHonoratioMedtxt() {
		return coaseguroHonoratioMedtxt;
	}

	public void setCoaseguroHonoratioMedtxt(String coaseguroHonoratioMedtxt) {
		if (coaseguroHonoratioMedtxt == null) {
			this.coaseguroHonoratioMedtxt = "-";
		} else {
			this.coaseguroHonoratioMedtxt = coaseguroHonoratioMedtxt;
		}
	}

	public String getCoaseguroHospital() {
		return coaseguroHospital;
	}

	public void setCoaseguroHospital(String coaseguroHospital) {
		if (coaseguroHospital == null) {
			this.coaseguroHospital = "-";
		} else {
			this.coaseguroHospital = coaseguroHospital;
		}
	}

	public String getDeducible() {
		return deducible;
	}

	public void setDeducible(String deducible) {
		if (deducible == null) {
			this.deducible = "-";
		} else {
			this.deducible = deducible;
		}
	}

	public String getCoaseguroHonorariosMedicos() {
		return coaseguroHonorariosMedicos;
	}

	public void setCoaseguroHonorariosMedicos(String coaseguroHonorariosMedicos) {
		if (coaseguroHonorariosMedicos == null) {
			this.coaseguroHonorariosMedicos = "-";
		} else {
			this.coaseguroHonorariosMedicos = coaseguroHonorariosMedicos;
		}
	}

	public String getCoaseguroHospitalTxt() {
		return coaseguroHospitalTxt;
	}

	public void setCoaseguroHospitalTxt(String coaseguroHospitalTxt) {
		if (coaseguroHospitalTxt == null) {
			this.coaseguroHospitalTxt = "-";
		} else {
			this.coaseguroHospitalTxt = coaseguroHospitalTxt;
		}
	}

	public String getDeduciblePd() {
		return deduciblePd;
	}

	public void setDeduciblePd(String deduciblePd) {
		if (deduciblePd == null) {
			this.deduciblePd = "-";
		} else {
			this.deduciblePd = deduciblePd;
		}
	}

	public String getFecAntiguedad() {
		return fecAntiguedad;
	}

	public void setFecAntiguedad(String fecAntiguedad) {
		if (fecAntiguedad == null) {
			this.fecAntiguedad = "-";
		} else {
			this.fecAntiguedad = fecAntiguedad;
		}
	}

	public String getObsExternas() {
		return obsExternas;
	}

	public void setObsExternas(String obsExternas) {
		if (obsExternas == null) {
			this.obsExternas = "-";
		} else {
			this.obsExternas = obsExternas;
		}
	}

	public String getObsInternas() {
		return obsInternas;
	}

	public void setObsInternas(String obsInternas) {
		if (obsInternas == null) {
			this.obsInternas = "-";
		} else {
			this.obsInternas = obsInternas;
		}
	}

	public String getFecActDic() {
		return fecActDic;
	}

	public void setFecActDic(String fecActDic) {
		if (fecActDic == null) {
			this.fecActDic = "-";
		} else {
			this.fecActDic = fecActDic;
		}
	}

	public String getUsrDictaminador() {
		return usrDictaminador;
	}

	public void setUsrDictaminador(String usrDictaminador) {
		if (usrDictaminador == null) {
			this.usrDictaminador = "-";
		} else {
			this.usrDictaminador = usrDictaminador;
		}
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		if (tel == null) {
			this.tel = "-";
		} else {
			this.tel = tel;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email == null) {
			this.email = "-";
		} else {
			this.email = email;
		}
	}

	public String getApePat() {
		return apePat;
	}

	public void setApePat(String apePat) {
		if (apePat == null) {
			this.apePat = "-";
		} else {
			this.apePat = apePat;
		}
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		if (fax == null) {
			this.fax = "-";
		} else {
			this.fax = fax;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null) {
			this.nombre = "-";
		} else {
			this.nombre = nombre;
		}
	}

	public String getNumRiesgo() {
		return numRiesgo;
	}

	public void setNumRiesgo(String numRiesgo) {
		if (numRiesgo == null) {
			this.numRiesgo = "-";
		} else {
			this.numRiesgo = numRiesgo;
		}
	}

	public String getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(String habitacion) {
		if (habitacion == null) {
			this.habitacion= "-";
		} else {
			this.habitacion = habitacion;
		}
	}

	public String getTaskLastAceptedBy() {
		return taskLastAceptedBy;
	}

	public void setTaskLastAceptedBy(String taskLastAceptedBy) {
		if (taskLastAceptedBy == null) {
			this.taskLastAceptedBy= "-";
		} else {
			this.taskLastAceptedBy = taskLastAceptedBy;
		}
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		if (edad == null) {
			this.edad= "-";
		} else {
			this.edad = edad;
		}
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		if (sucursal == null) {
			this.sucursal= "-";
		} else {
			this.sucursal = sucursal;
		}
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		if (rfc == null) {
			this.rfc= "-";
		} else {
			this.rfc = rfc;
		}
	}

	public String getEmailProveedor() {
		return emailProveedor;
	}

	public void setEmailProveedor(String emailProveedor) {
		if (emailProveedor == null) {
			this.emailProveedor= "-";
		} else {
			this.emailProveedor = emailProveedor;
		}
	}

	public String getApePatProveedor() {
		return apePatProveedor;
	}

	public void setApePatProveedor(String apePatProveedor) {
		if (apePatProveedor == null) {
			this.apePatProveedor= "-";
		} else {
			this.apePatProveedor = apePatProveedor;
		}
	}

	public String getApePatMatProveedor() {
		return apePatMatProveedor;
	}

	public void setApePatMatProveedor(String apePatMatProveedor) {
		if (apePatMatProveedor == null) {
			this.apePatMatProveedor= "-";
		} else {
			this.apePatMatProveedor = apePatMatProveedor;
		}
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		if (nombreProveedor == null) {
			this.nombreProveedor= "-";
		} else {
			this.nombreProveedor = nombreProveedor;
		}
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		if (obs == null) {
			this.obs= "-";
		} else {
			this.obs = nombreProveedor;
		}
	}

	public String getAreaIngreso() {
		return areaIngreso;
	}

	public void setAreaIngreso(String areaIngreso) {
		if (areaIngreso == null) {
			this.areaIngreso= "-";
		} else {
			this.areaIngreso = areaIngreso;
		}
	}

	public String getFecIngreso() {
		return fecIngreso;
	}

	public void setFecIngreso(String fecIngreso) {
		if (fecIngreso == null) {
			this.fecIngreso= "-";
		} else {
			this.fecIngreso = fecIngreso;
		}
	}

	public String getFecNacimiento() {
		return fecNacimiento;
	}

	public void setFecNacimiento(String fecNacimiento) {
		if (fecNacimiento == null) {
			this.fecNacimiento= "-";
		} else {
			this.fecNacimiento = fecNacimiento;
		}
	}

	public String getTipPago() {
		return tipPago;
	}

	public void setTipPago(String tipPago) {
		if (tipPago == null) {
			this.tipPago= "-";
		} else {
			this.tipPago = tipPago;
		}
	}

	public String getSectorDescripcion() {
		return sectorDescripcion;
	}

	public void setSectorDescripcion(String sectorDescripcion) {
		if (sectorDescripcion == null) {
			this.sectorDescripcion= "-";
		} else {
			this.sectorDescripcion = sectorDescripcion;
		}
	}

	public String getFecEgreso() {
		return fecEgreso;
	}

	public void setFecEgreso(String fecEgreso) {
		if (fecEgreso == null) {
			this.fecEgreso= "-";
		} else {
			this.fecEgreso = fecEgreso;
		}
	}

	public String getProceso() {
		return proceso;
	}

	public void setProceso(String proceso) {
		if (proceso == null) {
			this.proceso= "-";
		} else {
			this.proceso = proceso;
		}
	}

	public String getFecOcurrido() {
		return fecOcurrido;
	}

	public void setFecOcurrido(String fecOcurrido) {
		if (fecOcurrido == null) {
			this.fecOcurrido= "-";
		} else {
			this.fecOcurrido = fecOcurrido;
		}
	}

	public String getFecProcSini() {
		return fecProcSini;
	}

	public void setFecProcSini(String fecProcSini) {
		if (fecProcSini == null) {
			this.fecProcSini= "-";
		} else {
			this.fecProcSini = fecProcSini;
		}
	}

	public String getApePatContratante() {
		return apePatContratante;
	}

	public void setApePatContratante(String apePatContratante) {
		if (apePatContratante == null) {
			this.apePatContratante= "-";
		} else {
			this.apePatContratante = apePatContratante;
		}
	}

	public String getApeMatContratante() {
		return apeMatContratante;
	}

	public void setApeMatContratante(String apeMatContratante) {
		if (apeMatContratante == null) {
			this.apeMatContratante= "-";
		} else {
			this.apeMatContratante = apeMatContratante;
		}
	}

	public String getNombreContratante() {
		return nombreContratante;
	}

	public void setNombreContratante(String nombreContratante) {
		if (nombreContratante == null) {
			this.nombreContratante= "-";
		} else {
			this.nombreContratante = nombreContratante;
		}
	}

	public String getResultadoDictamen() {
		return resultadoDictamen;
	}

	public void setResultadoDictamen(String resultadoDictamen) {
		if (resultadoDictamen == null) {
			this.resultadoDictamen= "-";
		} else {
			this.resultadoDictamen = resultadoDictamen;
		}
	}

	public String getNumSini() {
		return numSini;
	}

	public void setNumSini(String numSini) {
		if (numSini == null) {
			this.numSini= "-";
		} else {
			this.numSini = numSini;
		}
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		if (monto == null) {
			this.monto= "-";
		} else {
			this.monto = monto;
		}
	}

	public String getCodNivel2() {
		return codNivel2;
	}

	public void setCodNivel2(String codNivel2) {
		if (codNivel2 == null) {
			this.codNivel2= "-";
		} else {
			this.codNivel2 = codNivel2;
		}
	}

	public String getCodNivel1() {
		return codNivel1;
	}

	public void setCodNivel1(String codNivel1) {
		if (codNivel1 == null) {
			this.codNivel1= "-";
		} else {
			this.codNivel1 = codNivel1;
		}
	}

	public String getStatusPoliza() {
		return statusPoliza;
	}

	public void setStatusPoliza(String statusPoliza) {
		if (statusPoliza == null) {
			this.statusPoliza= "-";
		} else {
			this.statusPoliza = statusPoliza;
		}
	}

	public String getVigenciaFin() {
		return vigenciaFin;
	}

	public void setVigenciaFin(String vigenciaFin) {
		if (vigenciaFin == null) {
			this.vigenciaFin = "-";
		} else {
			this.vigenciaFin = vigenciaFin;
		}
	}

	public String getStatusPagado() {
		return statusPagado;
	}

	public void setStatusPagado(String statusPagado) {
		if (statusPagado == null) {
			this.statusPagado = "-";
		} else {
			this.statusPagado = statusPagado;
		}
	}

	public String getVigenciaIni() {
		return vigenciaIni;
	}

	public void setVigenciaIni(String vigenciaIni) {
		if (vigenciaIni == null) {
			this.vigenciaIni = "-";
		} else {
			this.vigenciaIni = vigenciaIni;
		}
	}

	public String getHoraIngreso() {
		return horaIngreso;
	}

	public void setHoraIngreso(String horaIngreso) {
		if (horaIngreso == null) {
			this.horaIngreso = "-";
		} else {
			this.horaIngreso = horaIngreso;
		}
	}

	public String getTipIngreso() {
		return tipIngreso;
	}

	public void setTipIngreso(String tipIngreso) {
		if (tipIngreso == null) {
			this.tipIngreso = "-";
		} else {
			this.tipIngreso = tipIngreso;
		}
	}

	public String getCodSector() {
		return codSector;
	}

	public void setCodSector(String codSector) {
		if (codSector == null) {
			this.codSector = "-";
		} else {
			this.codSector = codSector;
		}
	}

	public String getApePatAfectado() {
		return apePatAfectado;
	}

	public void setApePatAfectado(String apePatAfectado) {
		if (apePatAfectado == null) {
			this.apePatAfectado = "-";
		} else {
			this.apePatAfectado = apePatAfectado;
		}
	}

	public String getApeMatAfectado() {
		return apeMatAfectado;
	}

	public void setApeMatAfectado(String apeMatAfectado) {
		if (apeMatAfectado == null) {
			this.apeMatAfectado = "-";
		} else {
			this.apeMatAfectado = apeMatAfectado;
		}
	}

	public String getSexoAfectado() {
		return sexoAfectado;
	}

	public void setSexoAfectado(String sexoAfectado) {
		if (sexoAfectado == null) {
			this.sexoAfectado = "-";
		} else {
			this.sexoAfectado = sexoAfectado;
		}
	}

	public String getNombreAfectado() {
		return nombreAfectado;
	}

	public void setNombreAfectado(String nombreAfectado) {
		if (nombreAfectado == null) {
			this.nombreAfectado = "-";
		} else {
			this.nombreAfectado = nombreAfectado;
		}
	}

	public String getMotivoSegmentacion() {
		return motivoSegmentacion;
	}

	public void setMotivoSegmentacion(String motivoSegmentacion) {
		if (motivoSegmentacion == null) {
			this.motivoSegmentacion = "-";
		} else {
			this.motivoSegmentacion = motivoSegmentacion;
		}
	}

	public String getTipExp() {
		return tipExp;
	}

	public void setTipExp(String tipExp) {
		if (tipExp == null) {
			this.tipExp = "-";
		} else {
			this.tipExp = tipExp;
		}
	}

	public String getNumPoliza() {
		return numPoliza;
	}

	public void setNumPoliza(String numPoliza) {
		if (numPoliza == null) {
			this.numPoliza = "-";
		} else {
			this.numPoliza = numPoliza;
		}
	}

	public String getFecDic() {
		return fecDic;
	}

	public void setFecDic(String fecDic) {
		if (fecDic == null) {
			this.fecDic = "-";
		} else {
			this.fecDic = fecDic;
		}
	}

	public String getExclusionesRiesgo1() {
		return exclusionesRiesgo1;
	}

	public void setExclusionesRiesgo1(String exclusionesRiesgo1) {
		if (exclusionesRiesgo1 == null) {
			this.exclusionesRiesgo1 = "-";
		} else {
			this.exclusionesRiesgo1 = exclusionesRiesgo1;
		}
	}
	
	

	public String getApeMat() {
		return apeMat;
	}

	public void setApeMat(String apeMat) {
		if (apeMat == null) {
			this.apeMat = "-";
		} else {
			this.apeMat = apeMat;
		}
	}

	@Override
	public String toString() {
		return "DatosGeneralesCmHistorico [folio=" + folio + ", taskid=" + taskid + ", createdDate=" + createdDate
				+ ", deduciblec=" + deduciblec + ", plan=" + plan + ", aseguradora=" + aseguradora + ", topeCoaseguroC="
				+ topeCoaseguroC + ", obsAjuste=" + obsAjuste + ", ayudante=" + ayudante + ", anestesiologo="
				+ anestesiologo + ", ajustes=" + ajustes + ", hospital=" + hospital + ", honorariosMedicos="
				+ honorariosMedicos + ", cirujano=" + cirujano + ", sumaAsegurada=" + sumaAsegurada
				+ ", endosoEspeciales=" + endosoEspeciales + ", exclusionesRiesgo=" + exclusionesRiesgo
				+ ", topeCoaseguroPd=" + topeCoaseguroPd + ", siniestroPrevios=" + siniestroPrevios + ", coaseguroPd="
				+ coaseguroPd + ", topeCoaseguroPd2=" + topeCoaseguroPd2 + ", siniestrosPrevios=" + siniestrosPrevios
				+ ", coaseguroPd2=" + coaseguroPd2 + ", tipPoliza=" + tipPoliza + ", dictamen=" + dictamen
				+ ", coaseguroC2=" + coaseguroC2 + ", fecReconocimientoAntiguedad=" + fecReconocimientoAntiguedad
				+ ", coaseguroHonoratioMedtxt=" + coaseguroHonoratioMedtxt + ", coaseguroHospital=" + coaseguroHospital
				+ ", deducible=" + deducible + ", coaseguroHonorariosMedicos=" + coaseguroHonorariosMedicos
				+ ", coaseguroHospitalTxt=" + coaseguroHospitalTxt + ", deduciblePd=" + deduciblePd + ", fecAntiguedad="
				+ fecAntiguedad + ", obsExternas=" + obsExternas + ", obsInternas=" + obsInternas + ", fecActDic="
				+ fecActDic + ", usrDictaminador=" + usrDictaminador + ", tel=" + tel + ", email=" + email + ", apePat="
				+ apePat + ", fax=" + fax + ", nombre=" + nombre + ", numRiesgo=" + numRiesgo + ", habitacion="
				+ habitacion + ", taskLastAceptedBy=" + taskLastAceptedBy + ", edad=" + edad + ", sucursal=" + sucursal
				+ ", rfc=" + rfc + ", emailProveedor=" + emailProveedor + ", apePatProveedor=" + apePatProveedor
				+ ", apePatMatProveedor=" + apePatMatProveedor + ", nombreProveedor=" + nombreProveedor + ", obs=" + obs
				+ ", areaIngreso=" + areaIngreso + ", fecIngreso=" + fecIngreso + ", fecNacimiento=" + fecNacimiento
				+ ", tipPago=" + tipPago + ", sectorDescripcion=" + sectorDescripcion + ", fecEgreso=" + fecEgreso
				+ ", proceso=" + proceso + ", fecOcurrido=" + fecOcurrido + ", fecProcSini=" + fecProcSini
				+ ", apePatContratante=" + apePatContratante + ", apeMatContratante=" + apeMatContratante
				+ ", nombreContratante=" + nombreContratante + ", resultadoDictamen=" + resultadoDictamen + ", numSini="
				+ numSini + ", monto=" + monto + ", codNivel2=" + codNivel2 + ", codNivel1=" + codNivel1
				+ ", statusPoliza=" + statusPoliza + ", vigenciaFin=" + vigenciaFin + ", statusPagado=" + statusPagado
				+ ", vigenciaIni=" + vigenciaIni + ", horaIngreso=" + horaIngreso + ", tipIngreso=" + tipIngreso
				+ ", codSector=" + codSector + ", apePatAfectado=" + apePatAfectado + ", apeMatAfectado="
				+ apeMatAfectado + ", sexoAfectado=" + sexoAfectado + ", nombreAfectado=" + nombreAfectado
				+ ", motivoSegmentacion=" + motivoSegmentacion + ", tipExp=" + tipExp + ", numPoliza=" + numPoliza
				+ ", fecDic=" + fecDic + ", exclusionesRiesgo1=" + exclusionesRiesgo1 + "]";
	}

}
