package com.ravi.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		try {
			Configuration config=new Configuration().configure();
			SessionFactory sf=config.buildSessionFactory();
			Session s=sf.openSession();
			
			
			Bike b=(Bike)s.get(Vehicle.class, 1);
			Car c=(Car)s.get(Vehicle.class, 2);
			System.out.println(b.getVno() );
			System.out.println(b.getBname() );
			System.out.println(c.getCno());
			System.out.println(c.getVno());
			System.out.println(c.getCname());
			
			
			System.out.println("success");
		} catch (Exception e) {
				e.printStackTrace();
		}

	}

}
