package com.training.entity;

import java.sql.Timestamp;

public class InPatient extends Patient {

	private int wardNumber;
	private Timestamp dateOfAdmission;
	public InPatient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InPatient(int patientId, String patientName, int patientAge) {
		super(patientId, patientName, patientAge);
		// TODO Auto-generated constructor stub
	}
	public InPatient(int patientId, String patientName, int patientAge, int wardNumber, Timestamp dateOfAdmission) {
		super(patientId, patientName, patientAge);
		this.wardNumber = wardNumber;
		this.dateOfAdmission = dateOfAdmission;
	}
	public InPatient(int wardNumber, Timestamp dateOfAdmission) {
		super();
		this.wardNumber = wardNumber;
		this.dateOfAdmission = dateOfAdmission;
	}
	public int getWardNumber() {
		return wardNumber;
	}
	public void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}
	public Timestamp getDateOfAdmission() {
		return dateOfAdmission;
	}
	public void setDateOfAdmission(Timestamp dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
	@Override
	public String toString() {
		return "InPatient [wardNumber=" + wardNumber + ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
	@Override
	public double calculate() {
		return 1500;
	}
	
}
