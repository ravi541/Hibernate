package com.ravi.entity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		try {
			Configuration config=new Configuration().configure();
			config.addAnnotatedClass(School.class);
			SessionFactory sf=config.buildSessionFactory();
			Session s=sf.openSession();
			Query q=s.createQuery("from School");
//			List<School> list=q.list();
//			System.out.println("from list() method");
//			System.out.println("...................");
//			for(School sch:list)
//			{
//				System.out.println("School id:"+sch.getSid());
//				System.out.println("School name:"+sch.getSname());
//				System.out.println("School addr:"+sch.getSaddr());
//				System.out.println("School pin:"+sch.getSpin());
			
			//}
			
//			Iterator<School> it=q.iterate();
//			System.out.println("from iterate() method");
//			System.out.println("=======================");
//			while(it.hasNext())
//			{
//				School sch=(School)it.next();
//				System.out.println("School id:"+sch.getSid());
//				System.out.println("School name:"+sch.getSname());
//				System.out.println("School addr:"+sch.getSaddr());
//				System.out.println("School pin:"+sch.getSpin());
//			
//			}
//			
//			ScrollableResults sr=q.scroll();
//			System.out.println("from scroll() method");
//			System.out.println("=======================");
//			while(sr.next())
//			{
//				Object[] obj=sr.get();
//				for(Object o:obj)
//				{
//					School sch=(School)o;
//					System.out.println("School id:"+sch.getSid());
//					System.out.println("School name:"+sch.getSname());
//					System.out.println("School addr:"+sch.getSaddr());
//					System.out.println("School pin:"+sch.getSpin());
//				}
//			}
			School sch=(School)q.uniqueResult();
			System.out.println("from uniqueResult() method");
			System.out.println("...................");
			System.out.println("School id:"+sch.getSid());
			System.out.println("School name:"+sch.getSname());
			System.out.println("School addr:"+sch.getSaddr());
			System.out.println("School pin:"+sch.getSpin());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
