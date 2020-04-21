
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.http.*;

public class Disp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Disp() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		HttpSession hs=req.getSession();
		String dno=(String)hs.getAttribute("dno");
		String dname=hs.getAttribute("dname").toString();
		String loc=req.getParameter("loc");
		
		pw.println("Dept no="+dno);
		pw.println("<br>");
		pw.println("Dept name="+dname);
		pw.println("<br>");
		pw.println("Dept loc="+loc);
		
		
		
		ServletConfig sc=getServletConfig();
		ServletContext ct=sc.getServletContext();
		
		
		String driver=ct.getInitParameter("driver");
		String url=ct.getInitParameter("url");
		String user=ct.getInitParameter("user");
		String pwd=ct.getInitParameter("pwd");
		try
		{
		Class.forName(driver);
			
		Connection con=DriverManager.getConnection(url,user,pwd);
		PreparedStatement pst=con.prepareStatement("Insert into disp values(?,?,?)");
		
		
		pst.setInt(1, Integer.parseInt(dno));
		pst.setString(2,dname);
		pst.setString(3,loc);
		int result=pst.executeUpdate();
		pw.println("<h2>"+result+" records inserted </h2>"); 
	/*	Statement pst=con.createStatement();
		ResultSet rs=pst.executeQuery("Select * from emp where empno="+eno);
		if(rs.next())
	     {
	    	pw.println("-------------------------------");
	    	 pw.println("Empno\tEname\tsal");
	    	 pw.println("---------------------<br>----------");
	    	 pw.println("-------------------------------");
	    	 pw.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
	     }
	     else
	     {
	    	 pw.println("No record found  ");
	     }*/
		}
		
		catch(SQLException se)
		{
			pw.println("Unable to insert record");
		}
		catch(Exception e)
		{
			pw.println(e);
		}

		
		
		
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
