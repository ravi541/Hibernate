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
			
			Student s=(Student)se.get(Student.class, 7);
			System.out.println("=-------------------=");
			System.out.println(s.getSname());
			System.out.println(s.getBranch().getBid());
			System.out.println(s.getBranch().getBname());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
