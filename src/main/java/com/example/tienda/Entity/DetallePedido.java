package com.example.tienda.Entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetallePedido implements Serializable {
    @Id
    @NotNull
    @OneToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    @Id
    @NotNull
    @ManyToMany
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @NotNull
    private int cantidad;

    @NotNull
    private double precio_unidad;

    @NotNull
    private double precio_total;
}