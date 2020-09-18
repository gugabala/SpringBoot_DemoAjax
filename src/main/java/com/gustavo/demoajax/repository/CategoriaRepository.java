package com.gustavo.demoajax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.demoajax.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
