

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.ravi.pojo.Country;


@WebServlet("/HServ")
public class HServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HServ() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		int cid=Integer.parseInt(request.getParameter("cid"));
		//String cname=request.getParameter("cname");
	//	String ccap=request.getParameter("ccap");
		
		Configuration config=new Configuration();
		config.configure();
		
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Country c=new Country();
		c.setCid(cid);
	
		Country c1=(Country)s.get(Country.class, cid);
		if(c1==null)
			
		{
			pw.println("Country with enterd code does not exist");
		}
		else
		{
			pw.println(c1.getCcap());
			pw.println(c1.getCid());
			pw.println(c1.getCname());
		}
		t.commit();
		pw.println("updated");
	
	}

}
