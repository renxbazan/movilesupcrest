package com.upc.moviles.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upc.moviles.model.Sucursal;

public interface SucursalRepository extends JpaRepository<Sucursal, Long> {
	
	List<Sucursal> findByCodCliente(Long codCliente);

}
