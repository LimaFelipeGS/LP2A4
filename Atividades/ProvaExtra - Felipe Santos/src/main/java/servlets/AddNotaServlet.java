package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FormatarData;
import util.HibernateUtil;

import java.io.IOException;
import java.util.List;
import java.util.ServiceConfigurationError;

@WebServlet(value = "/AddNota")
public class AddNotaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Aluno> alunos = session.createQuery("from Aluno", Aluno.class).list();

        req.setAttribute("Aluno", alunos);
        RequestDispatcher dispatcher = req.getRequestDispatcher("cadNota.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(req.getParameter("nome"));

        Session session = HibernateUtil.getSessionFactory().openSession();

        Aluno aluno = session.get(Aluno.class, "aluno_id");

        Nota nota = new Nota(
                Double.parseDouble(req.getParameter("nota")),
                aluno
        );

        Transaction transaction = session.beginTransaction();

        session.persist(nota);

        transaction.commit();

        aluno.calculoIra(nota);

        resp.sendRedirect("ListarNota");
    }
}
