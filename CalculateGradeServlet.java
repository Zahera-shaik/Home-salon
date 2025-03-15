import java.io.*;
import java.sql.*;
import javax.servlet.http.HttpServlet;
public class CalculateGradeServlet extends HttpServlet
{
    Pvoid doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String subject = request.getParameter("subject");
        int marks = Integer.parseInt(request.getParameter("marks"));
        String grade = calculateGrade(marks);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Grade Calculator</title></head>");
        out.println("<body>");
        out.println("<h1>Subject: " + subject + "</h1>");
        out.println("<h2>Marks: " + marks + "</h2>");
        out.println("<h2>Grade: " + grade + "</h2>");
        out.println("</body>");
        out.println("</html>");
    }
    
    public String calculateGrade(int marks) {
        String grade = "";
        
        if(marks >= 90) {
            grade = "A+";
        } else if(marks >= 80) {
            grade = "A";
        } else if(marks >= 70) {
            grade = "B";
        } else if(marks >= 60) {
            grade = "C";
        } else if(marks >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        return grade;
    }
}
