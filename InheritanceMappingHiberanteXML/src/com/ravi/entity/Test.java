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
			Transaction tx=s.beginTransaction();
			
			
			Bike b=new Bike();
			b.setVno(1);
			b.setVname("vehicle");
			b.setVtype("vehicletype");
			b.setBname("Access");
			b.setBno(22222);
			b.setBwheels("2");
			
			Car c=new Car();
			c.setCno(4444);
			c.setCname("Breeza");
			c.setCwheels("4");
			c.setVno(2);
			c.setVname("vehicle");
			c.setVtype("vehicle");
			
			
			s.save(b);
			s.save(c);
			
			tx.commit();
			
			System.out.println("success");
		} catch (Exception e) {
				e.printStackTrace();
		}

	}

}
