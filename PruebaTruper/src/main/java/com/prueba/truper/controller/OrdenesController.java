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
import com.prueba.truper.model.Ordenes;
import com.prueba.truper.service.OrdenesService;

@Controller
@RequestMapping(value="/ordenes")
public class OrdenesController {
	@Autowired
	OrdenesService ordenesService;
	
	@RequestMapping(value="/findById", method=RequestMethod.GET)
	public ResponseEntity<ResponseDto> saveOrden (@RequestParam(value="ordenid") int ordenid){
		ResponseDto response = ordenesService.findOrdenById(ordenid);
		
		return new ResponseEntity<ResponseDto>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ResponseEntity<ResponseDto> saveOrden (@RequestBody Ordenes orden){
		ResponseDto response = ordenesService.saveOrden(orden);
		
		return new ResponseEntity<ResponseDto>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public ResponseEntity<ResponseDto> updateOrden (@RequestParam(value="ordenid") int ordenid, @RequestBody Ordenes orden){
		ResponseDto response = ordenesService.updateOrden(ordenid, orden);
		
		return new ResponseEntity<ResponseDto>(response, HttpStatus.OK);
	}
}
