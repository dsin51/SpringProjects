package com.training.entity;

import java.io.Serializable;

import com.training.domains.Address;

public class Doctor implements Serializable {

	/**
	 * 
	 */

	private int doctorCode;
	private String doctorName;
	private long handPhone;
	
	private Address homeAddr;
	private Address workAddr;
	
	
	public Doctor(int doctorCode, String doctorName, long handPhone, Address homeAddr, Address workAddr) {
		super();
		this.doctorCode = doctorCode;
		this.doctorName = doctorName;
		this.handPhone = handPhone;
		this.homeAddr = homeAddr;
		this.workAddr = workAddr;
	}
	public Address getHomeAddr() {
		return homeAddr;
	}
	public void setHomeAddr(Address homeAddr) {
		this.homeAddr = homeAddr;
	}
	public Address getWorkAddr() {
		return workAddr;
	}
	public void setWorkAddr(Address workAddr) {
		this.workAddr = workAddr;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int doctorCode, String doctorName, long handPhone) {
		super();
		this.doctorCode = doctorCode;
		this.doctorName = doctorName;
		this.handPhone = handPhone;
	}
	public int getDoctorCode() {
		return doctorCode;
	}
	public void setDoctorCode(int doctorCode) {
		this.doctorCode = doctorCode;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public long getHandPhone() {
		return handPhone;
	}
	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	@Override
	public String toString() {
		return "Doctor [doctorCode=" + doctorCode + ", doctorName=" + doctorName + ", handPhone=" + handPhone + "]";
	}
	
}
