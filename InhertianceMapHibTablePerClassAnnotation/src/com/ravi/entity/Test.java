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
			
			LedTV t=(LedTV)s.get(TV.class, 1);
			PortTv p=(PortTv)s.get(TV.class, 2);
			
			System.out.println("Led tv details");
			System.out.println(".......................");
			System.out.println(t.getTno());
			System.out.println(t.getTsize());
			System.out.println(t.getTcolor());
			System.out.println(t.getTname());
			System.out.println("..................");
			
			
			System.out.println("port tv details");
			System.out.println(".......................");
			System.out.println(p.getTno());
			System.out.println(p.getTsize());
			System.out.println(p.getTcolor());
			System.out.println(p.getTname());
			System.out.println("..................");
			
		} catch (Exception e) {
			
				e.printStackTrace();
		}

	}

}
