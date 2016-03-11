package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.doas.InvoiceDAOImpl;
import com.training.entity.Invoice;

public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		InvoiceDAOImpl obj = ctx.getBean("dao", InvoiceDAOImpl.class);
		Invoice inv = ctx.getBean("invoice", Invoice.class);

		inv.setInvoiceNumber(201);
		inv.setCustomerName("Ramesh");
		inv.setAmount(120);

		boolean result = obj.add(inv);
		System.out.println("Row Added : " + result);

		Invoice findInvoiceObj = obj.find(201);
		System.out.println("Find Result : " + findInvoiceObj);
		ctx.close();
	}

}
