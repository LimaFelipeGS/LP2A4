<%@ page import="model.Pessoa" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP exDois</title>
    </head>
    <body>
        <% Pessoa p = new Pessoa("Pessoa", 30); %>
        <p><%= p.getNome() %></p>
        <p><%= p.getIdade() %></p>
    </body>
</html>