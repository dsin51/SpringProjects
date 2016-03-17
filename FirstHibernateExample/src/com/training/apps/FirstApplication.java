package com.training.apps;

import org.hibernate.*;

import com.training.domains.Address;
import com.training.entity.Doctor;
import com.training.utils.HiberUtils;

public class FirstApplication {

	public static void main(String[] args) {

		SessionFactory factory = HiberUtils.getFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Address homeAddr = new Address("Home Street", "Home Loc", "Home City", "12344");
		Address workAddr = new Address("Work Street", "Work Loc", "Work City", "12345");

		Doctor newDoc = new Doctor(105, "Voldemort", 1234556, homeAddr, workAddr);

		session.save(newDoc);

		tx.commit();
		factory.close();

	}

}
