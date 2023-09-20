package com.example.Restaurante.controller;

import com.example.Restaurante.dto.FuncionarioRequestDTO;
import com.example.Restaurante.dto.FuncionarioResponseDTO;
import com.example.Restaurante.model.Funcionario;
import com.example.Restaurante.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("funcionario")
public class FuncionarioController {
    @Autowired
    FuncionarioRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FuncionarioResponseDTO> getAll() {
        return repository.findAll().stream().map(FuncionarioResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFuncionario(@RequestBody FuncionarioRequestDTO data) {
        repository.save(new Funcionario(data));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/{id}")
    public void editarFuncinario(@PathVariable Long id, @RequestBody FuncionarioRequestDTO data) {
        Funcionario funcionario = new Funcionario(data);
        funcionario.setId(id);
        repository.save(funcionario);
    }

    @DeleteMapping("/{id}")
    public void deleteFuncionario(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
