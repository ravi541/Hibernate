
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void m1()
	{
		try 
		{
		 Configuration config=new Configuration();
		 config.configure();
		 SessionFactory sf=config.buildSessionFactory();
		 Session s=sf.openSession();
		 Transaction t=s.beginTransaction();
		 Mobile m=new Mobile();
		
		
		 
		 m.setMname("iphone");
		 m.setMprice(45000);
		 m.setMcolor("White");
		int pk=(Integer)s.save(m);
		t.commit();
		
		if(pk>0)
		{
			System.out.println("inserted record");
		}
		else
		{
			System.out.println("unbale to insert records");
			
		}
	
				s.close();
		sf.close();
		
		
		} catch (Exception e) {
				e.printStackTrace();
		}
		
			
		
	}
	public static void main(String[] args) {
		m1();
	}

}
