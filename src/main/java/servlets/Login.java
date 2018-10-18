package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String pass = request.getParameter("Pass");

        System.out.println(login);

        // Call WebService
        // If WebService successfull
        // Dans l'écran accueil : message "user login connecté

        this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);

        // If WebService not successfull
        // Retry dans l'écran Login

        // A ENLEVER this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

    }
}