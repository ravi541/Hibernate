package Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ravi.entity.Branch;
import com.ravi.entity.Student;

public class Test {

	public static void main(String[] args) {
		try {
			Configuration config=new Configuration();
			config.configure("/com/ravi/resources/hibernate.cfg.xml");
			SessionFactory sf=config.buildSessionFactory();
			Session se=sf.openSession();
			Transaction tx=se.beginTransaction();
			
			Branch b=new Branch();
			b.setBid(2);
			b.setBname("CSE");
			
			Student s=new Student();
			s.setSid(4);
			s.setSname("Mounika");
			s.setBranch(b);

			Student s1=new Student();
			s1.setSid(5);
			s1.setSname("Mani");
			s1.setBranch(b);
			
			Student s2=new Student();
			s2.setSid(6);
			s2.setSname("Dakshith");
			s2.setBranch(b);
			
			se.save(s);
			se.save(s1);
			se.save(s2);
			
			tx.commit();
			
			System.out.println("Success");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
