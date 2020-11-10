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
 * <p>Clase Java para Contratante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Contratante"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ape_pat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ape_mat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contratante", propOrder = {
    "apePat",
    "apeMat",
    "nombre"
})
public class Contratante {

    @XmlElement(name = "ape_pat", required = true, nillable = true)
    protected String apePat;
    @XmlElement(name = "ape_mat", required = true, nillable = true)
    protected String apeMat;
    @XmlElement(required = true, nillable = true)
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad apePat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApePat() {
        return apePat;
    }

    /**
     * Define el valor de la propiedad apePat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApePat(String value) {
        this.apePat = value;
    }

    /**
     * Obtiene el valor de la propiedad apeMat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApeMat() {
        return apeMat;
    }

    /**
     * Define el valor de la propiedad apeMat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApeMat(String value) {
        this.apeMat = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

}
