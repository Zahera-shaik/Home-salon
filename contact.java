import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class contact extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");

        String name = req.getParameter("t1");
        String email = req.getParameter("t2");
        long n = Long.parseLong(req.getParameter("t3")); // Changed to long
        String adres = req.getParameter("t4");
        String msg = req.getParameter("t5");

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
            PreparedStatement pst = con.prepareStatement("INSERT INTO contact VALUES (?, ?, ?, ?, ?)");

            pst.setString(1, name);
            pst.setString(2, email);
            pst.setLong(3, n); // Changed to setLong
            pst.setString(4, adres);
            pst.setString(5, msg);

            int i = pst.executeUpdate();
            if (i == 1) {
                out.println("<h1><b><i>YOUR ORDER PLACED SUCCESSFULLY</h1></b></i>");
            }
        } catch (Exception e) {
            out.println(e);
        }
    }
}
