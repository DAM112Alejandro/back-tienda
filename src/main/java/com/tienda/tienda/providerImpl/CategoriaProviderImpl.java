package com.tienda.tienda.providerImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.tienda.repository.CategoriaRepo;
import com.tienda.tienda.entity.Categoria;
import com.tienda.tienda.provider.CategoriaProvider;



@Service
@Transactional
public class CategoriaProviderImpl implements CategoriaProvider {

	@Autowired
	private CategoriaRepo categoriaRepo;
	String error = "No se encontro la categoria";

	@Override
	public Categoria addCategoria(Categoria categoria) {
		return categoriaRepo.save(categoria);
	}

	@Override
	public List<Categoria> findAllCategoria() {
		return categoriaRepo.findAll();
	}

	@Override
	public Categoria findCategoriaById(Long id) {
		return categoriaRepo.findCategoriaById(id).orElseThrow(() -> new IllegalArgumentException(error));
	}

	@Override
	public void deleteCategoria(Long id) {
		categoriaRepo.deleteCategoriaById(id);

	}

	@Override
	public Categoria updateCategoria(Categoria categoria) {
		if (categoriaRepo.findCategoriaById(categoria.getId()).isPresent() == true) {
			return categoriaRepo.save(categoria);
		} else {
			throw new IllegalArgumentException("La categoria no existe");
		}
	}
}
