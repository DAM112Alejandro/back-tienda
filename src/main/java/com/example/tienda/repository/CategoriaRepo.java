package com.example.tienda.repository;





import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tienda.entity.Categoria;

public interface CategoriaRepo extends JpaRepository<Categoria, Long> {

	Optional<Categoria> findCategoriaById(Long id);

	void deleteCategoriaById(Long id);
}