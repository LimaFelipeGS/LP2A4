<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pt-br">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Home</title>
    <link rel="stylesheet" href="resources/bootstrap.min.css">
    <link rel="stylesheet" href="resources/home.css">
</head>
<body>

    <jsp:include page="header.jsp" />

    <main role="main">
        <div class="container marketing">
            <div class="row">
                <div class="col-lg-3 d-flex align-items-center flex-column">
                    <div class="shadow rounded-circle border border-secondary icones d-flex justify-content-center align-items-center">
                        <img src="resources/fontawesome/chalkboard-user-solid.svg" alt="" width="100" height="100">
                    </div>
                    <h2>Professores</h2>
                    <p><a class="btn btn-secondary" href="ListarProfessor" role="button">Ver lista &raquo;</a></p>
                    <p><a class="btn btn-primary" href="AddProfessor" role="button">Adicionar +</a></p>
                </div>
                <div class="col-lg-3 d-flex align-items-center flex-column">
                    <div class="shadow rounded-circle border border-secondary icones d-flex justify-content-center align-items-center">
                        <img src="resources/fontawesome/user-graduate-solid.svg" alt="" width="100" height="100">
                    </div>
                    <h2>Alunos</h2>

                    <p><a class="btn btn-secondary" href="listarAluno.jsp" role="button">Ver lista &raquo;</a></p>
                    <p><a class="btn btn-primary" href="cadAluno.jsp" role="button">Adicionar +</a></p>
                </div>
                <div class="col-lg-3 d-flex align-items-center flex-column">
                    <div class="shadow rounded-circle border border-secondary icones d-flex justify-content-center align-items-center">
                        <img src="resources/fontawesome/book-solid.svg" alt="" width="90" height="90">
                    </div>
                    <h2>Matérias</h2>
                    <p><a class="btn btn-secondary" href="listarMateria.jsp" role="button">Ver lista &raquo;</a></p>
                    <p><a class="btn btn-primary" href="cadMateria.jsp" role="button">Adicionar +</a></p>
                </div>
                <div class="col-lg-3 d-flex align-items-center flex-column">
                    <div class="shadow rounded-circle border border-secondary icones d-flex justify-content-center align-items-center">
                        <img src="resources/fontawesome/note-sticky-regular.svg" alt="" width="90" height="90">
                    </div>
                    <h2>Notas</h2>
                    <p><a class="btn btn-secondary" href="listarNota.jsp" role="button">Ver lista &raquo;</a></p>
                    <p><a class="btn btn-primary" href="cadNota.jsp" role="button">Adicionar +</a></p>
                </div>
            </div>
        </div>
    </main>

    <jsp:include page="footer.jsp" />
</body>
</html>
