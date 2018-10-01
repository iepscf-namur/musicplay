package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = "Home";
        int servletInfo = this.getServletContext().getMajorVersion();
        request.setAttribute("title", title);
        request.setAttribute("servletInfo", servletInfo);
        //System.out.println(title);
        this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }
}
