import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "AnnotatedServlet" , urlPatterns = {"/kody", "/cheese", "/kody/*" , "/simpson/kody/poop"}) /* // /kody/* called asterisk wildcard allow any character or word after /kody.
exm:http://localhost:8080/kody/poo/yummy/cool here i did not use yummy or cool but working */

public class AnnotatedServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("The get method has benn called");

    }
}