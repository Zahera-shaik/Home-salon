import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
public class add extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
PrintWriter out=res.getWriter();
res.setContentType("text/html");
int r=Integer.parseInt(req.getParameter("f1"));
String name=req.getParameter("f2");
String branch=req.getParameter("f3");
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
PreparedStatement pst=con.prepareStatement("insert into add_stu values(?,?,?)");
pst.setInt(1,r);
pst.setString(2,name);
pst.setString(3,branch);
int i=pst.executeUpdate();
if(i==1)
   out.println("<h1><b><i>student added succesfully</H1></B></I>");
}
catch(Exception e)
{
	out.println(e);
}
}
}