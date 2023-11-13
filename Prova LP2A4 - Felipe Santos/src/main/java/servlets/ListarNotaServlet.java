package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Nota;
import org.hibernate.Session;
import util.HibernateUtil;

import java.io.IOException;
import java.util.List;

@WebServlet(value = "/ListarNota")
public class ListarNotaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Nota> notas = session.createQuery("from Nota ", Nota.class).list();

        req.setAttribute("notas", notas);
        RequestDispatcher dispatcher = req.getRequestDispatcher("listarNota.jsp");
        dispatcher.forward(req, resp);
    }
}
