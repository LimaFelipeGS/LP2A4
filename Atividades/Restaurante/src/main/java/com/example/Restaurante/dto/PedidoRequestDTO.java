package com.example.Restaurante.dto;

import com.example.Restaurante.model.Cliente;
import com.example.Restaurante.model.Prato;

import java.util.List;

public record PedidoRequestDTO(String title, Cliente cliente, List<Prato> pratos) {
}
