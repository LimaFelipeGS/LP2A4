package com.example.Restaurante.dto;

import com.example.Restaurante.model.Cliente;
import com.example.Restaurante.model.Pedido;

public record PedidoResponseDTO(Long id, String title, ClienteResponseDTO cliente) {
    public PedidoResponseDTO(Pedido pedido){
        this(pedido.getId(), pedido.getTitle(), new ClienteResponseDTO(pedido.getCliente()));
    }
}
