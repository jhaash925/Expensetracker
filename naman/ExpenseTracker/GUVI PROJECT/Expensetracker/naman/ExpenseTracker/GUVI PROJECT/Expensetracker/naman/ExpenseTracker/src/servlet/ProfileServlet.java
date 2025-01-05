import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = "JohnDoe"; // Retrieve username from session or database
        String password = "password123"; // Retrieve password from session or database

        request.setAttribute("username", username);
        request.setAttribute("password", password);

        request.getRequestDispatcher("/profile.jsp").forward(request, response);
    }
}