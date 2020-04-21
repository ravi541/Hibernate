package com.ravi.util;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionfactory=null;
	static
	{
		try {
		Configuration config=new Configuration().configure("/com/ravi/resources/hibernate.cfg.xml");
		sessionfactory=config.buildSessionFactory();
		} catch (Exception e) {
e.printStackTrace();
		}
	}
	public static SessionFactory getsessionfactory()
	{

		return sessionfactory;
	}

}
