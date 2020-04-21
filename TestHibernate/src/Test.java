import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
try {
Configuration config=new Configuration();
config.addAnnotatedClass(Student.class);
SessionFactory sf=config.buildSessionFactory();
Session se=sf.openSession();
Transaction t=se.beginTransaction();
Student s=new Student();
Scanner sc=new Scanner(System.in);
System.out.println("please entert he sid");
int sid=Integer.parseInt(sc.nextLine());
System.out.println("enter name");
String sname=sc.nextLine();
s.setSid(sid);
s.setSname(sname);
int pk=(Integer)se.save(s);
if (pk==sid)
{
	System.out.println("inserted succes");
}
t.commit();

} catch (Exception e) {
	e.printStackTrace();

}

	}

}
