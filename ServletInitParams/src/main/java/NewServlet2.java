import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.servletinitparams.HelloServlet;

import java.io.IOException;
@WebServlet(name = "NewServlet2 ",urlPatterns = "/hello2",initParams = {@WebInitParam(name = "copyrightYear",value = "2019")})
public class NewServlet2  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String copyrightYear = getServletConfig().getInitParameter("copyrightYear");
        if (copyrightYear != null) {
            System.out.println(copyrightYear);
        }

    }
}
