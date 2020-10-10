package com.project.project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Staff")
public class Staff {
	@Id
	public String id;
	public String name;
	public String designation;
	public String department;
	public String email;
	public String password;
	public String mobile;
	public String gender;
	public String DOB;
	
	public Staff() {
		
	}
	public Staff(String name, String designation, String department, String email, String password, String mobile,
			String gender, String DOB) {
	
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.gender = gender;
		this.DOB = DOB;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	
	
	
	
}


