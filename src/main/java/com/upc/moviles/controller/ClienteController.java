package com.upc.moviles.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upc.moviles.model.Cliente;

@RestController
public class ClienteController {

	
	@GetMapping("/cliente")
	public List<Cliente> getClientes(){
		List<Cliente> clientes = new ArrayList<>();
		
		Cliente cliente = new Cliente();
		cliente.setId(1L);
		cliente.setRazonSocialApeNombres("Juliet");
		
		clientes.add(cliente);
		
		return clientes;
		
		
	}
	
}
