package com.prueba.truper.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Sucursales implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1425635390086393154L;

	@Id
	private int sucursal_id;
	
	@Column(name="nombre")
	private String nombre;

}
