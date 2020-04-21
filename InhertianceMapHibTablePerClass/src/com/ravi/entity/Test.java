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
			LedTV ltv=new LedTV();
			ltv.setTno(1);
			ltv.setTsize("32");
			ltv.setTname("Sony");
			ltv.setTcolor("Blue");
			
			PortTv ptv=new PortTv();
			ptv.setTno(2);
			ptv.setTsize("22");
			ptv.setTname("Onida");
			ptv.setTcolor("Silver");
			
			int pk_ltv=(int)s.save(ltv);
			int pk_ptv=(int)s.save(ptv);
			if(pk_ltv==1 && pk_ptv==2)
			{
			tx.commit();
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
