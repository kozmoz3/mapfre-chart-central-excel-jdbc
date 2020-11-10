package com.mapfre.exceljdbc.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aux", propOrder = {
    "taskLastAcceptedBy"
})
public class Auxi {
	
	@XmlElement(name = "task_last_accepted_by", required = true, nillable = true)
    protected String taskLastAcceptedBy;

	public String getTaskLastAcceptedBy() {
		return taskLastAcceptedBy;
	}

	public void setTaskLastAcceptedBy(String taskLastAcceptedBy) {
		this.taskLastAcceptedBy = taskLastAcceptedBy;
	}
    
    
    
    
    

}
