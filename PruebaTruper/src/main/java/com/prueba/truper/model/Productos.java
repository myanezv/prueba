package com.prueba.truper.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Productos implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -806402230507853644L;

	@Id
	@Column(name="producto_id")
	private int producto_id;
	
	@ManyToOne
	@JoinColumn(name="orden_id")
	private Ordenes ordenid;
	
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="precio")
	private Double precio;
	
	
}
