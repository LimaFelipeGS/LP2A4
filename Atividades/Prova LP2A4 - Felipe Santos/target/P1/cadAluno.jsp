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
        <h2>Cadastro de Alunos</h2>
    </div>

    <div class="row">
        <div class="col-md-12 order-md-1">
            <form class="needs-validation" novalidate>
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
                            É obrigatório inserir um cpf válido.
                        </div>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="dataNascimento">Data de Nascimento</label>
                        <input type="date" class="form-control" id="dataNascimento" name="dataNascimento" placeholder="" value="" required>
                        <div class="invalid-feedback">
                            É obrigatório inserir uma data de nascimento válida.
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
                                <input id="outro" name="genero" type="radio" class="custom-control-input" checked required>
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

                <h4 class="mb-3">Dados Funcionais</h4>

                <div class="mb-3">
                    <label for="anoIngresso">Ano de Ingresso</label>
                    <select class="custom-select d-block w-100" id="anoIngresso" name="anoIngresso" required>
                        <option value="">Escolha...</option>
                        <option>2023</option>
                    </select>
                    <div class="invalid-feedback">
                        Por favor, um ano válido.
                    </div>
                </div>

                <div class="mb-3">
                    <label for="primeiro">Semestre de Ingresso</label>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="custom-control custom-radio">
                                <input id="primeiro" name="semestreIngresso" type="radio" class="custom-control-input" checked required>
                                <label class="custom-control-label" for="primeiro">1°</label>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="custom-control custom-radio">
                                <input id="segundo" name="semestreIngresso" type="radio" class="custom-control-input" required>
                                <label class="custom-control-label" for="segundo">2°</label>
                            </div>
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

                <div class="mb-3">
                    <label for="matriculado">Situação</label>
                    <div class="row">
                        <div class="col-md-3">
                            <div class="custom-control custom-radio">
                                <input id="matriculado" name="situacao" type="radio" class="custom-control-input" checked required>
                                <label class="custom-control-label" for="matriculado">Matriculado</label>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="custom-control custom-radio">
                                <input id="trancado" name="situacao" type="radio" class="custom-control-input" required>
                                <label class="custom-control-label" for="trancado">Trancado</label>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="custom-control custom-radio">
                                <input id="evadido" name="situacao" type="radio" class="custom-control-input" required>
                                <label class="custom-control-label" for="evadido">Evadido</label>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="custom-control custom-radio">
                                <input id="formado" name="situacao" type="radio" class="custom-control-input" required>
                                <label class="custom-control-label" for="formado">Formado</label>
                            </div>
                        </div>
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
