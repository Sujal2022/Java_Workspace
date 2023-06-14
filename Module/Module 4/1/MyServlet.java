import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet
{
	String email;
	ServletConfig config;
	
	public void init(ServletConfig config) throws ServletException
	{
		this.config = config;
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
			
		PrintWriter out = resp.getWriter();
		
		email = config.getInitParameter("email");
		System.out.println(email);
		out.print(email);
	}

}
