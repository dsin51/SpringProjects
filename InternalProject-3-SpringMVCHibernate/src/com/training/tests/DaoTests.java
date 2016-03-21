package com.training.tests;

import static org.junit.Assert.*;

import org.hibernate.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.daos.StudentDAO;
import com.training.entity.Student;
import com.training.utils.HiberUtils;

public class DaoTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddStudent() {
		Student student = new Student(101, "Tom Riddle", "Dark Arts", 80, 70, 20, 30);

		StudentDAO dao = new StudentDAO();
		try {
			dao.add(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("New Student added" + student);
	}

}
