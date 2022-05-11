package com.tienda.tienda.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.tienda.entity.DetallePedido;



public interface DetallePedidoRepo extends JpaRepository<DetallePedido, Long> {
}