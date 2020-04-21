import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.addAnnotatedClass(DOB.class);
		
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		DOB dob=new DOB();
		dob.setSid(119);
		dob.setSname("Rv");
		dob.setSmonth("april");
		dob.setSday("sunday");
		s.save(dob);
		//System.out.println(pk);
		
		t.commit();
		
			System.out.println("inserted");

	}

}
