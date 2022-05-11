package com.tienda.tienda.provider;

import java.util.List;

import com.tienda.tienda.entity.Categoria;



public interface CategoriaProvider {

	Categoria addCategoria(Categoria categoria);

	List<Categoria> findAllCategoria();

	Categoria findCategoriaById(Long id);

	void deleteCategoria(Long id);

	Categoria updateCategoria(Categoria categoria);
}
