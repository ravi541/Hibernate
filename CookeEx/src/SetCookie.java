
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class SetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SetCookie() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String dno=req.getParameter("dno");
		String dname=req.getParameter("dname");
		
		HttpSession hs=req.getSession();
		
		hs.setAttribute("dno",dno);
		hs.setAttribute("dname",dname);
		
		
		pw.println("<body>");
		pw.println("<form action=disp.com method=post>");
		pw.println("Enter Dept location:<input type=text name=loc>");
		pw.println("<input type=submit value=submit>");
		
		pw.println("</form></body>");
		
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
