package com.ravi.test;

import java.io.FileInputStream;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ravi.pojo.Register;

public class Test {

	public static void main(String[] args) {
		 FileInputStream fis;
		try {
			Properties p =new Properties();
			fis=new FileInputStream("C:\\Users\\Raviteja\\eclipse-workspace\\PropTestHibernate\\src\\abc.properties");
			p.load(fis);
			Configuration config=new Configuration();
			config.setProperties(p);
			
			config.addAnnotatedClass(Register.class);
			SessionFactory sf=config.buildSessionFactory();
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			Register r=new Register();
			r.setUname("ravte");
			r.setPwd("raviii");
			r.setUmob("8888");
			String pk=(String)s.save(r);
			t.commit();
			if(pk.equals("ravte"))
			{
				System.out.println("Emp inserted");
			}
			else
			{
				System.out.println("null");
			}
		} catch (Exception e) {
e.printStackTrace();
		}

	}

}
