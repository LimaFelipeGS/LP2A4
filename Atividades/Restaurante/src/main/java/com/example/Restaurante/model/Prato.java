package com.example.Restaurante.model;

import com.example.Restaurante.dto.CardapioRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prato {
    private static Long idBase = 0L;
    private Long id;
    private String nome;
    private String descricao;
    private double preco;

    public Prato(CardapioRequestDTO data) {
        this.nome = data.nome();
        this.descricao = data.descricao();
        this.preco = data.preco();
        this.id = idBase++;
    }
}
