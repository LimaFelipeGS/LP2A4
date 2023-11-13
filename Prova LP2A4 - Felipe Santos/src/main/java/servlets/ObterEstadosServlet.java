package servlets;

import enuns.Cidades;
import enuns.Paises;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ObterEstados")
public class ObterEstadosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String paisSelecionado = req.getParameter("pais");

        // Converte a lista de cidades em JSON e envia como resposta
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        out.write(jsonListToString(Cidades.getCidadesPorPais(Paises.valueOf(paisSelecionado))));
    }

    private String jsonListToString(List<Cidades> lista) {
        StringBuilder json = new StringBuilder();
        json.append("[");
        for (int i = 0; i < lista.size(); i++) {
            json.append("{\"nome\": \"").append(lista.get(i).getNome()).append("\",").append(" \"valor\": \"").append(lista.get(i)).append("\"}");
            if (i < lista.size() - 1) {
                json.append(",");
            }
        }
        json.append("]");
        return json.toString();
    }
}
