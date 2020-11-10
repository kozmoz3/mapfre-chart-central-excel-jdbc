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
 * <p>Clase Java para servicioOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="servicioOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaskInfo" type="{http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc}TaskInfo"/&gt;
 *         &lt;element name="TaskData" type="{http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc}TaskData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicioOut", propOrder = {
    "taskInfo",
    "taskData"
})
public class ServicioOut {

    @XmlElement(name = "TaskInfo", required = true, nillable = true)
    protected TaskInfo taskInfo;
    @XmlElement(name = "TaskData", required = true, nillable = true)
    protected TaskData taskData;

    /**
     * Obtiene el valor de la propiedad taskInfo.
     * 
     * @return
     *     possible object is
     *     {@link TaskInfo }
     *     
     */
    public TaskInfo getTaskInfo() {
        return taskInfo;
    }

    /**
     * Define el valor de la propiedad taskInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInfo }
     *     
     */
    public void setTaskInfo(TaskInfo value) {
        this.taskInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad taskData.
     * 
     * @return
     *     possible object is
     *     {@link TaskData }
     *     
     */
    public TaskData getTaskData() {
        return taskData;
    }

    /**
     * Define el valor de la propiedad taskData.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskData }
     *     
     */
    public void setTaskData(TaskData value) {
        this.taskData = value;
    }

}
