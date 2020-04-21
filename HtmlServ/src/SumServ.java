

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.ravi.pojo.User;

@WebServlet("/SumServ")
public class SumServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public SumServ() {
        super();
        
    }



	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		
		doPost(req,res);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		res.setContentType("text/html");
		int userid=Integer.parseInt(req.getParameter("userid"));
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		PrintWriter pw=res.getWriter();
		pw.println("hii");
		Configuration config=new Configuration();
		pw.println("hii5");
		config.configure("/com/ravi/pojo/hibernate.cfg.xml");
		pw.println("hii1");
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession();
		
		
		/*
		Transaction t = s.beginTransaction();   
		  User user=new User();
		  user.setUserid(userid);
		  user.setUname(uname);
		  user.setPwd(pwd);
		  s.saveOrUpdate(user);
		t.commit();    
		s.close();  
		System.out.println("updated");
		
		*/
		
		User user=(User)s.get(User.class, userid);
				
		pw.println("hii2");
		try {
		if(user==null)
		  {
			
			pw.println("hii14");
			pw.println("Please Enter the valid user name");
			//RequestDispatcher resd=req.getRequestDispatcher("Failure.html");
			//resd.forward(req, res);
			
			res.sendRedirect("Failure.html");
			
		
		  }
		}catch(NullPointerException e)
		{
			pw.println("null");
		}
		if(user.getPwd().contentEquals("2WRS"))
			
		{	
			pw.println("hii15");
		res.sendRedirect("Success.html");
			//RequestDispatcher resd1=req.getRequestDispatcher("Success.html");
			//resd1.forward(req, res);
		}
		else 
		{
			pw.println("hii16");
			res.sendRedirect("Failure.html");
		}
		
		
	}

}
