package com.HibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ravi.pojo.Register;

public class HibernateUtil {
	private static SessionFactory sessionfactory;
	static
	{
		try {
			Configuration config=new Configuration();
			config.configure();
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
