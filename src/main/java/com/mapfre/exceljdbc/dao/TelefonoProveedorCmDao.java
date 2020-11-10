package com.mapfre.exceljdbc.dao;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mapfre.exceljdbc.entity.DiagnosticoCm;
import com.mapfre.exceljdbc.entity.TelefonoProveedorCm;


@Repository
public class TelefonoProveedorCmDao {
	
	private final JdbcTemplate jdbcTemplate;

	public TelefonoProveedorCmDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	@Transactional
	public void insertBatch(List<TelefonoProveedorCm>telefono, int batchSize) {
		String sql = "INSERT INTO XXMPF_BPM_CM_HISTORICO_TELPROV"
				   + "(TEL, FOLIO) VALUES(?,?)";
		
		  jdbcTemplate.batchUpdate(sql, telefono, batchSize,
		            (PreparedStatement ps, TelefonoProveedorCm tel) -> {
		            	
		                ps.setString(1, tel.getTel());
		                ps.setString(2, tel.getFolio());
		                
		            });
				
	}

}
