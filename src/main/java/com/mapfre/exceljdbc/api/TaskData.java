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
 * <p>Clase Java para TaskData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TaskData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DictamenMedico" type="{http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc}DictamenMedico"/&gt;
 *         &lt;element name="DatosMinimos" type="{http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc}DatosMinimos"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskData", propOrder = {
    "dictamenMedico",
    "datosMinimos"
})
public class TaskData {

    @XmlElement(name = "DictamenMedico", required = true, nillable = true)
    protected DictamenMedico dictamenMedico;
    @XmlElement(name = "DatosMinimos", required = true, nillable = true)
    protected DatosMinimos datosMinimos;

    /**
     * Obtiene el valor de la propiedad dictamenMedico.
     * 
     * @return
     *     possible object is
     *     {@link DictamenMedico }
     *     
     */
    public DictamenMedico getDictamenMedico() {
        return dictamenMedico;
    }

    /**
     * Define el valor de la propiedad dictamenMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link DictamenMedico }
     *     
     */
    public void setDictamenMedico(DictamenMedico value) {
        this.dictamenMedico = value;
    }

    /**
     * Obtiene el valor de la propiedad datosMinimos.
     * 
     * @return
     *     possible object is
     *     {@link DatosMinimos }
     *     
     */
    public DatosMinimos getDatosMinimos() {
        return datosMinimos;
    }

    /**
     * Define el valor de la propiedad datosMinimos.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosMinimos }
     *     
     */
    public void setDatosMinimos(DatosMinimos value) {
        this.datosMinimos = value;
    }

	@Override
	public String toString() {
		return "TaskData [dictamenMedico=" + dictamenMedico + ", datosMinimos=" + datosMinimos + "]";
	}
    
    

}
