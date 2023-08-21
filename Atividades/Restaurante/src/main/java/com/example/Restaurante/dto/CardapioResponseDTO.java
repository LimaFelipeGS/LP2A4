package com.example.Restaurante.dto;

import com.example.Restaurante.model.Prato;

public record CardapioResponseDTO(Long id, String nome, String descricao, double preco) {
    public CardapioResponseDTO(Prato p) {
        this(p.getId(), p.getNome(), p.getDescricao(), p.getPreco());
    }
}
