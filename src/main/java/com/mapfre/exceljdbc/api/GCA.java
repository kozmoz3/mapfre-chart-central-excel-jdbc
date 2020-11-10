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
 * <p>Clase Java para GCA complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GCA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coaseguro_honorarios_medicos_txt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="coaseguro_hospital" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="deducible" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="coaseguro_honorarios_medicos" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="coaseguro_hospital_txt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCA", propOrder = {
    "coaseguroHonorariosMedicosTxt",
    "coaseguroHospital",
    "deducible",
    "coaseguroHonorariosMedicos",
    "coaseguroHospitalTxt"
})
public class GCA {

    @XmlElement(name = "coaseguro_honorarios_medicos_txt", required = true, nillable = true)
    protected String coaseguroHonorariosMedicosTxt;
    @XmlElement(name = "coaseguro_hospital", required = true, type = Double.class, nillable = true)
    protected Double coaseguroHospital;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double deducible;
    @XmlElement(name = "coaseguro_honorarios_medicos", required = true, type = Double.class, nillable = true)
    protected Double coaseguroHonorariosMedicos;
    @XmlElement(name = "coaseguro_hospital_txt", required = true, nillable = true)
    protected String coaseguroHospitalTxt;

    /**
     * Obtiene el valor de la propiedad coaseguroHonorariosMedicosTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoaseguroHonorariosMedicosTxt() {
        return coaseguroHonorariosMedicosTxt;
    }

    /**
     * Define el valor de la propiedad coaseguroHonorariosMedicosTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoaseguroHonorariosMedicosTxt(String value) {
        this.coaseguroHonorariosMedicosTxt = value;
    }

    /**
     * Obtiene el valor de la propiedad coaseguroHospital.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoaseguroHospital() {
        return coaseguroHospital;
    }

    /**
     * Define el valor de la propiedad coaseguroHospital.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoaseguroHospital(Double value) {
        this.coaseguroHospital = value;
    }

    /**
     * Obtiene el valor de la propiedad deducible.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeducible() {
        return deducible;
    }

    /**
     * Define el valor de la propiedad deducible.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeducible(Double value) {
        this.deducible = value;
    }

    /**
     * Obtiene el valor de la propiedad coaseguroHonorariosMedicos.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoaseguroHonorariosMedicos() {
        return coaseguroHonorariosMedicos;
    }

    /**
     * Define el valor de la propiedad coaseguroHonorariosMedicos.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoaseguroHonorariosMedicos(Double value) {
        this.coaseguroHonorariosMedicos = value;
    }

    /**
     * Obtiene el valor de la propiedad coaseguroHospitalTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoaseguroHospitalTxt() {
        return coaseguroHospitalTxt;
    }

    /**
     * Define el valor de la propiedad coaseguroHospitalTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoaseguroHospitalTxt(String value) {
        this.coaseguroHospitalTxt = value;
    }

}
