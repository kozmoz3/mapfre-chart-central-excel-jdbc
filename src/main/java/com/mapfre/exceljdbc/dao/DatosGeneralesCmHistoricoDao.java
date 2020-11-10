package com.mapfre.exceljdbc.dao;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mapfre.exceljdbc.entity.DatosGeneralesCmHistorico;
import com.mapfre.exceljdbc.util.InsertDatosgenUtil;



@Repository
public class DatosGeneralesCmHistoricoDao {

	private final JdbcTemplate jdbcTemplate;

	public DatosGeneralesCmHistoricoDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	@Transactional
	public void insertBatch(List<DatosGeneralesCmHistorico> generales, int batchSize) {
	     String sql = InsertDatosgenUtil.insertDatos();
	     
	     jdbcTemplate.batchUpdate(sql, generales, batchSize,
	            (PreparedStatement ps, DatosGeneralesCmHistorico country) -> {
	            	
	                ps.setString(1, country.getAjustes());
	                ps.setString(2, country.getAnestesiologo());
	                ps.setString(3, country.getApeMat());
	                ps.setString(4, country.getApeMatAfectado());
	                ps.setString(5, country.getApeMatContratante());
	                ps.setString(6, country.getApePat());
	                ps.setString(7, country.getApePatAfectado());
	                ps.setString(8, country.getApePatContratante());
	                ps.setString(9, country.getApePatMatProveedor());
	                ps.setString(10, country.getApePatProveedor());
	                
	                
	                ps.setString(11, country.getAreaIngreso());
	                ps.setString(12, country.getAseguradora());
	                ps.setString(13, country.getAyudante());
	                ps.setString(14, country.getCirujano());
	                ps.setString(15, country.getCoaseguroC2());
	                ps.setString(16, country.getCoaseguroHonorariosMedicos());
	                ps.setString(17, country.getCoaseguroHonoratioMedtxt());
	                ps.setString(18, country.getCoaseguroHospital());
	                ps.setString(19, country.getCoaseguroHospitalTxt());
	                ps.setString(20, country.getCoaseguroPd());
	                
	                
	                ps.setString(21, country.getCoaseguroPd2());
	                ps.setString(22, country.getCodNivel1());
	                ps.setString(23, country.getCodNivel2());
	                ps.setString(24, country.getCodSector());
	                ps.setString(25, country.getCreatedDate());
	                ps.setString(26, country.getDeducible());
	                ps.setString(27, country.getDeduciblePd());
	                ps.setString(28, country.getDeduciblec());
	                ps.setString(29, country.getDictamen());
	                ps.setString(30, country.getEdad());
	            
	                
	                ps.setString(31, country.getEmail());
	                ps.setString(32, country.getEmailProveedor());
	                ps.setString(33, country.getEndosoEspeciales());
	                ps.setString(34, country.getExclusionesRiesgo());
	                ps.setString(35, country.getExclusionesRiesgo1());
	                ps.setString(36, country.getFax());
	                ps.setString(37, country.getFecActDic());
	                ps.setString(38, country.getFecAntiguedad());
	                ps.setString(39, country.getFecDic());
	                ps.setString(40, country.getFecEgreso());
	                
	                
	                ps.setString(41, country.getFecIngreso());
	                ps.setString(42, country.getFecNacimiento());
	                ps.setString(43, country.getFecOcurrido());
	                ps.setString(44, country.getFecProcSini());
	                ps.setString(45, country.getFecReconocimientoAntiguedad());
	                ps.setString(46, country.getHabitacion());
	                ps.setString(47, country.getHonorariosMedicos());
	                ps.setString(48, country.getHoraIngreso());
	                ps.setString(49, country.getHospital());
	                ps.setString(50, country.getMonto());
	       
	                
	                ps.setString(51, country.getMotivoSegmentacion());
	                ps.setString(52, country.getNombre());
	                ps.setString(53, country.getNombreAfectado());
	                ps.setString(54, country.getNombreContratante());
	                ps.setString(55, country.getNombreProveedor());
	                ps.setString(56, country.getNumPoliza());
	                ps.setString(57, country.getNumRiesgo());
	                ps.setString(58, country.getNumSini());
	                ps.setString(59, country.getObs());
	                ps.setString(60, country.getObsAjuste());       
	                
	                
	                ps.setString(61, country.getObsExternas());
	                ps.setString(62, country.getObsInternas());
	                ps.setString(63, country.getPlan());
	                ps.setString(64, country.getProceso());
	                ps.setString(65, country.getResultadoDictamen());
	                ps.setString(66, country.getRfc());
	                ps.setString(67, country.getSectorDescripcion());
	                ps.setString(68, country.getSexoAfectado());
	                ps.setString(69, country.getSiniestroPrevios());
	                ps.setString(70, country.getSiniestrosPrevios());
	                
    				
	                ps.setString(71, country.getStatusPagado());
	                ps.setString(72, country.getStatusPoliza());
	                ps.setString(73, country.getSucursal());
	                ps.setString(74, country.getSumaAsegurada());
	                ps.setString(75, country.getTaskLastAceptedBy());
	                ps.setString(76, country.getTaskid());
	                ps.setString(77, country.getTel());
	                ps.setString(78, country.getTipExp());
	                ps.setString(79, country.getTipIngreso());
	                ps.setString(80, country.getTipPago());
	                
	                ps.setString(81, country.getTipPoliza());
	                ps.setString(82, country.getTopeCoaseguroC());
	                ps.setString(83, country.getTopeCoaseguroPd());
	                ps.setString(84, country.getTopeCoaseguroPd2());
	                ps.setString(85, country.getUsrDictaminador());
	                ps.setString(86, country.getVigenciaFin());
	                ps.setString(87, country.getVigenciaIni());
	                ps.setString(88, country.getFolio());
	                
	                
	            }
	     );
	}
}
