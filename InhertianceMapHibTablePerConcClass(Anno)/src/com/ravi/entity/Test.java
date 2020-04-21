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
			ltv.setTno(5);
			ltv.setTsize("45");
			ltv.setTname("Samsung");
			ltv.setTcolor("white");
			
			PortTv ptv=new PortTv();
			ptv.setTno(8);
			ptv.setTsize("40");
			ptv.setTname("MI");
			ptv.setTcolor("Green");
			
			int pk_ltv=(int)s.save(ltv);
			int pk_ptv=(int)s.save(ptv);
			if(pk_ltv==5 && pk_ptv==8)
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
