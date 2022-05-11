package com.example.tienda.provider;

import java.util.List;

import com.example.tienda.entity.Categoria;

public interface CategoriaProvider {

	Categoria addCategoria(Categoria categoria);

	List<Categoria> findAllCategoria();

	Categoria findCategoriaById(Long id);

	void deleteCategoria(Long id);

	Categoria updateCategoria(Categoria categoria);
}
