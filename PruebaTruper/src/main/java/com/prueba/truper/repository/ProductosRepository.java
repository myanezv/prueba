package com.prueba.truper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prueba.truper.model.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer> {

	@Query("from Productos p where p.codigo = ?1")
	Productos findByCodigo(String codigo);
	
	@Query("update Productos p set p.precio = ?1 where p.codigo = ?2")
	Productos updateByCodigo(Double precio, String codigo);
}
