package com.upc.moviles.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.upc.moviles.model.InspeccionTecnica;
import com.upc.moviles.model.ProgramarVisita;
import com.upc.moviles.repository.InspeccionTecnicaRepository;
import com.upc.moviles.repository.ProgramarVisitaRepository;

@RestController
public class InspeccionTecnicaController {
	
	@Autowired
	InspeccionTecnicaRepository repository;
	
	@Autowired
	ProgramarVisitaRepository pvRepository;
	
	@PostMapping("/inspeccion-tecnica/{codVisita}")
	public InspeccionTecnica save(@RequestBody InspeccionTecnica inspeccionTecnica, @PathVariable("codVisita")Long codVisita){
			
	 ProgramarVisita programarVisita = pvRepository.findById(codVisita).get();
	 programarVisita.setEstadoRegistro("terminada");
	 pvRepository.save(programarVisita);
		
	  return repository.save(inspeccionTecnica);
	  
	}
	
	
	@GetMapping("/inspeccion-tecnica")
	public List<InspeccionTecnica> findAll(){
			
	  return repository.findAll();
	  
	}
	
	@GetMapping("/inspeccion-tecnica/{id}")
	public InspeccionTecnica findOne(@PathVariable("id") Long id){	
	
		
	  return repository.findById(id).get();
	  
	}
	
}
