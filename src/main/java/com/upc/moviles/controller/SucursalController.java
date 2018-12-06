package com.upc.moviles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.upc.moviles.model.Sucursal;
import com.upc.moviles.repository.SucursalRepository;

@RestController
public class SucursalController {
	
	@Autowired
	SucursalRepository repository;
	
	
	@GetMapping("/sucursal/{codCliente}")
	public List<Sucursal> getSucursales(@PathVariable("codCliente") Long codCliente){
		
		System.out.println("codCLiente "+codCliente);
		
		return repository.findByCodCliente(codCliente);
		
		
	}
	

}
