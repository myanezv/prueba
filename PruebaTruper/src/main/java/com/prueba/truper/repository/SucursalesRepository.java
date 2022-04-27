package com.prueba.truper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.truper.model.Sucursales;

@Repository
public interface SucursalesRepository extends JpaRepository<Sucursales, Integer>{

}
