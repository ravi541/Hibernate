package com.ravi.test;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.ravi.pojo.Student;

public class TestUpdate {

	public static void main(String[] args) throws Exception 
	{
		
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction ts=ses.beginTransaction();
		Student s=new Student();
		s.setSname("ravit");
		s.setSaddr("khyd");
		s.setSid(555);
		ses.saveOrUpdate(s);
		ts.commit();
		System.out.println("done");
			
		
	}

}
