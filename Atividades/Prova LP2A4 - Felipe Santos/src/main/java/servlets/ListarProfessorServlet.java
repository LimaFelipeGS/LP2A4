package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Professor;
import org.hibernate.Session;
import util.HibernateUtil;

import java.io.IOException;
import java.util.List;

@WebServlet(value = "/ListarProfessor")
public class ListarProfessorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Professor> professores = session.createQuery("from Professor ", Professor.class).list();

        req.setAttribute("professores", professores);
        RequestDispatcher dispatcher = req.getRequestDispatcher("listarProfessor.jsp");
        dispatcher.forward(req, resp);
    }
}
