package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Materia;
import org.hibernate.Session;
import util.HibernateUtil;

import java.io.IOException;
import java.util.List;

@WebServlet(value = "/ListarMateria")
public class ListarMateriaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Materia> materias = session.createQuery("from Materia ", Materia.class).list();

        req.setAttribute("materias", materias);
        RequestDispatcher dispatcher = req.getRequestDispatcher("listarMateria.jsp");
        dispatcher.forward(req, resp);
    }
}
