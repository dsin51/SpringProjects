package com.training.daos;

import org.hibernate.*;

import com.training.entity.Student;
import com.training.ifaces.DAO;
import com.training.utils.HiberUtils;

public class StudentDAO implements DAO<Student> {

	SessionFactory factory = HiberUtils.getFactory();
	Session session;
	Transaction tx;

	@Override
	public int add(Student t) {
		session = factory.openSession();
		tx = session.beginTransaction();
		
		session.save(t);
		tx.commit();
		return t.getStudentId();
	}

	@Override
	public Student find(int key) {
		// TODO Auto-generated method stub
		return null;
	}

}
