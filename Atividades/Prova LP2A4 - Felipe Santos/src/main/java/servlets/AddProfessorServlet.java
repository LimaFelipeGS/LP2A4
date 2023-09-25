package servlets;

import enuns.Areas;
import enuns.NivelAcademico;
import enuns.Paises;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Endereco;
import model.Professor;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FormatarData;
import util.HibernateUtil;

import java.io.IOException;

@WebServlet(value = "/AddProfessor")
public class AddProfessorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("paises", Paises.values());
        req.setAttribute("niveisAcademicos", NivelAcademico.values());
        req.setAttribute("areas", Areas.values());
        RequestDispatcher dispatcher = req.getRequestDispatcher("cadProfessor.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(req.getParameter("nome"));

        Endereco endereco = new Endereco(req.getParameter("endereco"), req.getParameter("pais"), req.getParameter("estado"), req.getParameter("cep"));

        Professor professor = new Professor(
                req.getParameter("nome"),
                req.getParameter("sobrenome"),
                req.getParameter("cpf"),
                req.getParameter("emailInstitucional"),
                req.getParameter("emailAlternativo"),
                FormatarData.formatarData(req.getParameter("dataNascimento")),
                req.getParameter("genero"),
                endereco,
                req.getParameter("jornada"),
                req.getParameter("area")
        );

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(professor);

        transaction.commit();

        resp.sendRedirect("ListarProfessor");
    }
}
