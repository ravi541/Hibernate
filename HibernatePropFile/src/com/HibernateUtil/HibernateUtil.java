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
			config.setProperty("hibernate.connection.driver_class","oracle.jdbc.driver.OracleDriver");
			config.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@localhost:1521:xe");
			config.setProperty("hibernate.connection.username", "system");
			config.setProperty("hibernate.connection.password", "oracle09");
			config.setProperty("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
			config.setProperty("hibernate.show_sql", "true");
			
			config.addAnnotatedClass(Register.class);
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
