package com.newhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Customer_info s1=new Customer_info();
		s1.setinvoice_id(1);
		s1.setName("Darshan");
		s1.setFinaltotal_Amount(2300);

		SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(s1);
		
		session.getTransaction().commit();
		session.close();
		sessionfactory.close();

	}

}
