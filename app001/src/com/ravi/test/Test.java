package com.ravi.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

import com.ravi.pojo.Employee;

public class Test {

	public static void main(String[] args) throws Exception 
	{	
		Configuration config =new Configuration();
		config.configure();
		SessionFactory sessionfactory=config.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		Employee emp=new Employee();
		emp.setEno(111);
		emp.setEname("aa");
		emp.setEsal(2000);
		emp.setEaddr("hyd");
		int eno=(Integer)session.save(emp);
		tx.commit();
		if(eno==111)
		{
			System.out.println("record added");
		}
		else
		{
			System.out.println("record not added");
		}
		
		
		
		

	}

}
