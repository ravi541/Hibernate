package com.ravi.entity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		try {
			Configuration config=new Configuration().configure();
			config.addAnnotatedClass(School.class);
			SessionFactory sf=config.buildSessionFactory();
			Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		/* Update method
			Query q=s.createQuery("update School set saddr='hyd' where saddr!='hyd'");
		int rc=q.executeUpdate();
		tx.commit();
		System.out.println(rc);
		System.out.println("success");
	*/
		
		Query q=s.createQuery("delete from School where spin='500045'");
		int rc=q.executeUpdate();
		tx.commit();
		System.out.println(rc+"no of records deleted");
		System.out.println("Deleted success");
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}

}
