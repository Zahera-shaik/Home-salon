<%@ page import="java.sql.*"%>
<%
try{
       Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
       Statement stmt=con.createStatement();
       ResultSet rs=stmt.executeQuery(qry);
%>
<body align="center">
<b>CUSTOMER DETAILS</b>
<table border="2px" align="center">
<style>
table {
   border-collapse: collapse;
   width:100px;
 }
th,td {
  padding:8px;
  text-align= left;
  border-bottom: 1px solid #DDD;
}
tr:hover {background-color: #D6EEEE;}
</style>
<tr>
<th>Name</th>
<th>Email</th>
<th>Phone Number</th>
<th>Address</th>
<th>Service</th>
</tr>
<%
while(rs.next())
{

%>
<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td>
</tr>
<%
}
%>
</table>
  <%
}catch(Exception e)
{
  out.println("e);
}%>
