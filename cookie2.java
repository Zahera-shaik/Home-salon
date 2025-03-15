import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class cookie2 extends HttpServlet
{
   public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
	PrintWriter out=res.getWriter();
	int b=Integer.parseInt(req.getParameter("age"));
	Cookie c1=new Cookie("b",b+"");
	res.addCookie(c1);
	
	RequestDispatcher rd=req.getRequestDispatcher("cookie3");
	rd.forward(req,res);	
   }
}