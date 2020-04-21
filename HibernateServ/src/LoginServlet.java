

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import Com.ravi.pojo.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginServlet() {
        super();    
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doPost(req,res);
	}

		protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			res.setContentType("text/html");
			
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		PrintWriter pw=res.getWriter();
		pw.println("hii");
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sf=config.buildSessionFactory();
		Session s=sf.openSession();
		User user=(User)s.get(User.class, uname);
		if(user==null)
		{
			pw.println("Please Enter the valid user name");
			res.sendRedirect("Failure.html");
		}
		if(user.getPwd().contentEquals(pwd));
		{
		res.sendRedirect("Success.html");
		}
		
		
	}

}
