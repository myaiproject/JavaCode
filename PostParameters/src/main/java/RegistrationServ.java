import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.postparameters.HelloServlet;

import java.io.IOException;
@WebServlet(name = "RegistrationServ" ,urlPatterns = "/register")
public class RegistrationServ extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        if (email == null || name == null || age == null || password == null || confirmPassword == null) {
            req.setAttribute("error","You are missing of the inputs");
            doGet(req, resp);

        }
        else {
            if (!password.equalsIgnoreCase(confirmPassword)) {
                req.setAttribute("error","Passwords do not match");
                doGet(req, resp);
            }
else {
                System.out.println("Registration successful");
            }
        }
        
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/register.jsp").forward(req, resp);
    }

}
