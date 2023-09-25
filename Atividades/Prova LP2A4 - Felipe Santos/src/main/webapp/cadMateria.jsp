<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pt-br">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Home</title>
    <link rel="stylesheet" href="resources/bootstrap.min.css">
    <link rel="stylesheet" href="resources/cadastros.css">
</head>
<body class="bg-light">

<jsp:include page="header.jsp" />

<div class="container">
    <div class="py-5 text-center">
        <h2>Cadastro de Matérias</h2>
    </div>

    <div class="row">
        <div class="col-md-12 order-md-1">
            <form class="needs-validation" novalidate>
                <div class="mb-3">
                    <label for="primeiroNome">Nome</label>
                    <input type="text" class="form-control" id="primeiroNome" placeholder="" value="" required>
                    <div class="invalid-feedback">
                        É obrigatório inserir um nome válido.
                    </div>
                </div>
                <div class="mb-3">
                    <label for="professor" >Professor</label>
                    <input class="form-control" list="datalistProfessor" id="professor" placeholder="Digite para pesquisar..." required>
                    <datalist id="datalistProfessor">
                        <c:forEach items="${professores}" var="professor">
                            <option value="${professor.id} - ${professor.nome} ${professor.sobrenome}">${professor.area}</option>
                        </c:forEach>
                    </datalist>
                    <div class="invalid-feedback">
                        É obrigatório selecionar um professor.
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label for="dia">Dia da Semana</label>
                        <select class="custom-select d-block w-100" id="dia" required>
                            <option value="">Escolha...</option>
                            <option>Segunda</option>
                        </select>
                        <div class="invalid-feedback">
                            Por favor, um dia válido.
                        </div>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="horario">Horário</label>
                        <select class="custom-select d-block w-100" id="horario" required>
                            <option value="">Escolha...</option>
                            <option>7h00</option>
                        </select>
                        <div class="invalid-feedback">
                            Por favor, um horário válido.
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label for="primeiro">Semestre</label>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="custom-control custom-radio">
                                    <input id="primeiro" name="semestre" type="radio" class="custom-control-input" checked required>
                                    <label class="custom-control-label" for="primeiro">1°</label>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="custom-control custom-radio">
                                    <input id="segundo" name="semestre" type="radio" class="custom-control-input" required>
                                    <label class="custom-control-label" for="segundo">2°</label>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-6 mb-3">
                        <label for="ano">Ano</label>
                        <select class="custom-select d-block w-100" id="ano" required>
                            <option value="">Escolha...</option>
                            <option>2023</option>
                        </select>
                        <div class="invalid-feedback">
                            Por favor, um ano válido.
                        </div>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="curso">Curso</label>
                    <select class="custom-select d-block w-100" id="curso" name="curso" required>
                        <option value="">Escolha...</option>
                        <option>ADS</option>
                    </select>
                    <div class="invalid-feedback">
                        Por favor, insira um curso válido.
                    </div>
                </div>

                <hr class="mb-4">

                <button class="btn btn-primary btn-lg btn-block" type="submit">Cadastrar</button>
            </form>
        </div>
    </div>

    <jsp:include page="footer.jsp" />
</div>

<script>
    // Exemplo de JavaScript para desativar o envio do formulário, se tiver algum campo inválido.
    (function() {
        'use strict';

        window.addEventListener('load', function() {
            // Selecione todos os campos que nós queremos aplicar estilos Bootstrap de validação customizados.
            var forms = document.getElementsByClassName('needs-validation');

            // Faz um loop neles e previne envio
            var validation = Array.prototype.filter.call(forms, function(form) {
                form.addEventListener('submit', function(event) {
                    if (form.checkValidity() === false) {
                        event.preventDefault();
                        event.stopPropagation();
                    }
                    form.classList.add('was-validated');
                }, false);
            });
        }, false);
    })();
</script>
</body>
</html>
