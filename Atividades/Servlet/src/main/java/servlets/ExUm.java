package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/bemvindo, /inicio"})
public class ExUm extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("formulario.html");
        String nome = req.getParameter("nome");
        PrintWriter writer = resp.getWriter();
        writer.println("<p>Bem vindo, " + nome + "</p>");
    }
}
