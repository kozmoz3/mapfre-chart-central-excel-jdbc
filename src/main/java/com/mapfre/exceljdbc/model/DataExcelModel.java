package com.mapfre.exceljdbc.model;

public class DataExcelModel {
	
	private Integer numHoja;
	
	private Integer initRegistro;
	
	private Integer finRegistro;
	
	public DataExcelModel() {}

	public DataExcelModel(Integer numHoja, Integer initRegistro, Integer finRegistro) {
		this.numHoja = numHoja;
		this.initRegistro = initRegistro;
		this.finRegistro = finRegistro;
	}

	public Integer getNumHoja() {
		return numHoja;
	}

	public void setNumHoja(Integer numHoja) {
		this.numHoja = numHoja;
	}

	public Integer getInitRegistro() {
		return initRegistro;
	}

	public void setInitRegistro(Integer initRegistro) {
		this.initRegistro = initRegistro;
	}

	public Integer getFinRegistro() {
		return finRegistro;
	}

	public void setFinRegistro(Integer finRegistro) {
		this.finRegistro = finRegistro;
	}

	@Override
	public String toString() {
		return "DataExcelModel [numHoja=" + numHoja + ", initRegistro=" + initRegistro + ", finRegistro=" + finRegistro
				+ "]";
	}
	
	
	

}
