

<%@ page import="java.sql.*"%>

<%
try{

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
String qry="select * from contact";
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(qry);


%>
<body align="center">
<b>MY SERVICE DETAILS</b>
<table border="1px" align="center">
<style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #DDD;
}

tr:hover {background-color: #D6EEEE;}
</style>
<tr>
<th>SERVICE</th>
</tr>
<%
while(rs.next())
{

%>
<tr>
<td><%=rs.getString(5)%></td>
</tr>
<%
}
%>
</table>


<%
}
catch(Exception e)
{
out.println(e);
}
%>