package com.example.Restaurante.dto;

import com.example.Restaurante.model.Endereco;

public record ClienteRequestDTO(String nome, Endereco endereco) {
}
