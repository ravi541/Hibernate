package com.ravi.entity;

import java.util.HashSet;
import java.util.Set;

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
				
				Department dept=(Department)s.get(Department.class,1);
				System.out.println("Department Details:");
				System.out.println("-------------------");
				System.out.println("Department Name:"+dept.getDname());
				System.out.println("Dept id:"+dept.getDid());
				System.out.println("-------------------");
				Set<Employee> emps=dept.getEmps();
				for (Employee e:emps)
				{
					System.out.println("Employee Details");
					System.out.println("-------------------");
					System.out.println("Employee no:"+e.getEno());
					System.out.println("Employee name:"+e.getename());
					System.out.println("Employee sal:"+e.getEsal());
					System.out.println("-------------------");
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
//				Employee e1=new Employee();
//				e1.setEno(11);
//				e1.setename("Ravi");
//				e1.setEsal(15000);
//				
//				Employee e2=new Employee();
//				e2.setEno(12);
//				e2.setename("Teja");
//				e2.setEsal(16000);
//				
//				Employee e3=new Employee();
//				e3.setEno(13);
//				e3.setename("Mounika");
//				e3.setEsal(17000);
//				
//				Set<Employee> emps=new HashSet<Employee>();
//				emps.add(e1);
//				emps.add(e2);
//				emps.add(e3);
//				
//				Department dept=new Department();
//				dept.setDid(1);
//				dept.setDname("ECE");
//				dept.setEmps(emps);
//				
//				int pk=(int)s.save(dept);
//				
//				if(pk==1)
//				{
//					tx.commit();
//					System.out.println("success");
//				}
//				else
//				{
//					tx.rollback();
//					System.out.println("failure");
//				}
				
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
