

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ravi.entity.Employee;
import com.ravi.service.EmployeeService;

@WebServlet("/Pagination")
public class Pagination extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	public Pagination() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String label=request.getParameter("button");
		EmployeeService	empservice=new EmployeeService();
		List<Employee> emplist=empservice.getEmployees(label);
		
		out.println("<html>");
		out.println("Employee Details");
		out.println("<br>");
		for(Employee emp:emplist)
		{
			out.println("Employee number:"+emp.getEno());
			out.println("<br>");
			out.println("Employee name:"+emp.getEname());
			out.println("<br>");
			out.println("Employee sal:"+emp.getEsal());
			out.println("<br>");
			out.println("Employee address:"+emp.getEaddr());
			out.println("<br>");
			out.println("<hr>");
		
		}
		
		RequestDispatcher reqdis=request.getRequestDispatcher("Form.html");
		reqdis.include(request, response);
	}

}
