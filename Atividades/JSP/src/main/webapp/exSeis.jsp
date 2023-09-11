<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP exSeis</title>
    </head>
    <body>
        <c:set var="nomes" value="${['Igor', 'Maria', 'Joao']}" />
        <c:set var="teste" value="${true}" />
        <c:set var="idade" value="${18}" />

        <c:forEach var="nome" items="${nomes}">
            <p>${nome}</p>
        </c:forEach>

        <c:if test="${teste == true}">
            <p>Mostrou</p>
        </c:if>


    </body>
</html>