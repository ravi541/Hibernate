package com.ravi.entity;

import java.util.HashSet;
import java.util.Set;

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
			 
			Things t1=new Things();
			t1.setTid(1);
			t1.setTname("bed");
			t1.setTcost(10000);
			
			Things t2=new Things();
			t2.setTid(2);
			t2.setTname("TV");
			t2.setTcost(20000);
			
			
			Things t3=new Things();
			t3.setTid(3);
			t3.setTname("AC");
			t3.setTcost(30000);
			
			Set<Things> things=new HashSet<Things>();
			things.add(t1);
			things.add(t2);
			things.add(t3);
			
			Set<Things> things1=new HashSet<Things>();
			things1.add(t1);
			things1.add(t2);
			
			Set<Things> things2=new HashSet<Things>();
			things2.add(t1);
		
			
			
			
			Bedroom b1=new Bedroom();
			b1.setBid(1);
			b1.setBname("Ravi's room");
			b1.setThings(things1);
			
			Bedroom b2=new Bedroom();
			b2.setBid(2);
			b2.setBname("parent's room");
			b2.setThings(things);
		
			
			Bedroom b3=new Bedroom();
			b3.setBid(3);
			b3.setBname("sis's room");
			b3.setThings(things2);
			
			s.save(b1);
			s.save(b2);
			s.save(b3);
			
			tx.commit();
			
			System.out.println("SAVED");
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
