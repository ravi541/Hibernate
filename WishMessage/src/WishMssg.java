
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;


/**
 * Servlet implementation class WishMsg
 */

public class WishMssg extends HttpServlet {
	public void service(ServletRequest req,ServletResponse res) throws ServletException , IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		Date d=new Date();
		int h=d.getHours();
		if((h>15) && (h<18))
		{
			pw.println("Good evng");
		}
		else
		{
			pw.println("hiiiiiiiiii");
		}
		//pw.println("Current date and time"+d);
		
	}

}
