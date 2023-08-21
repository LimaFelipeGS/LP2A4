package com.example.Restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Restaurante.model.Prato;
import org.springframework.stereotype.Repository;

@Repository
public interface CardapioRepository extends JpaRepository<Prato, Long>{
}
