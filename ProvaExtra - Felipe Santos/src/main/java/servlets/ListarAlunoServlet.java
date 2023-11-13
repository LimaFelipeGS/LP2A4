package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Aluno;
import org.hibernate.Session;
import util.HibernateUtil;

import java.io.IOException;
import java.util.List;

@WebServlet(value = "/ListarAluno")
public class ListarAlunoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Aluno> alunos = session.createQuery("from Aluno", Aluno.class).list();

        req.setAttribute("Aluno", alunos);
        RequestDispatcher dispatcher = req.getRequestDispatcher("listarAluno.jsp");
        dispatcher.forward(req, resp);
    }
}
