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
        String pass = request.getParameter("pass");

        System.out.println(login+" "+pass);

        // Call WebService
        // If WebService successfull
        // Dans l'écran accueil : message "user login connecté
        if((login!=null&&login!="")&&(pass!=null&&pass!=""))
        this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
        //remarque login et pass ne seront null que s'il ne sont pas instancié (donc pas lier aux bons éléments)

        // If WebService not successfull
        // Retry dans l'écran Login
        else
        this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        //A laisser pour le moment : sinon plus d'affichage de la page après le premier essai
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
    }
}