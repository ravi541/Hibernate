import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
public static void m1()
{
	try {
		int ssid;
		
Configuration configOra=new Configuration();
configOra.configure("Oracle.xml");
SessionFactory sfora=configOra.buildSessionFactory();
Session sesora=sfora.openSession();
Transaction tora=sesora.beginTransaction();

Configuration configSql=new Configuration();

configSql.configure("MySQL.xml");

SessionFactory sfsql=configSql.buildSessionFactory();

Session sessql=sfsql.openSession();


Student s=new Student();
Scanner sc=new Scanner(System.in);
System.out.println("Enter student sid");
ssid=Integer.parseInt(sc.nextLine());
Student s1=(Student)sesora.get(Student.class, ssid);


if(s1==null) {
System.out.println("student does'nt exist");
m1();

}
else
{
Transaction tsql=sessql.beginTransaction(); 
int pk=(Integer)sessql.save(s1);

if(pk==s1.getSid()) {
	tsql.commit();
	System.out.println("record transfered succes");
}

else
{
	tsql.rollback();
	System.out.println("stu rec not trans");
}
}


	} catch (Exception e) {
		
		e.printStackTrace();
	}
finally {

}

}
	public static void main(String[] args) {
		
		m1();
	}
}
