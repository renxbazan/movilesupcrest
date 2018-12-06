package com.upc.moviles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upc.moviles.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
