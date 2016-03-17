package com.training.daos;

import java.util.List;

import org.hibernate.*;

import com.training.entity.Doctor;
import com.training.ifaces.MyDAO;
import com.training.utils.HiberUtils;

public class DoctorDAO<Doctor> implements MyDAO<Doctor> {

	SessionFactory factory = HiberUtils.getFactory();
	
	@Override
	public Object add(Doctor doc) {

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(doc);
		tx.commit();
		return doc;
	}

	@Override
	public Doctor find(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor update(Doctor obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
