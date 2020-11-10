package com.mapfre.exceljdbc.dao;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mapfre.exceljdbc.entity.DatosGeneralesCmHistorico;
import com.mapfre.exceljdbc.entity.DiagnosticoCm;
import com.mapfre.exceljdbc.util.InsertDatosgenUtil;


@Repository
public class DiagnosticoCmDao {
	
	private final JdbcTemplate jdbcTemplate;

	public DiagnosticoCmDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Transactional
	public void insertBatch(List<DiagnosticoCm>diagnostico, int batchSize) {
		String sql = "INSERT INTO XXMPF_BPM_CM_HISTORICO_DIAGNOS"
				   + "(TRATAMIENTO, TIP_MEDICO, CPT4, NOMBRE_MEDICO, DESCRIPCION, COD_ICD, ESPECIALIDAD, FOLIO)"
				   + "VALUES(?,?,?,?,?,?,?,?)";
	     
	     jdbcTemplate.batchUpdate(sql, diagnostico, batchSize,
	            (PreparedStatement ps, DiagnosticoCm diagnos) -> {
	            	
	                ps.setString(1, diagnos.getTratamiento());
	                ps.setString(2, diagnos.getTipMedico());
	                ps.setString(3, diagnos.getCpt());
	                ps.setString(4, diagnos.getNombreMedico());
	                ps.setString(5, diagnos.getDescripcion());
	                ps.setString(6, diagnos.getCoidIcd());
	                ps.setString(7, diagnos.getEspecialidad());
	                ps.setString(8, diagnos.getFolio());
	            }
	    		 );
	}

}
