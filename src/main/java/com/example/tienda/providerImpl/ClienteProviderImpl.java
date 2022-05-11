package com.example.tienda.providerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.tienda.entity.Cliente;
import com.example.tienda.provider.ClienteProvider;
import com.example.tienda.repository.ClienteRepo;

;

public class ClienteProviderImpl implements ClienteProvider {

	@Autowired
	private ClienteRepo clienteRepo;
	String error = "No se pudo encontrar el clinete";

	@Override
	public Cliente addCliente(Cliente cliente) {
		return clienteRepo.save(cliente);
	}

	@Override
	public List<Cliente> findAllCliente() {
		return clienteRepo.findAll();
	}

	@Override
	public Cliente findClienteById(Long id) {
		return clienteRepo.findClienteById(id).orElseThrow(() -> new IllegalArgumentException(error));
	}

	@Override
	public void deleteCliente(Long id) {
		clienteRepo.deleteClienteById(id);

	}

	@Override
	public Cliente updateCategoria(Cliente cliente) {

		if (clienteRepo.findClienteById(cliente.getId()).isPresent() == true) {
			return clienteRepo.save(cliente);
		} else {
			throw new IllegalArgumentException("El cliente no existe");
		}
	}
}
