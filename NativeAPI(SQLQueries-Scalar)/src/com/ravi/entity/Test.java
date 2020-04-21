package com.ravi.entity;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test 
{

	public static void main(String[] args) 
	{
	try 
	{
	Configuration config=new Configuration().configure();
	SessionFactory sf=config.buildSessionFactory();
	Session s=sf.openSession();
	SQLQuery sqlquery=s.createSQLQuery("Select eno,ename,esal,eaddr from emp1");
	List<Object[]> emplist=sqlquery.list();
	System.out.println("ENO\tENAME\tESAL\tEADDR");
	System.out.println("----------------------------------");
	for(Object[] obj:emplist) 
	{
		for(Object o:obj)
		{
			System.out.print(o+"\t");
			
		}
		System.out.println("");
	}
	
	}

	catch (Exception e) {
		e.printStackTrace();
	}
	}

	

}
