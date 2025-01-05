import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<!DOCTYPE html>");
        response.getWriter().println("<html>");
        response.getWriter().println("<head>");
        response.getWriter().println("<title>User Registration</title>");
        response.getWriter().println("</head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>User Registration</h1>");
        response.getWriter().println("<form action=\"RegistrationServlet\" method=\"post\">");
        response.getWriter().println("  <label for=\"username\">Username:</label><br>");
        response.getWriter().println("  <input type=\"text\" id=\"username\" name=\"username\" required><br><br>");
        response.getWriter().println("  <label for=\"password\">Password:</label><br>");
        response.getWriter().println("  <input type=\"password\" id=\"password\" name=\"password\" required><br><br>");
        response.getWriter().println("  <input type=\"submit\" value=\"Register\">");
        response.getWriter().println("</form>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // You would typically store this data in a database here
        // ...

        response.setContentType("text/html");
        response.getWriter().println("<!DOCTYPE html>");
        response.getWriter().println("<html>");
        response.getWriter().println("<head>");
        response.getWriter().println("<title>Registration Success</title>");
        response.getWriter().println("</head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Registration Successful!</h1>");
        response.getWriter().println("<p>Welcome, " + username + "!</p>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}