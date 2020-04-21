package com.ravi.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import org.hibernate.cfg.Configuration;

import com.ravi.entity.Account;
import com.ravi.entity.Address;
import com.ravi.entity.Employee;

public class Test {
	

	public static void main(String[] args) {
		
		try {
			Configuration config=new Configuration();
			config.configure();
			SessionFactory sf=config.buildSessionFactory();
			Session s=sf.openSession();
			Transaction tx=s.beginTransaction();
			
		
			Account acc=new Account();
			acc.setAccno("120");
			acc.setAccname("ravi");
			acc.setAcctype("savigs");
			
			Address add=new Address();
			add.setPno("52+53");
			add.setStreet("yousufguda");
			add.setCity("hyd");
			
			Employee emp=new Employee();
			emp.setEno(155);
			emp.setEname("ravi");
			emp.setEsal(1234);
			emp.setAcc(acc);
			emp.setAdd(add);
			
			int pk=(Integer)s.save(emp);
			tx.commit();
			if(pk>0)
			{
				System.out.println("inserted success");
			}
			else
			{
				tx.rollback();
				System.out.println("not inserrted successfully");
			}
			
		} catch (Exception e) {
			
				e.printStackTrace();
		}

	}

}
