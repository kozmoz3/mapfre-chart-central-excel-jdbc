//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.05 a las 06:51:41 PM CST 
//


package com.mapfre.exceljdbc.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para TaskInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TaskInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="customTaskID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastAcceptedBy" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="lastAcceptedDate" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acceptedByList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="assignedToList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="taskUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taskTypeID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taskVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="processInstanceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="processModelID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="processModelVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stepID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="processIteration" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stepIteration" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="delegatedToList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="delegatedFromList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="auditContext" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskInfo", propOrder = {
    "name",
    "description",
    "expireDate",
    "createdDate",
    "lastModifiedDate",
    "customTaskID",
    "createdBy",
    "lastModifiedBy",
    "lastAcceptedBy",
    "lastAcceptedDate",
    "status",
    "priority",
    "acceptedByList",
    "assignedToList",
    "errorCode",
    "errorMessage",
    "taskUrl",
    "taskTypeID",
    "taskVersionNumber",
    "processInstanceID",
    "processModelID",
    "processModelVersion",
    "stepID",
    "processIteration",
    "stepIteration",
    "delegatedToList",
    "delegatedFromList",
    "auditContext"
})
public class TaskInfo {

    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected Object description;
    @XmlElement(required = true, nillable = true)
    protected Object expireDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(required = true, nillable = true)
    protected String customTaskID;
    @XmlElement(required = true, nillable = true)
    protected String createdBy;
    @XmlElement(required = true, nillable = true)
    protected String lastModifiedBy;
    @XmlElement(required = true, nillable = true)
    protected Object lastAcceptedBy;
    @XmlElement(required = true, nillable = true)
    protected Object lastAcceptedDate;
    @XmlElement(required = true, nillable = true)
    protected String status;
    @XmlElement(required = true, nillable = true)
    protected String priority;
    @XmlElement(required = true, nillable = true)
    protected List<String> acceptedByList;
    @XmlElement(required = true, nillable = true)
    protected List<String> assignedToList;
    @XmlElement(required = true, nillable = true)
    protected Object errorCode;
    @XmlElement(required = true, nillable = true)
    protected Object errorMessage;
    @XmlElement(required = true, nillable = true)
    protected String taskUrl;
    @XmlElement(required = true, nillable = true)
    protected String taskTypeID;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer taskVersionNumber;
    @XmlElement(required = true, nillable = true)
    protected String processInstanceID;
    @XmlElement(required = true, nillable = true)
    protected String processModelID;
    @XmlElement(required = true, nillable = true)
    protected String processModelVersion;
    @XmlElement(required = true, nillable = true)
    protected String stepID;
    @XmlElement(required = true, nillable = true)
    protected String processIteration;
    @XmlElement(required = true, nillable = true)
    protected String stepIteration;
    @XmlElement(required = true, nillable = true)
    protected List<String> delegatedToList;
    @XmlElement(required = true, nillable = true)
    protected List<String> delegatedFromList;
    @XmlElement(required = true, nillable = true)
    protected String auditContext;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDescription(Object value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad expireDate.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExpireDate() {
        return expireDate;
    }

    /**
     * Define el valor de la propiedad expireDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExpireDate(Object value) {
        this.expireDate = value;
    }

    /**
     * Obtiene el valor de la propiedad createdDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Define el valor de la propiedad createdDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Obtiene el valor de la propiedad lastModifiedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Define el valor de la propiedad lastModifiedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad customTaskID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTaskID() {
        return customTaskID;
    }

    /**
     * Define el valor de la propiedad customTaskID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTaskID(String value) {
        this.customTaskID = value;
    }

    /**
     * Obtiene el valor de la propiedad createdBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Define el valor de la propiedad createdBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Obtiene el valor de la propiedad lastModifiedBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Define el valor de la propiedad lastModifiedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedBy(String value) {
        this.lastModifiedBy = value;
    }

    /**
     * Obtiene el valor de la propiedad lastAcceptedBy.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastAcceptedBy() {
        return lastAcceptedBy;
    }

    /**
     * Define el valor de la propiedad lastAcceptedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastAcceptedBy(Object value) {
        this.lastAcceptedBy = value;
    }

    /**
     * Obtiene el valor de la propiedad lastAcceptedDate.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastAcceptedDate() {
        return lastAcceptedDate;
    }

    /**
     * Define el valor de la propiedad lastAcceptedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastAcceptedDate(Object value) {
        this.lastAcceptedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad priority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Define el valor de la propiedad priority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the acceptedByList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptedByList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptedByList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAcceptedByList() {
        if (acceptedByList == null) {
            acceptedByList = new ArrayList<String>();
        }
        return this.acceptedByList;
    }

    /**
     * Gets the value of the assignedToList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedToList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedToList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssignedToList() {
        if (assignedToList == null) {
            assignedToList = new ArrayList<String>();
        }
        return this.assignedToList;
    }

    /**
     * Obtiene el valor de la propiedad errorCode.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getErrorCode() {
        return errorCode;
    }

    /**
     * Define el valor de la propiedad errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setErrorCode(Object value) {
        this.errorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define el valor de la propiedad errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setErrorMessage(Object value) {
        this.errorMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad taskUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskUrl() {
        return taskUrl;
    }

    /**
     * Define el valor de la propiedad taskUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskUrl(String value) {
        this.taskUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad taskTypeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskTypeID() {
        return taskTypeID;
    }

    /**
     * Define el valor de la propiedad taskTypeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskTypeID(String value) {
        this.taskTypeID = value;
    }

    /**
     * Obtiene el valor de la propiedad taskVersionNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaskVersionNumber() {
        return taskVersionNumber;
    }

    /**
     * Define el valor de la propiedad taskVersionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaskVersionNumber(Integer value) {
        this.taskVersionNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad processInstanceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessInstanceID() {
        return processInstanceID;
    }

    /**
     * Define el valor de la propiedad processInstanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessInstanceID(String value) {
        this.processInstanceID = value;
    }

    /**
     * Obtiene el valor de la propiedad processModelID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessModelID() {
        return processModelID;
    }

    /**
     * Define el valor de la propiedad processModelID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessModelID(String value) {
        this.processModelID = value;
    }

    /**
     * Obtiene el valor de la propiedad processModelVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessModelVersion() {
        return processModelVersion;
    }

    /**
     * Define el valor de la propiedad processModelVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessModelVersion(String value) {
        this.processModelVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad stepID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepID() {
        return stepID;
    }

    /**
     * Define el valor de la propiedad stepID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepID(String value) {
        this.stepID = value;
    }

    /**
     * Obtiene el valor de la propiedad processIteration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessIteration() {
        return processIteration;
    }

    /**
     * Define el valor de la propiedad processIteration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessIteration(String value) {
        this.processIteration = value;
    }

    /**
     * Obtiene el valor de la propiedad stepIteration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepIteration() {
        return stepIteration;
    }

    /**
     * Define el valor de la propiedad stepIteration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepIteration(String value) {
        this.stepIteration = value;
    }

    /**
     * Gets the value of the delegatedToList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delegatedToList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelegatedToList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDelegatedToList() {
        if (delegatedToList == null) {
            delegatedToList = new ArrayList<String>();
        }
        return this.delegatedToList;
    }

    /**
     * Gets the value of the delegatedFromList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delegatedFromList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelegatedFromList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDelegatedFromList() {
        if (delegatedFromList == null) {
            delegatedFromList = new ArrayList<String>();
        }
        return this.delegatedFromList;
    }

    /**
     * Obtiene el valor de la propiedad auditContext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditContext() {
        return auditContext;
    }

    /**
     * Define el valor de la propiedad auditContext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditContext(String value) {
        this.auditContext = value;
    }

}
