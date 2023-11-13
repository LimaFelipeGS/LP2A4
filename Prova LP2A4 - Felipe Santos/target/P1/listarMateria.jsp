<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pt-br">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Home</title>
    <link rel="stylesheet" href="resources/bootstrap.min.css">
    <link rel="stylesheet" href="resources/listas.css">
</head>
<body class="bg-light">

<jsp:include page="header.jsp" />

<main role="main" class="container">
    <div class="d-flex align-items-center p-3 my-3 bg-purple rounded shadow-sm">
        <div class="col-sm-6 d-flex align-items-center justify-content-start">
            <h4>Matérias</h4>
        </div>
        <div class="col-sm-6 d-flex justify-content-end">
            <a href="cadMateria.jsp" class="btn btn-primary">Adicionar</a>
        </div>
    </div>

    <div class="my-3 p-3 bg-white rounded shadow-sm">
        <div class="table-responsive">
            <table class="table">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">First</th>
                    <th scope="col">Last</th>
                    <th scope="col">Handle</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td>Jacob</td>
                    <td>Thornton</td>
                    <td>@fat</td>
                </tr>
                <tr>
                    <th scope="row">3</th>
                    <td>Larry</td>
                    <td>the Bird</td>
                    <td>@twitter</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</main>

<jsp:include page="footer.jsp" />

</body>
</html>
