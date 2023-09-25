package servlets;

import enuns.Cursos;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Aluno;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FormatarData;
import util.HibernateUtil;

import java.io.IOException;

@WebServlet(value = "/AddAluno")
public class AddAlunoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("cursos", Cursos.values());
        RequestDispatcher dispatcher = req.getRequestDispatcher("cadAluno.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(req.getParameter("nome"));

        Aluno aluno = new Aluno(
            req.getParameter("nome"),
                req.getParameter("sobrenome"),
                req.getParameter("genero"),
                req.getParameter("cpf"),
                FormatarData.formatarData(req.getParameter("dataNascimento")),
                req.getParameter("email"),
                req.getParameter("emailSecundario"),
                req.getParameter("curso"),
                Integer.parseInt(req.getParameter("semestreIngresso")),
                Integer.parseInt(req.getParameter("anoIngresso")),
                req.getParameter("situacao"),
                Double.parseDouble(req.getParameter("ira"))
        );

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(aluno);

        transaction.commit();

        resp.sendRedirect("ListarAluno");
    }
}
