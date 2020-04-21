package com.ravi.test;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.ravi.pojo.Employee;

public class test {

	public static void main(String[] args) throws Exception{
		Configuration config=new Configuration();
config.configure();
SessionFactory sessionfac=config.buildSessionFactory();
Session session=sessionfac.openSession();
Employee emp=(Employee)session.get(Employee.class, 24);
if(emp==null)
{
	System.out.println("emp does not ecist");
	
}
else {
//System.out.println(emp.getEno());
System.out.println(emp.getEsal());
System.out.println(emp.getEname());
}


	session.close();
	sessionfac.close();}
	

}
