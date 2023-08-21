package com.example.Restaurante.controller;

import com.example.Restaurante.dto.CardapioIndexDTO;
import com.example.Restaurante.dto.CardapioRequestDTO;
import com.example.Restaurante.dto.CardapioResponseDTO;
import com.example.Restaurante.model.Prato;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("cardapio")
public class CardapioController {
    private List<Prato> pratos = new ArrayList<>();

    @GetMapping
    public List<CardapioResponseDTO> getAll() {
        return pratos.stream().map(CardapioResponseDTO::new).toList();
    }

    @PostMapping
    public List<CardapioResponseDTO> addPrato(@RequestBody CardapioRequestDTO data) {
        pratos.add(new Prato(data));
        return pratos.stream().map(CardapioResponseDTO::new).toList();
    }

    @DeleteMapping("/{id}")
    public void deletePrato(@PathVariable Long id){
        cardapioRepository.deleteById(id);
    }

    @PutMapping
    public List<CardapioResponseDTO> editPrato(@RequestBody CardapioResponseDTO data) {
        
        return pratos.stream().map(CardapioResponseDTO::new).toList();
    }
}
