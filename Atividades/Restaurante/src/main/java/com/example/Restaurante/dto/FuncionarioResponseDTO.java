package com.example.Restaurante.dto;

import com.example.Restaurante.model.Funcionario;

public record FuncionarioResponseDTO(Long id, String nome, String cargo) {
    public FuncionarioResponseDTO(Funcionario funcionario) {
        this(funcionario.getId(), funcionario.getNome(), funcionario.getCargo());
    }
}
