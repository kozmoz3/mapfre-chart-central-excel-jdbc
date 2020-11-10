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
 * <p>Clase Java para RMA complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RMA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="obs_ajustes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ayudante" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="anestesiologo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ajustes" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="hospital" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="honorarios_medicos" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="cirujano" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMA", propOrder = {
    "obsAjustes",
    "ayudante",
    "anestesiologo",
    "ajustes",
    "hospital",
    "honorariosMedicos",
    "cirujano"
})
public class RMA {

    @XmlElement(name = "obs_ajustes", required = true, nillable = true)
    protected String obsAjustes;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double ayudante;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double anestesiologo;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double ajustes;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double hospital;
    @XmlElement(name = "honorarios_medicos", required = true, type = Double.class, nillable = true)
    protected Double honorariosMedicos;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double cirujano;

    /**
     * Obtiene el valor de la propiedad obsAjustes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsAjustes() {
        return obsAjustes;
    }

    /**
     * Define el valor de la propiedad obsAjustes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsAjustes(String value) {
        this.obsAjustes = value;
    }

    /**
     * Obtiene el valor de la propiedad ayudante.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAyudante() {
        return ayudante;
    }

    /**
     * Define el valor de la propiedad ayudante.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAyudante(Double value) {
        this.ayudante = value;
    }

    /**
     * Obtiene el valor de la propiedad anestesiologo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAnestesiologo() {
        return anestesiologo;
    }

    /**
     * Define el valor de la propiedad anestesiologo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAnestesiologo(Double value) {
        this.anestesiologo = value;
    }

    /**
     * Obtiene el valor de la propiedad ajustes.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAjustes() {
        return ajustes;
    }

    /**
     * Define el valor de la propiedad ajustes.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAjustes(Double value) {
        this.ajustes = value;
    }

    /**
     * Obtiene el valor de la propiedad hospital.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHospital() {
        return hospital;
    }

    /**
     * Define el valor de la propiedad hospital.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHospital(Double value) {
        this.hospital = value;
    }

    /**
     * Obtiene el valor de la propiedad honorariosMedicos.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHonorariosMedicos() {
        return honorariosMedicos;
    }

    /**
     * Define el valor de la propiedad honorariosMedicos.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHonorariosMedicos(Double value) {
        this.honorariosMedicos = value;
    }

    /**
     * Obtiene el valor de la propiedad cirujano.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCirujano() {
        return cirujano;
    }

    /**
     * Define el valor de la propiedad cirujano.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCirujano(Double value) {
        this.cirujano = value;
    }

}
