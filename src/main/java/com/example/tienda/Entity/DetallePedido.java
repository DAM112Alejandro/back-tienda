package com.example.tienda.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    @Getter
    @Setter
    private Pedido pedido;

    @Id
    @NotNull
    @ManyToMany
    @JoinColumn(name = "id_producto")
    @Getter
    @Setter
    private Producto producto;

    @NotNull
    @Getter
    @Setter
    private int cantidad;

    @NotNull
    @Getter
    @Setter
    private double precio_unidad;

    @NotNull
    @Getter
    @Setter
    private double precio_total;

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio_unidad() {
		return precio_unidad;
	}

	public void setPrecio_unidad(double precio_unidad) {
		this.precio_unidad = precio_unidad;
	}

	public double getPrecio_total() {
		return precio_total;
	}

	public void setPrecio_total(double precio_total) {
		this.precio_total = precio_total;
	}
    
}