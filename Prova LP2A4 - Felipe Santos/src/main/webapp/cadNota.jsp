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
    <h2>Cadastro de Notas</h2>
  </div>

  <div class="row">
    <div class="col-md-12 order-md-1">
      <form class="needs-validation" novalidate>
        <div class="mb-3">
          <label for="materia" >Matéria</label>
          <input class="form-control" list="datalistMateria" id="materia" placeholder="Digite para pesquisar..." required>
          <datalist id="datalistMateria">
            <option value="Materia 1">
          </datalist>
          <div class="invalid-feedback">
            É obrigatório selecionar uma matéria.
          </div>
        </div>

        <div class="row">
          <div class="col-sm-10 mb-3">
            <label for="aluno" >Aluno</label>
            <input class="form-control" list="datalistAluno" id="aluno" placeholder="Digite para pesquisar..." required>
            <datalist id="datalistAluno">
              <option value="Aluno 1">
            </datalist>
            <div class="invalid-feedback">
              É obrigatório selecionar um aluno.
            </div>
          </div>

          <div class="col-sm-2 mb-3">
            <label for="nota">Nota</label>
            <input type="number" class="form-control" id="nota" placeholder="" value="" required>
            <div class="invalid-feedback">
              É obrigatório inserir uma nota válida.
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
