import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Person;

import java.io.IOException;

@WebServlet (name = "PersonServlet",urlPatterns = "/person")
public class PersonServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String age = req.getParameter("age");

        StringBuilder error = new StringBuilder();
        if (firstName == null){
            error.append("A first name was not provided.");

        }
        else if (lastName == null ){
            error.append("A last name was not provided.");
        }
        else if (age == null){
            error.append("An age was not provided.");
        }
        if(error.length() > 0){
            req.setAttribute("error",error.toString());
        }else {
            req.setAttribute("person",new Person());
            req.setAttribute("person",new Person( firstName,lastName,Integer.parseInt(age)));
        }
        getServletContext().getRequestDispatcher("/name.jsp").forward(req,resp);


    }
}
/* with out change code that dose not work  properly
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Person;

import java.io.IOException;

@WebServlet (name = "PersonServlet",urlPatterns = "/person")
public class PersonServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String age = req.getParameter("age");

        StringBuilder error = new StringBuilder();
        if (firstName == null){
            error.append("A first name was not provided.");

        }
        else if (lastName == null ){
            error.append("A last name was not provided.");
        }
        else if (age == null){
            error.append("An age was not provided.");
        }
        if(error.length() > 0){
            req.setAttribute("error",error.toString());
        }else {
            req.setAttribute("person",new Person());
            req.setAttribute("person",new Person( firstName,lastName,Integer.parseInt(age)));
        }
        getServletContext().getRequestDispatcher("/name.jsp").forward(req,resp);


    }
}

 */