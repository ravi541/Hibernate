import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		m1();

	}
	

	private static void m1() {
		SessionFactory sf=null;
		Session s=null;
		Transaction tx=null;
		try {
			Configuration config=new Configuration();
			StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
			builder=builder.applySettings(config.getProperties());
			StandardServiceRegistry registry=builder.build();
			sf=config.buildSessionFactory(registry);
			s=sf.openSession();
			tx=s.beginTransaction();
			Employee emp=new Employee();
			emp.setEno(123);
			emp.setEname("raviteja");
			emp.setEsal(11);
			int pk=(Integer)s.save(emp);
			tx.commit();
			System.out.println(pk+"inseted success");			
		} catch (Exception e) {
				e.printStackTrace();
		}
		
	}

}
