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
				
				Chair c=new Chair();
				c.setCno(198);
				c.setCcolor("cream");
				c.setCtype("normal");
				
				Room r=new Room();
				r.setRno(175);
				r.setRsize("Big");
				r.setChair(c);
				
				int cpk=(int)s.save(c);
				int rpk=(int)s.save(r);
				if(cpk ==198 && rpk==175)
				{	tx.commit();
				
				System.out.println("success");
				}
				else
				{
					tx.rollback();
					System.out.println("failure");
				}
				
			} catch (Exception e) {
					e.printStackTrace();
			}

	}

}
