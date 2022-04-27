package com.prueba.truper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.truper.dto.ResponseDto;
import com.prueba.truper.model.Productos;
import com.prueba.truper.repository.ProductosRepository;

@Service
public class ProductosService {
	
	@Autowired
	ProductosRepository productosRepository;
	
	public ResponseDto updateProducto(String codigo, Productos producto) {
		ResponseDto response = new ResponseDto();
		
		Productos p = productosRepository.findByCodigo(codigo);
		p.setPrecio(producto.getPrecio());
		Productos productoUpdated = productosRepository.save(p);
		
		if (productoUpdated != null) {
			response.setResponse(productoUpdated);
			response.setCode("SUCCESS");
			response.setMessage("SUCCESS");
		}
		else {
			response.setCode("SUCCESS");
			response.setMessage("ERROR");
		}
		
		return response;
	}
}
