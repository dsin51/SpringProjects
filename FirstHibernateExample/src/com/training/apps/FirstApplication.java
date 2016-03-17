package com.training.apps;

import org.hibernate.*;

import com.training.entity.Doctor;
import com.training.utils.HiberUtils;

public class FirstApplication {

	public static void main(String[] args) {

		SessionFactory factory = HiberUtils.getFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Doctor doc = new Doctor(102, "Ram", 123456789);

		Integer key = (Integer)session.save(doc);
		System.out.println(key); //Prints primary key
		
		
		//select statement is executed
		Doctor doc2 = (Doctor)session.get(Doctor.class,101);
		System.out.println(doc2); 
		
		
		session.save(doc);
		tx.commit();
		factory.close();

	}

}
