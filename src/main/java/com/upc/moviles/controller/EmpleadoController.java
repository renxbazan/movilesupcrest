package com.upc.moviles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upc.moviles.model.Empleado;
import com.upc.moviles.repository.EmpleadoRepository;

@RestController
public class EmpleadoController {
	
	@Autowired
	EmpleadoRepository repository;
	
	
	@GetMapping("/empleado")
	public List<Empleado> getClientes(){
		
		return repository.findAll();
		
		
	}

}
