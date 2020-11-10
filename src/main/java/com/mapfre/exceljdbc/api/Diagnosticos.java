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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Diagnosticos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Diagnosticos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tratamiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tip_medico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cpt4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombre_medico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cod_icd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="especialidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Diagnosticos", propOrder = {
    "tratamiento",
    "tipMedico",
    "cpt4",
    "nombreMedico",
    "descr",
    "codIcd",
    "especialidad"
})
public class Diagnosticos {

    @XmlElement(required = true, nillable = true)
    protected String tratamiento;
    @XmlElement(name = "tip_medico", required = true, nillable = true)
    protected String tipMedico;
    @XmlElement(required = true, nillable = true)
    protected String cpt4;
    @XmlElement(name = "nombre_medico", required = true, nillable = true)
    protected String nombreMedico;
    @XmlElement(required = true, nillable = true)
    protected String descr;
    @XmlElement(name = "cod_icd", required = true, nillable = true)
    protected String codIcd;
    @XmlElement(required = true, nillable = true)
    protected String especialidad;

    /**
     * Obtiene el valor de la propiedad tratamiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTratamiento() {
        return tratamiento;
    }

    /**
     * Define el valor de la propiedad tratamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTratamiento(String value) {
        this.tratamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipMedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipMedico() {
        return tipMedico;
    }

    /**
     * Define el valor de la propiedad tipMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipMedico(String value) {
        this.tipMedico = value;
    }

    /**
     * Obtiene el valor de la propiedad cpt4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpt4() {
        return cpt4;
    }

    /**
     * Define el valor de la propiedad cpt4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpt4(String value) {
        this.cpt4 = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreMedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMedico() {
        return nombreMedico;
    }

    /**
     * Define el valor de la propiedad nombreMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMedico(String value) {
        this.nombreMedico = value;
    }

    /**
     * Obtiene el valor de la propiedad descr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescr() {
        return descr;
    }

    /**
     * Define el valor de la propiedad descr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescr(String value) {
        this.descr = value;
    }

    /**
     * Obtiene el valor de la propiedad codIcd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodIcd() {
        return codIcd;
    }

    /**
     * Define el valor de la propiedad codIcd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodIcd(String value) {
        this.codIcd = value;
    }

    /**
     * Obtiene el valor de la propiedad especialidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Define el valor de la propiedad especialidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecialidad(String value) {
        this.especialidad = value;
    }

}
