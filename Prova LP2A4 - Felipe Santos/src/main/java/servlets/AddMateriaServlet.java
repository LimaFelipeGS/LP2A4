package servlets;

import enuns.Cursos;
import enuns.DiaSemana;
import enuns.HorarioAula;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Endereco;
import model.Materia;
import model.Professor;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FormatarData;
import util.HibernateUtil;

import java.io.IOException;
import java.util.List;

@WebServlet(value = "/AddMateria")
public class AddMateriaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Professor> professores = session.createQuery("from Professor ", Professor.class).list();

        req.setAttribute("professores", professores);
        req.setAttribute("cursos", Cursos.values());
        req.setAttribute("dias", DiaSemana.values());
        req.setAttribute("horarios", HorarioAula.values());
        RequestDispatcher dispatcher = req.getRequestDispatcher("cadMateria.jsp");
        dispatcher.forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(req.getParameter("nome"));

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

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(materia);

        transaction.commit();

        resp.sendRedirect("ListarMateria");
    }
}