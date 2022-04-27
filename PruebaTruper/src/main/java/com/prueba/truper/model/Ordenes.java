package com.prueba.truper.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Ordenes implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6239902822223894720L;

	@Id
	@Column(name="orden_id")
	private int ordenid;
	
	@ManyToOne
	@JoinColumn(name="sucursal_id")
	private Sucursales sucursal_id;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="total")
	private Double total;
	
	
}
