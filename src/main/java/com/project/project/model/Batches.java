package com.project.project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Batches")
public class Batches {
	@Id
	public String id; 
	public String batchname;
	public String batchyear;
	public String feePerStudent;
	public String noOfStudent;
	public String feeStatus;
	public String handeledBy;
	public Batches(String batchname, String batchyear, String feePerStudent, String noOfStudent, String feeStatus,
			String handeledBy) {
		
		this.batchname = batchname;
		this.batchyear = batchyear;
		this.feePerStudent = feePerStudent;
		this.noOfStudent = noOfStudent;
		this.feeStatus = feeStatus;
		this.handeledBy = handeledBy;
	}
	
	public Batches() {
		
	}

	public String getbatchname() {
		return batchname;
	}

	public void setbatchname(String batchname) {
		this.batchname = batchname;
	}

	public String getbatchyear() {
		return batchyear;
	}

	public void setbatchyear(String batchyear) {
		this.batchyear = batchyear;
	}

	public String getfeePerStudent() {
		return feePerStudent;
	}

	public void setfeePerStudent(String feePerStudent) {
		this.feePerStudent = feePerStudent;
	}

	public String getnoOfStudent() {
		return noOfStudent;
	}

	public void setnoOfStudent(String noOfStudent) {
		this.noOfStudent = noOfStudent;
	}

	public String getfeeStatus() {
		return feeStatus;
	}

	public void setfeeStatus(String feeStatus) {
		this.feeStatus = feeStatus;
	}

	public String gethandeledBy() {
		return handeledBy;
	}

	public void sethandeledBy(String handeledBy) {
		this.handeledBy = handeledBy;
	}
	
	
	
}

