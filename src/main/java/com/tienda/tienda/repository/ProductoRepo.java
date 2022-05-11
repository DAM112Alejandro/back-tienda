package com.tienda.tienda.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.tienda.entity.Producto;

import java.util.Optional;

public interface ProductoRepo extends JpaRepository<Producto, String> {
    Optional<Producto> findProductoById(Long id);

    void deleteProductoById(Long id);
}