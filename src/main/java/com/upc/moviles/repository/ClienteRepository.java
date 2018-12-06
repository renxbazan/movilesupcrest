package com.upc.moviles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upc.moviles.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
