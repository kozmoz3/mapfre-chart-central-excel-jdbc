package com.mapfre.exceljdbc.entity;

import org.springframework.data.relational.core.mapping.Column;

public class DiagnosticoCm {
	

	@Column("TRATAMIENTO")
	private String tratamiento;

	@Column("TIP_MEDICO")
	private String tipMedico;
	
	@Column("CPT4")
	private String cpt;

	@Column("NOMBRE_MEDICO")
	private String nombreMedico;
	
	@Column("DESCRIPCION")
	private String descripcion;

	@Column("COD_ICD")
	private String coidIcd;
	
	@Column("ESPECIALIDAD")
	private String especialidad;

	@Column("FOLIO")
	private String folio;

	

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getTipMedico() {
		return tipMedico;
	}

	public void setTipMedico(String tipMedico) {
		this.tipMedico = tipMedico;
	}

	public String getCpt() {
		return cpt;
	}

	public void setCpt(String cpt) {
		this.cpt = cpt;
	}

	public String getNombreMedico() {
		return nombreMedico;
	}

	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCoidIcd() {
		return coidIcd;
	}

	public void setCoidIcd(String coidIcd) {
		this.coidIcd = coidIcd;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	@Override
	public String toString() {
		return "DiagnosticoCm [tratamiento=" + tratamiento + ", tipMedico=" + tipMedico + ", cpt=" + cpt
				+ ", nombreMedico=" + nombreMedico + ", descripcion=" + descripcion + ", coidIcd=" + coidIcd
				+ ", especialidad=" + especialidad + ", folio=" + folio + "]";
	}

	
	
	
	
	

}
