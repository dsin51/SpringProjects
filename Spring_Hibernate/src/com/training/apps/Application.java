package com.training.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.entity.Doctor;
import com.training.utils.HiberUtils;

public class Application {

	public static void main(String[] args) {
		SessionFactory factory = HiberUtils.getFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Doctor doc = new Doctor(1001, "Lucius", 123456);
		
	}

}
