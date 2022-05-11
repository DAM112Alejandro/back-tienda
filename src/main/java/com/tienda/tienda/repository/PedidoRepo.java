package com.tienda.tienda.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.tienda.entity.Pedido;

public interface PedidoRepo extends JpaRepository<Pedido, Long> {
}