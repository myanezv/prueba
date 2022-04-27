package com.prueba.truper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.truper.dto.ResponseDto;
import com.prueba.truper.model.Productos;
import com.prueba.truper.service.ProductosService;

@Controller
@RequestMapping(value="/productos")
public class ProductosController {
	@Autowired
	ProductosService productosService;
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public ResponseEntity<ResponseDto> updateOrden (@RequestParam(value="codigo") String codigo, @RequestBody Productos producto){
		ResponseDto response = productosService.updateProducto(codigo, producto);
		
		return new ResponseEntity<ResponseDto>(response, HttpStatus.OK);
	}
}
