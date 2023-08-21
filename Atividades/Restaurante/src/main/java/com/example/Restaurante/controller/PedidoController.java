package com.example.Restaurante.controller;

import com.example.Restaurante.dto.PedidoRequestDTO;
import com.example.Restaurante.dto.PedidoResponseDTO;
import com.example.Restaurante.model.Pedido;
import com.example.Restaurante.model.Prato;
import com.example.Restaurante.repository.CardapioRepository;
import com.example.Restaurante.repository.ClienteRepository;
import com.example.Restaurante.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("pedido")
public class PedidoController {
    @Autowired
    private PedidoRepository repository;

    @Autowired
    private ClienteRepository repositoryCliente;

    @Autowired
    private CardapioRepository repositoryPratos;

    @GetMapping
    public List<PedidoResponseDTO> getAll() {
        return repository.findAll().stream().map(PedidoResponseDTO::new).toList();
    }

    @PostMapping
    public void savePedido(@RequestBody PedidoRequestDTO data) {
        List<Prato> p = new ArrayList<>();
        for (Long id: data.pratos()) {
            p.add(repositoryPratos.findById(id).get());
        }
        repository.save(new Pedido(data.title(), repositoryCliente.findById(data.cliente()).get(), p));
    }

}
