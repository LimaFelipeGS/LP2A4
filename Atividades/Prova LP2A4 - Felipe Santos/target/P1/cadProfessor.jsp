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
        <h2>Cadastro de Professores</h2>
    </div>

    <div class="row">
        <div class="col-md-12 order-md-1">
            <form class="needs-validation" method="post" action="AddProfessor" novalidate>
                <h4 class="mb-3">Dados Pessoais</h4>
                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label for="nome">Nome</label>
                        <input type="text" class="form-control" id="nome" name="nome" placeholder="" value="" required>
                        <div class="invalid-feedback">
                            É obrigatório inserir um nome válido.
                        </div>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="sobrenome">Sobrenome</label>
                        <input type="text" class="form-control" id="sobrenome" name="sobrenome" placeholder="" value="" required>
                        <div class="invalid-feedback">
                            É obrigatório inserir um sobrenome válido.
                        </div>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="cpf">CPF</label>
                        <input type="text" class="form-control" id="cpf" name="cpf" placeholder="" value="" required>
                        <div class="invalid-feedback">
                            É obrigatório inserir um CPF válido.
                        </div>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="dataNascimento">Data de Nascimento</label>
                        <input type="date" class="form-control" id="dataNascimento" name="dataNascimento" placeholder="" value="" required>
                        <div class="invalid-feedback">
                            É obrigatório inserir uma data de nascimento válido.
                        </div>
                    </div>
                </div>
                <div class="mb-3">
                    <label for="outro">Gênero</label>
                    <div class="row">
                        <div class="col-md-4">
                            <div class="custom-control custom-radio">
                                <input id="masc" name="genero" type="radio" class="custom-control-input" required>
                                <label class="custom-control-label" for="masc">Masculino</label>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="custom-control custom-radio">
                                <input id="fem" name="genero" type="radio" class="custom-control-input" required>
                                <label class="custom-control-label" for="fem">Feminino</label>
                            </div>
                        </div>
                        <div class="col-md-4 mb-3">
                            <div class="custom-control custom-radio">
                                <input id="outro" name="genero" type="radio" class="custom-control-input" required>
                                <label class="custom-control-label" for="outro">Outros</label>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="emailInstitucional">E-mail Institucional</label>
                    <input type="email" class="form-control" id="emailInstitucional" name="emailInstitucional" placeholder="email@exemplo.com" value="" required>
                    <div class="invalid-feedback">
                        Por favor, insira um endereço de e-mail válido.
                    </div>
                </div>

                <div class="mb-3">
                    <label for="emailAlternativo">Email Alternativo <span class="text-muted">(Opcional)</span></label>
                    <input type="email" class="form-control" id="emailAlternativo" name="emailAlternativo" placeholder="email@exemplo.com">
                    <div class="invalid-feedback">
                        Por favor, insira um endereço de e-mail válido, para recuperação.
                    </div>
                </div>

                <hr class="mb-4">

                <h4 class="mb-3">Endereço</h4>

                <div class="mb-3">
                    <label for="endereco">Endereço</label>
                    <input type="text" class="form-control" id="endereco" name="endereco" placeholder="Rua dos bobos, nº 0" required>
                    <div class="invalid-feedback">
                        Por favor, insira seu endereço.
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-5 mb-3">
                        <label for="pais">País</label>
                        <select class="custom-select d-block w-100" id="pais" name="pais" required>
                            <option value="">Escolha...</option>
                            <c:forEach items="${paises}" var="pais">
                                <option value="${pais}">${pais.getNome()}</option>
                            </c:forEach>
                        </select>
                        <div class="invalid-feedback">
                            Por favor, escolha um país válido.
                        </div>
                    </div>
                    <div class="col-md-4 mb-3">
                        <label for="estado">Estado</label>
                        <select class="custom-select d-block w-100" id="estado" name="estado" required>
                            <option value="">Escolha...</option>
                        </select>
                        <div class="invalid-feedback">
                            Por favor, escolha um estado válido.
                        </div>
                    </div>
                    <div class="col-md-3 mb-3">
                        <label for="cep">CEP</label>
                        <input type="text" class="form-control" id="cep" name="cep" placeholder="" required>
                        <div class="invalid-feedback">
                            É obrigatório inserir um CEP.
                        </div>
                    </div>
                </div>

                <hr class="mb-4">

                <h4 class="mb-3">Dados Funcionais</h4>

                <div class="mb-3">
                    <label for="formacao">Nível de formação</label>
                    <select class="custom-select d-block w-100" id="formacao" name="formacao" required>
                        <option value="">Escolha...</option>
                        <c:forEach items="${niveisAcademicos}" var="nivel">
                            <option value="${nivel}">${nivel.getDescricao()}</option>
                        </c:forEach>
                    </select>
                    <div class="invalid-feedback">
                        Por favor, insira uma formação válida.
                    </div>
                </div>

                <div class="mb-3">
                    <label for="outro">Jornada</label>
                    <div class="row">
                        <div class="col-md-4">
                            <div class="custom-control custom-radio">
                                <input id="quarenta" name="jornada" type="radio" class="custom-control-input" required>
                                <label class="custom-control-label" for="quarenta">40h</label>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="custom-control custom-radio">
                                <input id="vinte" name="jornada" type="radio" class="custom-control-input" required>
                                <label class="custom-control-label" for="vinte">20h</label>
                            </div>
                        </div>
                        <div class="col-md-4 mb-3">
                            <div class="custom-control custom-radio">
                                <input id="dedicacao" name="jornada" type="radio" class="custom-control-input" required>
                                <label class="custom-control-label" for="dedicacao">Dedicação Exclusiva</label>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="area">Área de formação</label>
                    <select class="custom-select d-block w-100" id="area" name="area" required>
                        <option value="">Escolha...</option>
                        <c:forEach items="${areas}" var="area">
                            <option value="${area}">${area.getDescricao()}</option>
                        </c:forEach>
                    </select>
                    <div class="invalid-feedback">
                        Por favor, insira uma área válida.
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
            let forms = document.getElementsByClassName('needs-validation');

            // Faz um loop neles e previne envio
            let validation = Array.prototype.filter.call(forms, function(form) {
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

    document.getElementById("pais").addEventListener("change", function() {
        let selectedPais = this.value;
        let estadoSelect = document.getElementById("estado");
        estadoSelect.innerHTML = ""; // Limpar a lista de cidades

        // Fazer uma solicitação AJAX para obter as cidades correspondentes ao país selecionado
        let xhr = new XMLHttpRequest();
        xhr.open("GET", "obterEstados?pais=" + selectedPais, true);
        xhr.onreadystatechange = function() {
            if (xhr.readyState === 4 && xhr.status === 200) {
                let optionEscolha = document.createElement("option");
                optionEscolha.text = "Escolha...";
                optionEscolha.value = "";
                estadoSelect.appendChild(optionEscolha);
                // Processar a resposta e preencher a lista de cidades
                let estados = JSON.parse(xhr.responseText);
                for (let i = 0; i < estados.length; i++) {
                    let option = document.createElement("option");
                    option.text = estados[i].nome;
                    option.value = estados[i].valor;
                    estadoSelect.appendChild(option);
                }
            }
        };
        xhr.send();
    });
</script>
</body>
</html>
