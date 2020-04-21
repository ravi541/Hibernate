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
			
			SessionFactory sf=config.buildSessionFactory();
			Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Query q=s.createQuery("insert into School2(sid,sname,saddr,spin)select s.sid,s.sname,s.saddr,s.spin from School s ");
		int rc=q.executeUpdate();
		tx.commit();
		System.out.println(rc+" no of rows inserted");
		System.out.println("success");
		
		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}

}
