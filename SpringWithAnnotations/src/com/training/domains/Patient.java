package com.training.domains;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pat")
public class Patient {

	@Value("Ram")
	private String patName;

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String patName) {
		super();
		this.patName = patName;
	}

	@Override
	public String toString() {
		return "Patient [patName=" + patName + "]";
	}
	
	
}
