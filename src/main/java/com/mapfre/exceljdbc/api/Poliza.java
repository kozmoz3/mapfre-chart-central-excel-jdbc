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
 * <p>Clase Java para Poliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Poliza"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cod_nivel2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cod_nivel1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="status_poliza" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vigencia_fin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="status_pago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vigencia_ini" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Poliza", propOrder = {
    "codNivel2",
    "codNivel1",
    "statusPoliza",
    "vigenciaFin",
    "statusPago",
    "vigenciaIni"
})
public class Poliza {

    @XmlElement(name = "cod_nivel2", required = true, type = Integer.class, nillable = true)
    protected Integer codNivel2;
    @XmlElement(name = "cod_nivel1", required = true, type = Integer.class, nillable = true)
    protected Integer codNivel1;
    @XmlElement(name = "status_poliza", required = true, nillable = true)
    protected String statusPoliza;
    @XmlElement(name = "vigencia_fin", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vigenciaFin;
    @XmlElement(name = "status_pago", required = true, nillable = true)
    protected String statusPago;
    @XmlElement(name = "vigencia_ini", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vigenciaIni;

    /**
     * Obtiene el valor de la propiedad codNivel2.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodNivel2() {
        return codNivel2;
    }

    /**
     * Define el valor de la propiedad codNivel2.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodNivel2(Integer value) {
        this.codNivel2 = value;
    }

    /**
     * Obtiene el valor de la propiedad codNivel1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodNivel1() {
        return codNivel1;
    }

    /**
     * Define el valor de la propiedad codNivel1.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodNivel1(Integer value) {
        this.codNivel1 = value;
    }

    /**
     * Obtiene el valor de la propiedad statusPoliza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusPoliza() {
        return statusPoliza;
    }

    /**
     * Define el valor de la propiedad statusPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusPoliza(String value) {
        this.statusPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad vigenciaFin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVigenciaFin() {
        return vigenciaFin;
    }

    /**
     * Define el valor de la propiedad vigenciaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVigenciaFin(XMLGregorianCalendar value) {
        this.vigenciaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad statusPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusPago() {
        return statusPago;
    }

    /**
     * Define el valor de la propiedad statusPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusPago(String value) {
        this.statusPago = value;
    }

    /**
     * Obtiene el valor de la propiedad vigenciaIni.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVigenciaIni() {
        return vigenciaIni;
    }

    /**
     * Define el valor de la propiedad vigenciaIni.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVigenciaIni(XMLGregorianCalendar value) {
        this.vigenciaIni = value;
    }

}
