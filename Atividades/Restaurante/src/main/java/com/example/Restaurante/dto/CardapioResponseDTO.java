package com.example.Restaurante.dto;

import com.example.Restaurante.model.Prato;

public record CardapioResponseDTO(Long id, String titulo, String descricao, double preco) {
    public CardapioResponseDTO(Prato p) {
        this(p.getId(), p.getTitulo(), p.getDescricao(), p.getPreco());
    }
}
