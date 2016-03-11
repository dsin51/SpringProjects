package com.training.domains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ent")
public class Doctor {

	@Value("Rajesh Khanna")
	private String docName;
	
	@Value("9876543210")
	private long phoneNumber;

	
	@Autowired
	private Patient patient;
	
	
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String docName, long phoneNumber) {
		super();
		this.docName = docName;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Doctor [docName=" + docName + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
