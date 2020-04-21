package com.ravi.entity;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
	try 
	{
	Configuration config=new Configuration().configure();
	SessionFactory sf=config.buildSessionFactory();
	Session s=sf.openSession();
	SQLQuery sqlquery=s.createSQLQuery("Select * from emp1 where esal < ? and esal > :max ");
	sqlquery.setFloat(0, 70);
	sqlquery.setFloat("max", 30.0f);
	sqlquery.addEntity(Employee.class);
	List<Employee> emplist=sqlquery.list();
	System.out.println("ENO\tEname\tESAL\tEADDR");
	System.out.println("--------------------------");
	for(Employee emp:emplist)
	{
		System.out.print(emp.getEno()+"\t");
		System.out.print(emp.getEname()+"\t");
		System.out.print(emp.getEsal()+"\t");
		System.out.print(emp.getEaddr()+"\n");
	}
	
	
	} catch (Exception e) {
		e.printStackTrace();
		
	}

	}

}
