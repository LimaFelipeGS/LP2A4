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

        List<Aluno> alunos = session.createQuery("from Aluno ", Aluno.class).list();
        List<Materia> materias = session.createQuery("from Materia ", Materia.class).list();

        req.setAttribute("alunos", alunos);
        req.setAttribute("materias", materias);
        RequestDispatcher dispatcher = req.getRequestDispatcher("cadNota.jsp");
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

        Endereco endereco = new Endereco(req.getParameter("endereco"), req.getParameter("pais"), req.getParameter("estado"), req.getParameter("cep"));

        Professor professor = new Professor(req.getParameter("nome"),
                req.getParameter("sobrenome"),
                req.getParameter("cpf"),
                req.getParameter("emailInstitucional"),
                req.getParameter("emailAlternativo"),
                FormatarData.formatarData(req.getParameter("dataNascimento")),
                req.getParameter("genero"),
                endereco,
                req.getParameter("jornada"),
                req.getParameter("area"));

        Materia materia = new Materia(
                req.getParameter("nome"),
                req.getParameter("curso"),
                req.getParameter("dia"),
                req.getParameter("horario"),
                Integer.parseInt(req.getParameter("semestre")),
                Integer.parseInt(req.getParameter("ano")),
                professor
        );

        Nota nota = new Nota(
                Double.parseDouble(req.getParameter("nota")),
                materia,
                aluno
        );

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(nota);

        transaction.commit();

        resp.sendRedirect("ListarNota");
    }
}
