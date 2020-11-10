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
 * <p>Clase Java para Contacto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Contacto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ape_pat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ext" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ape_mat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "Contacto", propOrder = {
    "tel",
    "email",
    "apePat",
    "ext",
    "apeMat",
    "fax",
    "nombre"
})
public class Contacto {

    @XmlElement(required = true, nillable = true)
    protected String tel;
    @XmlElement(required = true, nillable = true)
    protected String email;
    @XmlElement(name = "ape_pat", required = true, nillable = true)
    protected String apePat;
    @XmlElement(required = true, nillable = true)
    protected String ext;
    @XmlElement(name = "ape_mat", required = true, nillable = true)
    protected String apeMat;
    @XmlElement(required = true, nillable = true)
    protected String fax;
    @XmlElement(required = true, nillable = true)
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad tel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Define el valor de la propiedad tel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

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
     * Obtiene el valor de la propiedad ext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt() {
        return ext;
    }

    /**
     * Define el valor de la propiedad ext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt(String value) {
        this.ext = value;
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
     * Obtiene el valor de la propiedad fax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Define el valor de la propiedad fax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
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
