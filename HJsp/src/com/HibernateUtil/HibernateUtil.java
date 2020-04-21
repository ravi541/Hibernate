package com.HibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ravi.pojo.Register;

public class HibernateUtil {
	private static SessionFactory sessionfactory;
	static
	{
		try {
			System.out.println("aftttttttt cof");
			Configuration config=new Configuration();
			
			System.out.println("before cof");
			config.addAnnotatedClass(Register.class);
			System.out.println("aft cof");
			sessionfactory=config.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static SessionFactory getSessionFactory()
	{
		return sessionfactory;
	}

}
