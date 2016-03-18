package com.training.tests;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.entity.InPatient;
import com.training.utils.HiberUtils;

public class PatientTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddPatient() {
		SessionFactory factory = HiberUtils.getFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Timestamp date = new Timestamp(new Date().getTime());
		InPatient patient = new InPatient(101, "Voldemort", 120, 501, date);

		session.save(patient);
		tx.commit();
		System.out.println("One Patient Added:" + patient);
	}

}
