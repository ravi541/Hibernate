package com.ravi.entity;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class Test {

	public static void main(String[] args) {
	try 
	{
	Configuration config=new Configuration().configure();
	SessionFactory sf=config.buildSessionFactory();
	Session s=sf.openSession();
	Criteria c=s.createCriteria(Employee.class);
	Criterion c1=Restrictions.gt("esal",30.0f);
	Criterion c2=Restrictions.lt("esal", 70.0f);
	c.add(c1);
	c.add(c2);
	
	c.addOrder(Order.desc("esal"));
	
	List<Employee> emplist=c.list();
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
