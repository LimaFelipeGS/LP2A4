package com.example.Restaurante.controller;

import com.example.Restaurante.dto.ClienteResponseDTO;
import com.example.Restaurante.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<ClienteResponseDTO> getAll() {
        return repository.findAll().stream().map(ClienteResponseDTO::new).toList();
    }
}
