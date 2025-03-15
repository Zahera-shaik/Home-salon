import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class cookie1 extends HttpServlet
{
   public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
	PrintWriter out=res.getWriter();
	String a=req.getParameter("name");
	Cookie c1=new Cookie("a",a);
	res.addCookie(c1);
	res.sendRedirect("cookie2.html");	
   }
}