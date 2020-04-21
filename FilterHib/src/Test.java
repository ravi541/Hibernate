import java.util.List;
import java.util.Scanner;

import org.hibernate.Filter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		try {
			Configuration config=new Configuration().configure();
			SessionFactory sf=config.buildSessionFactory();
			Session s=sf.openSession();
			Query q=s.createQuery("from Employee");
			Filter f=s.enableFilter("empfilter");
			Scanner sc=new Scanner(System.in);
			System.out.println("Please select any1 option");
			System.out.println("1.Temp \t 2.Perm \t 3.Both");
			int option=sc.nextInt();
			if(option==1)
			{
				f.setParameter("type", "temp");
				
			}
			else if(option==2)
			{
				f.setParameter("type", "perm");
				
			}
			else
			{
				s.disableFilter("empfilter");
			}
			List<Employee> list=q.list();
			System.out.println("ENO\tENAME\tESAL\tEADDR\tETYPE");
		for(Employee l:list)
		{
			System.out.print(l.getEno()+"\t");
			System.out.print(l.getEname()+"\t");
			System.out.print(l.getEsal()+"\t");
			System.out.print(l.getEaddr()+"\t");
			System.out.print(l.getEtype()+"\n");
		}
		System.out.println("");
		
		
		
	} catch (Exception e) {
				e.printStackTrace();
		}

	}

}
