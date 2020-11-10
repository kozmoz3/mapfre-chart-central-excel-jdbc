//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.05 a las 06:51:41 PM CST 
//


package com.mapfre.exceljdbc.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para DatosMinimos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosMinimos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fec_act_dic" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="usr_dictaminador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Contacto" type="{http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc}Contacto"/&gt;
 *         &lt;element name="num_riesgo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="habitacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="edad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Proveedor" type="{http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc}Proveedor"/&gt;
 *         &lt;element name="obs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="area_ingreso" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fec_ingreso" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="fec_nacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="tip_pago" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sector_descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fec_egreso" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="proceso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fec_ocurrido" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="fec_proc_sini" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Contratante" type="{http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc}Contratante"/&gt;
 *         &lt;element name="resultado_dictamen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="num_sini" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Poliza" type="{http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc}Poliza"/&gt;
 *         &lt;element name="hora_ingreso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tip_ingreso" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cod_sector" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Afectado" type="{http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc}Afectado"/&gt;
 *         &lt;element name="motivo_segmentacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tip_exp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="num_poliza" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fec_dic" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Diagnosticos" type="{http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc}Diagnosticos" maxOccurs="unbounded"/&gt;
 *         &lt;element name="num_exp" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosMinimos", propOrder = {
    "fecActDic",
    "usrDictaminador",
    "contacto",
    "numRiesgo",
    "habitacion",
    "edad",
    "proveedor",
    "obs",
    "areaIngreso",
    "fecIngreso",
    "fecNacimiento",
    "tipPago",
    "folio",
    "sectorDescripcion",
    "fecEgreso",
    "proceso",
    "fecOcurrido",
    "fecProcSini",
    "contratante",
    "resultadoDictamen",
    "numSini",
    "monto",
    "poliza",
    "horaIngreso",
    "tipIngreso",
    "codSector",
    "afectado",
    "motivoSegmentacion",
    "tipExp",
    "numPoliza",
    "fecDic",
    "diagnosticos",
    "numExp",
    "aux"
})
public class DatosMinimos {

    @XmlElement(name = "fec_act_dic", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecActDic;
    @XmlElement(name = "usr_dictaminador", required = true, nillable = true)
    protected String usrDictaminador;
    @XmlElement(name = "Contacto", required = true, nillable = true)
    protected Contacto contacto;
    @XmlElement(name = "num_riesgo", required = true, type = Integer.class, nillable = true)
    protected Integer numRiesgo;
    @XmlElement(required = true, nillable = true)
    protected String habitacion;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer edad;
    @XmlElement(name = "Proveedor", required = true, nillable = true)
    protected Proveedor proveedor;
    @XmlElement(required = true, nillable = true)
    protected String obs;
    @XmlElement(name = "area_ingreso", required = true, type = Integer.class, nillable = true)
    protected Integer areaIngreso;
    @XmlElement(name = "fec_ingreso", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecIngreso;
    @XmlElement(name = "fec_nacimiento", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecNacimiento;
    @XmlElement(name = "tip_pago", required = true, type = Integer.class, nillable = true)
    protected Integer tipPago;
    @XmlElement(required = true, nillable = true)
    protected String folio;
    @XmlElement(name = "sector_descripcion", required = true, nillable = true)
    protected String sectorDescripcion;
    @XmlElement(name = "fec_egreso", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecEgreso;
    @XmlElement(required = true, nillable = true)
    protected String proceso;
    @XmlElement(name = "fec_ocurrido", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecOcurrido;
    @XmlElement(name = "fec_proc_sini", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecProcSini;
    @XmlElement(name = "Contratante", required = true, nillable = true)
    protected Contratante contratante;
    @XmlElement(name = "resultado_dictamen", required = true, nillable = true)
    protected String resultadoDictamen;
    @XmlElement(name = "num_sini", required = true, type = Long.class, nillable = true)
    protected Long numSini;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double monto;
    @XmlElement(name = "Poliza", required = true, nillable = true)
    protected Poliza poliza;
    @XmlElement(name = "hora_ingreso", required = true, nillable = true)
    protected String horaIngreso;
    @XmlElement(name = "tip_ingreso", required = true, type = Integer.class, nillable = true)
    protected Integer tipIngreso;
    @XmlElement(name = "cod_sector", required = true, type = Integer.class, nillable = true)
    protected Integer codSector;
    @XmlElement(name = "Afectado", required = true, nillable = true)
    protected Afectado afectado;
    @XmlElement(name = "motivo_segmentacion", required = true, nillable = true)
    protected String motivoSegmentacion;
    @XmlElement(name = "tip_exp", required = true, nillable = true)
    protected String tipExp;
    @XmlElement(name = "num_poliza", required = true, nillable = true)
    protected String numPoliza;
    @XmlElement(name = "fec_dic", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecDic;
    @XmlElement(name = "Diagnosticos", required = true, nillable = true)
    protected List<Diagnosticos> diagnosticos;
    @XmlElement(name = "num_exp", required = true, type = Integer.class, nillable = true)
    protected Integer numExp;
    
    @XmlElement(name = "Aux", required = true, nillable = true)
    protected Auxi aux;
    
    
    

    public Auxi getAux() {
		return aux;
	}

	public void setAux(Auxi aux) {
		this.aux = aux;
	}

	/**
     * Obtiene el valor de la propiedad fecActDic.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecActDic() {
        return fecActDic;
    }

    /**
     * Define el valor de la propiedad fecActDic.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecActDic(XMLGregorianCalendar value) {
        this.fecActDic = value;
    }

    /**
     * Obtiene el valor de la propiedad usrDictaminador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrDictaminador() {
        return usrDictaminador;
    }

    /**
     * Define el valor de la propiedad usrDictaminador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrDictaminador(String value) {
        this.usrDictaminador = value;
    }

    /**
     * Obtiene el valor de la propiedad contacto.
     * 
     * @return
     *     possible object is
     *     {@link Contacto }
     *     
     */
    public Contacto getContacto() {
        return contacto;
    }

    /**
     * Define el valor de la propiedad contacto.
     * 
     * @param value
     *     allowed object is
     *     {@link Contacto }
     *     
     */
    public void setContacto(Contacto value) {
        this.contacto = value;
    }

    /**
     * Obtiene el valor de la propiedad numRiesgo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRiesgo() {
        return numRiesgo;
    }

    /**
     * Define el valor de la propiedad numRiesgo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRiesgo(Integer value) {
        this.numRiesgo = value;
    }

    /**
     * Obtiene el valor de la propiedad habitacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabitacion() {
        return habitacion;
    }

    /**
     * Define el valor de la propiedad habitacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabitacion(String value) {
        this.habitacion = value;
    }

    /**
     * Obtiene el valor de la propiedad edad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * Define el valor de la propiedad edad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEdad(Integer value) {
        this.edad = value;
    }

    /**
     * Obtiene el valor de la propiedad proveedor.
     * 
     * @return
     *     possible object is
     *     {@link Proveedor }
     *     
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * Define el valor de la propiedad proveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link Proveedor }
     *     
     */
    public void setProveedor(Proveedor value) {
        this.proveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad obs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObs() {
        return obs;
    }

    /**
     * Define el valor de la propiedad obs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObs(String value) {
        this.obs = value;
    }

    /**
     * Obtiene el valor de la propiedad areaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAreaIngreso() {
        return areaIngreso;
    }

    /**
     * Define el valor de la propiedad areaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAreaIngreso(Integer value) {
        this.areaIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad fecIngreso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecIngreso() {
        return fecIngreso;
    }

    /**
     * Define el valor de la propiedad fecIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecIngreso(XMLGregorianCalendar value) {
        this.fecIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad fecNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecNacimiento() {
        return fecNacimiento;
    }

    /**
     * Define el valor de la propiedad fecNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecNacimiento(XMLGregorianCalendar value) {
        this.fecNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipPago.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipPago() {
        return tipPago;
    }

    /**
     * Define el valor de la propiedad tipPago.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipPago(Integer value) {
        this.tipPago = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad sectorDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorDescripcion() {
        return sectorDescripcion;
    }

    /**
     * Define el valor de la propiedad sectorDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorDescripcion(String value) {
        this.sectorDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad fecEgreso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecEgreso() {
        return fecEgreso;
    }

    /**
     * Define el valor de la propiedad fecEgreso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecEgreso(XMLGregorianCalendar value) {
        this.fecEgreso = value;
    }

    /**
     * Obtiene el valor de la propiedad proceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProceso() {
        return proceso;
    }

    /**
     * Define el valor de la propiedad proceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProceso(String value) {
        this.proceso = value;
    }

    /**
     * Obtiene el valor de la propiedad fecOcurrido.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecOcurrido() {
        return fecOcurrido;
    }

    /**
     * Define el valor de la propiedad fecOcurrido.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecOcurrido(XMLGregorianCalendar value) {
        this.fecOcurrido = value;
    }

    /**
     * Obtiene el valor de la propiedad fecProcSini.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecProcSini() {
        return fecProcSini;
    }

    /**
     * Define el valor de la propiedad fecProcSini.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecProcSini(XMLGregorianCalendar value) {
        this.fecProcSini = value;
    }

    /**
     * Obtiene el valor de la propiedad contratante.
     * 
     * @return
     *     possible object is
     *     {@link Contratante }
     *     
     */
    public Contratante getContratante() {
        return contratante;
    }

    /**
     * Define el valor de la propiedad contratante.
     * 
     * @param value
     *     allowed object is
     *     {@link Contratante }
     *     
     */
    public void setContratante(Contratante value) {
        this.contratante = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoDictamen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoDictamen() {
        return resultadoDictamen;
    }

    /**
     * Define el valor de la propiedad resultadoDictamen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoDictamen(String value) {
        this.resultadoDictamen = value;
    }

    /**
     * Obtiene el valor de la propiedad numSini.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSini() {
        return numSini;
    }

    /**
     * Define el valor de la propiedad numSini.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSini(Long value) {
        this.numSini = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMonto(Double value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad poliza.
     * 
     * @return
     *     possible object is
     *     {@link Poliza }
     *     
     */
    public Poliza getPoliza() {
        return poliza;
    }

    /**
     * Define el valor de la propiedad poliza.
     * 
     * @param value
     *     allowed object is
     *     {@link Poliza }
     *     
     */
    public void setPoliza(Poliza value) {
        this.poliza = value;
    }

    /**
     * Obtiene el valor de la propiedad horaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraIngreso() {
        return horaIngreso;
    }

    /**
     * Define el valor de la propiedad horaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraIngreso(String value) {
        this.horaIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad tipIngreso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipIngreso() {
        return tipIngreso;
    }

    /**
     * Define el valor de la propiedad tipIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipIngreso(Integer value) {
        this.tipIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad codSector.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodSector() {
        return codSector;
    }

    /**
     * Define el valor de la propiedad codSector.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodSector(Integer value) {
        this.codSector = value;
    }

    /**
     * Obtiene el valor de la propiedad afectado.
     * 
     * @return
     *     possible object is
     *     {@link Afectado }
     *     
     */
    public Afectado getAfectado() {
        return afectado;
    }

    /**
     * Define el valor de la propiedad afectado.
     * 
     * @param value
     *     allowed object is
     *     {@link Afectado }
     *     
     */
    public void setAfectado(Afectado value) {
        this.afectado = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoSegmentacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoSegmentacion() {
        return motivoSegmentacion;
    }

    /**
     * Define el valor de la propiedad motivoSegmentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoSegmentacion(String value) {
        this.motivoSegmentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipExp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipExp() {
        return tipExp;
    }

    /**
     * Define el valor de la propiedad tipExp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipExp(String value) {
        this.tipExp = value;
    }

    /**
     * Obtiene el valor de la propiedad numPoliza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPoliza() {
        return numPoliza;
    }

    /**
     * Define el valor de la propiedad numPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPoliza(String value) {
        this.numPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad fecDic.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecDic() {
        return fecDic;
    }

    /**
     * Define el valor de la propiedad fecDic.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecDic(XMLGregorianCalendar value) {
        this.fecDic = value;
    }

    /**
     * Gets the value of the diagnosticos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosticos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosticos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Diagnosticos }
     * 
     * 
     */
    public List<Diagnosticos> getDiagnosticos() {
        if (diagnosticos == null) {
            diagnosticos = new ArrayList<Diagnosticos>();
        }
        return this.diagnosticos;
    }
    
    

    /**
     * Obtiene el valor de la propiedad numExp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumExp() {
        return numExp;
    }

    /**
     * Define el valor de la propiedad numExp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumExp(Integer value) {
        this.numExp = value;
    }

}
