package com.upc.moviles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upc.moviles.model.Cliente;
import com.upc.moviles.repository.ClienteRepository;

@RestController
public class ClienteController {
	@Autowired
	ClienteRepository repository;

	
	@GetMapping("/cliente")
	public List<Cliente> getClientes(){
		
		return repository.findAll();
		
		
	}
	
}
