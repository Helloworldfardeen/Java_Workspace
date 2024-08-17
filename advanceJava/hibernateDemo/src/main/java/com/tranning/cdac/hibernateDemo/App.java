package com.tranning.cdac.hibernateDemo;


import org.hibernate.*;
import org.hibernate.cfg.Configuration;


/**
 * Hibernate Application to save Employee Object
 *
 */
public class App {
	public static void main(String[] args) {
		// It is used to configure hibernate App
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		// It is a factory of sessions
		SessionFactory sf = cfg.buildSessionFactory();

		// Create physical connection with db
		Session session = sf.openSession();

		Transaction t = session.beginTransaction(); // unit of work... db transactions

		Employee e1 = new Employee(); // Persistent Object

		e1.setId(101);
		e1.setFirstName("James");
		e1.setLastName("Gosling");
		e1.setDept("Technical");
		e1.setSalary(8500.00f);

		session.persist(e1); // inserts object to DB
		t.commit();

		System.out.println("Data Successfully Saved to Database");
		session.close();
		sf.close();
	}
}
