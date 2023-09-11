<!DOCTYPE html>
<html>
    <head>
        <title>JSP exQuatro</title>
    </head>
    <body>
        <jsp:useBean id="p" class="model.Pessoa" />
        <jsp:setProperty name="p" property="nome" value="Nome da Pessoa" />
        <h1><jsp:getProperty name="p" property="nome" /></h1>
        <h2>${p.nome}</h2>
        <jsp:include page="exDois.jsp" />
    </body>
</html>