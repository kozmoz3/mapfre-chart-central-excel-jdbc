package com.mapfre.exceljdbc.entity;

public class TelefonoProveedorCm {
	
	private String folio;
	
	private String tel;

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "TelefonoProveedorCm [folio=" + folio + ", tel=" + tel + "]";
	}
	
	

}
