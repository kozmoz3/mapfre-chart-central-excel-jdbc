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
 * <p>Clase Java para migracionDatosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="migracionDatosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="servicioOut" type="{http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc}servicioOut"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "migracionDatosResponse", propOrder = {
    "servicioOut"
})
public class MigracionDatosResponse {

    @XmlElement(required = true, nillable = true)
    protected ServicioOut servicioOut;

    /**
     * Obtiene el valor de la propiedad servicioOut.
     * 
     * @return
     *     possible object is
     *     {@link ServicioOut }
     *     
     */
    public ServicioOut getServicioOut() {
        return servicioOut;
    }

    /**
     * Define el valor de la propiedad servicioOut.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicioOut }
     *     
     */
    public void setServicioOut(ServicioOut value) {
        this.servicioOut = value;
    }

	@Override
	public String toString() {
		return "MigracionDatosResponse [servicioOut=" + servicioOut + "]";
	}

    
    
}
