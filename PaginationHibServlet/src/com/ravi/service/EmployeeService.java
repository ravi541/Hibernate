package com.ravi.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ravi.entity.Employee;
import com.ravi.util.HibernateUtil;

public class EmployeeService {
	SessionFactory sf=null;
	Session session=null;
	Query query=null;
	
	public EmployeeService()
	{
		try
		{SessionFactory sf=HibernateUtil.getsessionfactory();
		Session session=sf.openSession();
		query=session.createQuery("from Employee");
				
		query.setMaxResults(2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public List<Employee> getEmployees(String label)
	{
		
		List<Employee> empslist=null;
		int b=Integer.parseInt(label);
		System.out.println("value of label"+b);
		try {
			if(b==1)
			{
				query.setFirstResult(0);
			}
			if(b==2)
			{
				query.setFirstResult(2);
			}
			if(b==3)
			{
				query.setFirstResult(4);
			}
				empslist=query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("testtt");
		return empslist;
	}

}
