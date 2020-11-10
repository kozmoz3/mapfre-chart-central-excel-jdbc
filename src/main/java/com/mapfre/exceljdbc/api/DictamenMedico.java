//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.05 a las 06:51:41 PM CST 
//


package com.mapfre.exceljdbc.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para DictamenMedico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DictamenMedico"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deducibleC" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="plan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aseguradora" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="topeCoaseguroC" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RMA" type="{http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc}RMA"/&gt;
 *         &lt;element name="Titular" type="{http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc}Titular"/&gt;
 *         &lt;element name="suma_asegurada" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="endoso_especiales" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exclusiones_riesgo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="topeCoaseguroPD" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="siniestros_previos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="coaseguroPD" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tip_poliza" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dictamen" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="coaseguroC" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="fec_reconocimiento_antiguedad" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GCA" type="{http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc}GCA"/&gt;
 *         &lt;element name="deduciblePD" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="fec_amtiguedad" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="obs_externas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="obs_internas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DictamenMedico", propOrder = {
    "deducibleC",
    "plan",
    "aseguradora",
    "topeCoaseguroC",
    "rma",
    "titular",
    "sumaAsegurada",
    "endosoEspeciales",
    "exclusionesRiesgo",
    "topeCoaseguroPD",
    "siniestrosPrevios",
    "coaseguroPD",
    "tipPoliza",
    "dictamen",
    "coaseguroC",
    "fecReconocimientoAntiguedad",
    "gca",
    "deduciblePD",
    "fecAmtiguedad",
    "obsExternas",
    "obsInternas"
})
public class DictamenMedico {

    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double deducibleC;
    @XmlElement(required = true, nillable = true)
    protected String plan;
    @XmlElement(required = true, nillable = true)
    protected String aseguradora;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double topeCoaseguroC;
    @XmlElement(name = "RMA", required = true, nillable = true)
    protected RMA rma;
    @XmlElement(name = "Titular", required = true, nillable = true)
    protected Titular titular;
    @XmlElement(name = "suma_asegurada", required = true, type = Double.class, nillable = true)
    protected Double sumaAsegurada;
    @XmlElement(name = "endoso_especiales", required = true, nillable = true)
    protected String endosoEspeciales;
    @XmlElement(name = "exclusiones_riesgo", required = true, nillable = true)
    protected String exclusionesRiesgo;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double topeCoaseguroPD;
    @XmlElement(name = "siniestros_previos", required = true, nillable = true)
    protected String siniestrosPrevios;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double coaseguroPD;
    @XmlElement(name = "tip_poliza", required = true, type = Integer.class, nillable = true)
    protected Integer tipPoliza;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer dictamen;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double coaseguroC;
    @XmlElement(name = "fec_reconocimiento_antiguedad", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecReconocimientoAntiguedad;
    @XmlElement(name = "GCA", required = true, nillable = true)
    protected GCA gca;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double deduciblePD;
    @XmlElement(name = "fec_amtiguedad", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecAmtiguedad;
    @XmlElement(name = "obs_externas", required = true, nillable = true)
    protected String obsExternas;
    @XmlElement(name = "obs_internas", required = true, nillable = true)
    protected String obsInternas;

    /**
     * Obtiene el valor de la propiedad deducibleC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeducibleC() {
        return deducibleC;
    }

    /**
     * Define el valor de la propiedad deducibleC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeducibleC(Double value) {
        this.deducibleC = value;
    }

    /**
     * Obtiene el valor de la propiedad plan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlan() {
        return plan;
    }

    /**
     * Define el valor de la propiedad plan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlan(String value) {
        this.plan = value;
    }

    /**
     * Obtiene el valor de la propiedad aseguradora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAseguradora() {
        return aseguradora;
    }

    /**
     * Define el valor de la propiedad aseguradora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAseguradora(String value) {
        this.aseguradora = value;
    }

    /**
     * Obtiene el valor de la propiedad topeCoaseguroC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTopeCoaseguroC() {
        return topeCoaseguroC;
    }

    /**
     * Define el valor de la propiedad topeCoaseguroC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTopeCoaseguroC(Double value) {
        this.topeCoaseguroC = value;
    }

    /**
     * Obtiene el valor de la propiedad rma.
     * 
     * @return
     *     possible object is
     *     {@link RMA }
     *     
     */
    public RMA getRMA() {
        return rma;
    }

    /**
     * Define el valor de la propiedad rma.
     * 
     * @param value
     *     allowed object is
     *     {@link RMA }
     *     
     */
    public void setRMA(RMA value) {
        this.rma = value;
    }

    /**
     * Obtiene el valor de la propiedad titular.
     * 
     * @return
     *     possible object is
     *     {@link Titular }
     *     
     */
    public Titular getTitular() {
        return titular;
    }

    /**
     * Define el valor de la propiedad titular.
     * 
     * @param value
     *     allowed object is
     *     {@link Titular }
     *     
     */
    public void setTitular(Titular value) {
        this.titular = value;
    }

    /**
     * Obtiene el valor de la propiedad sumaAsegurada.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSumaAsegurada() {
        return sumaAsegurada;
    }

    /**
     * Define el valor de la propiedad sumaAsegurada.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSumaAsegurada(Double value) {
        this.sumaAsegurada = value;
    }

    /**
     * Obtiene el valor de la propiedad endosoEspeciales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndosoEspeciales() {
        return endosoEspeciales;
    }

    /**
     * Define el valor de la propiedad endosoEspeciales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndosoEspeciales(String value) {
        this.endosoEspeciales = value;
    }

    /**
     * Obtiene el valor de la propiedad exclusionesRiesgo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusionesRiesgo() {
        return exclusionesRiesgo;
    }

    /**
     * Define el valor de la propiedad exclusionesRiesgo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusionesRiesgo(String value) {
        this.exclusionesRiesgo = value;
    }

    /**
     * Obtiene el valor de la propiedad topeCoaseguroPD.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTopeCoaseguroPD() {
        return topeCoaseguroPD;
    }

    /**
     * Define el valor de la propiedad topeCoaseguroPD.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTopeCoaseguroPD(Double value) {
        this.topeCoaseguroPD = value;
    }

    /**
     * Obtiene el valor de la propiedad siniestrosPrevios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiniestrosPrevios() {
        return siniestrosPrevios;
    }

    /**
     * Define el valor de la propiedad siniestrosPrevios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiniestrosPrevios(String value) {
        this.siniestrosPrevios = value;
    }

    /**
     * Obtiene el valor de la propiedad coaseguroPD.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoaseguroPD() {
        return coaseguroPD;
    }

    /**
     * Define el valor de la propiedad coaseguroPD.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoaseguroPD(Double value) {
        this.coaseguroPD = value;
    }

    /**
     * Obtiene el valor de la propiedad tipPoliza.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipPoliza() {
        return tipPoliza;
    }

    /**
     * Define el valor de la propiedad tipPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipPoliza(Integer value) {
        this.tipPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad dictamen.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDictamen() {
        return dictamen;
    }

    /**
     * Define el valor de la propiedad dictamen.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDictamen(Integer value) {
        this.dictamen = value;
    }

    /**
     * Obtiene el valor de la propiedad coaseguroC.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoaseguroC() {
        return coaseguroC;
    }

    /**
     * Define el valor de la propiedad coaseguroC.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoaseguroC(Double value) {
        this.coaseguroC = value;
    }

    /**
     * Obtiene el valor de la propiedad fecReconocimientoAntiguedad.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecReconocimientoAntiguedad() {
        return fecReconocimientoAntiguedad;
    }

    /**
     * Define el valor de la propiedad fecReconocimientoAntiguedad.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecReconocimientoAntiguedad(XMLGregorianCalendar value) {
        this.fecReconocimientoAntiguedad = value;
    }

    /**
     * Obtiene el valor de la propiedad gca.
     * 
     * @return
     *     possible object is
     *     {@link GCA }
     *     
     */
    public GCA getGCA() {
        return gca;
    }

    /**
     * Define el valor de la propiedad gca.
     * 
     * @param value
     *     allowed object is
     *     {@link GCA }
     *     
     */
    public void setGCA(GCA value) {
        this.gca = value;
    }

    /**
     * Obtiene el valor de la propiedad deduciblePD.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeduciblePD() {
        return deduciblePD;
    }

    /**
     * Define el valor de la propiedad deduciblePD.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeduciblePD(Double value) {
        this.deduciblePD = value;
    }

    /**
     * Obtiene el valor de la propiedad fecAmtiguedad.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecAmtiguedad() {
        return fecAmtiguedad;
    }

    /**
     * Define el valor de la propiedad fecAmtiguedad.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecAmtiguedad(XMLGregorianCalendar value) {
        this.fecAmtiguedad = value;
    }

    /**
     * Obtiene el valor de la propiedad obsExternas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsExternas() {
        return obsExternas;
    }

    /**
     * Define el valor de la propiedad obsExternas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsExternas(String value) {
        this.obsExternas = value;
    }

    /**
     * Obtiene el valor de la propiedad obsInternas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsInternas() {
        return obsInternas;
    }

    /**
     * Define el valor de la propiedad obsInternas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsInternas(String value) {
        this.obsInternas = value;
    }

}
