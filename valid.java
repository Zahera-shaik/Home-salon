0import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
public class valid extends GenericServlet
{
public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
{
PrintWriter out=res.getWriter();
String name=req.getParameter("t1");
out.println("Welcome :"+name);
}
}