package com.example.Restaurante.controller;

import com.example.Restaurante.dto.CardapioRequestDTO;
import com.example.Restaurante.dto.CardapioResponseDTO;
import com.example.Restaurante.model.Prato;
import com.example.Restaurante.repository.CardapioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("cardapio")
public class CardapioController {
    @Autowired
    CardapioRepository cardapioRepository;

    @GetMapping
    public List<CardapioResponseDTO> getAll() {
        return cardapioRepository.findAll().stream().map(CardapioResponseDTO::new).toList();
    }

    @PostMapping
    public void addPrato(@RequestBody CardapioRequestDTO data){
        cardapioRepository.save(new Prato(data));
    }

    @PutMapping("/{id}")
    public void editarPrato(@PathVariable Long id, @RequestBody CardapioRequestDTO data){
        Prato prato = new Prato(data);
        prato.setId(id);
        cardapioRepository.save(prato);
    }

    @DeleteMapping("/{id}")
    public void deletePrato(@PathVariable Long id){
        cardapioRepository.deleteById(id);
    }
}
