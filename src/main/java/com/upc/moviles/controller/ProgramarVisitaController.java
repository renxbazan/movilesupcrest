package com.upc.moviles.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.upc.moviles.model.ProgramarVisita;
import com.upc.moviles.repository.ProgramarVisitaRepository;

@RestController
public class ProgramarVisitaController {

	@Autowired
	private ProgramarVisitaRepository repository;
	
	@PostMapping("/programar-visita")
	public ProgramarVisita save(@RequestBody ProgramarVisita programarVisita){
			
		 programarVisita.setEstadoRegistro("pendiente");
	  return repository.save(programarVisita);
	   
	}
	
	
	@GetMapping("/programar-visita")
	public List<ProgramarVisita> findAll(){
		
	  return repository.findAll();
	  
	}
	
	@GetMapping("/programar-visita/{id}")
	public ProgramarVisita findOne(@PathVariable("id") Long id){	
		
	  return repository.findById(id).get();
	  
	}
	
	private ProgramarVisita createObject (Long id) {
		ProgramarVisita obj = new ProgramarVisita();
		obj.setCodEmpleado(1);
		obj.setCodSucursal(1);
		obj.setCodUsuarioCreador(1);
		obj.setComentario("test test");
		obj.setEstadoRegistro("pendiente");
		obj.setFecVisita(new Date().toString());
		obj.setHoraVisita(15);
		obj.setId(id);
		return obj;
		
		
	}
}
