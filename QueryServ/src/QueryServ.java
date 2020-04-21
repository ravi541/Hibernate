import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;


public class QueryServ extends HttpServlet 
{
	
	public void service(ServletRequest req,ServletResponse res) throws ServletException , IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String sno=req.getParameter("stno");
		String name=req.getParameter("name");
		String marks=req.getParameter("marks");
		
		pw.println(sno);
		pw.println(name);
		pw.println(marks);
	
		pw.close();
		
	}
	public void destory()
	{
		System.out.println("outtt");
	}
	
}
