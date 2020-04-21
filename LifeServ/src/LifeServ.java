import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;


public class LifeServ extends HttpServlet 
{
	public void init(ServletConfig sc)
	{
		System.out.println("Iam from init");
	}
	public void service(ServletRequest req,ServletResponse res) throws ServletException , IOException
	{
		System.out.println("Iam from service");
		
	}
	public void destroy()
	{
		System.out.println("I am from destroy ");
	}
}
