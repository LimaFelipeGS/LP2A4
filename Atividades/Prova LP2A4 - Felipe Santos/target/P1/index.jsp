<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Login</title>
    <link rel="stylesheet" href="resources/bootstrap.min.css">
    <link rel="stylesheet" href="resources/login.css">
</head>
<body class="text-center">
    <jsp:forward page="home.jsp" />
    <form class="form-signin">
        <h1 class="h3 mb-3 font-weight-normal">Login</h1>
        <label for="inputEmail" class="sr-only">Endereço de email</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Seu email" required autofocus>
        <label for="inputPassword" class="sr-only">Senha</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Senha" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
        <p class="mt-5 mb-3 text-muted">Prova LP2 - 2023</p>
    </form>
</body>
</html>
