package com.example.Restaurante.dto;

import com.example.Restaurante.model.Cliente;
import com.example.Restaurante.model.Endereco;

public record ClienteResponseDTO(Long id, String nome, Endereco endereco) {
    ClienteResponseDTO(Cliente cliente) {
        this(cliente.getId(), cliente.getNome(), cliente.getEndereco());
    }
}
