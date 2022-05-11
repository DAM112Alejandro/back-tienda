package com.tienda.tienda.provider;

import java.util.List;

import com.tienda.tienda.entity.Cliente;



public interface ClienteProvider {
	Cliente addCliente(Cliente cliente);

	List<Cliente> findAllCliente();

	Cliente findClienteById(Long id);

	void deleteCliente(Long id);

	Cliente updateCategoria(Cliente cliente);
}
