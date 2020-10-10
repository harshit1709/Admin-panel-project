package com.project.project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Student {
	@Id
	public String id;
	public String RollNo;
	public String name;
	public String batch;
	public String email;
	public String mobile;
	public String gender;
	public String DOB;
	public String AdmissionDate;
	
	public Student() {
		
	}
	public Student(String RollNo, String name, String batch, String email, String mobile, String gender, String DOB,
			String AdmissionDate) {
		
		this.RollNo = RollNo;
		this.name = name;
		this.batch = batch;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		this.DOB = DOB;
		this.AdmissionDate = AdmissionDate;
	}
	public String getRollNo() {
		return RollNo;
	}
	public void setRollNo(String RollNo) {
		this.RollNo = RollNo;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getbatch() {
		return batch;
	}
	public void setbatch(String batch) {
		this.batch = batch;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	public String getAdmissionDate() {
		return AdmissionDate;
	}
	public void setAdmissionDate(String AdmissionDate) {
		this.AdmissionDate = AdmissionDate;
	}
	
	
	
	

}

