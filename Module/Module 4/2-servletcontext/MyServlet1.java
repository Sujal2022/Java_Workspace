import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet1 extends HttpServlet
{
	String driver;
	ServletContext context;
	
	public void init(ServletConfig config) throws ServletException
	{
		this.context = config.getServletContext();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		PrintWriter out = resp.getWriter();
		
		driver = context.getInitParameter("driver");
		System.out.println(driver);
		out.print(driver);	
	}
}

	
	
