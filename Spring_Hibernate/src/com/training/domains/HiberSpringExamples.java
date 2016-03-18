package com.training.domains;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.daos.DoctorDAO;
import com.training.entity.Doctor;

public class HiberSpringExamples extends HibernateDaoSupport {

	@Autowired
	DoctorDAO dao;
	
	public Serializable addDoctor(Doctor doc)
	{
		Integer result = (Integer) dao.add(doc);
		return result;
		
	}
}
