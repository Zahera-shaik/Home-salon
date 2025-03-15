import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class cookie3 extends GenericServlet
{
   public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
   {
	PrintWriter out=res.getWriter();
	HttpServletRequest httpreq = (HttpServletRequest) req;
        HttpServletResponse httpres = (HttpServletResponse) res;
	Cookie cookies[]=httpreq.getCookies();
	for(int i=0;i<2;i++)
	{
		out.println(cookies[i].getValue());
	}

   }
}