package com.prueba.truper.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.truper.dto.ResponseDto;
import com.prueba.truper.model.Ordenes;
import com.prueba.truper.repository.OrdenesRepository;

@Service
public class OrdenesService {
	
	@Autowired
	OrdenesRepository ordenesRepository;
	
	public ResponseDto findOrdenById(int ordenid) {
		ResponseDto response = new ResponseDto();
		
		Optional<Ordenes> orden = ordenesRepository.findById(ordenid);
		
		if (orden.isPresent()) {
			response.setResponse(orden);
			response.setCode("SUCCESS");
			response.setMessage("SUCCESS");
		}
		else {
			response.setCode("SUCCESS");
			response.setMessage("ERROR");
		}
		
		return response;
	}

	public ResponseDto saveOrden(Ordenes orden) {
		ResponseDto response = new ResponseDto();
		
		Ordenes newOrden = ordenesRepository.save(orden);
		
		if (newOrden != null) {
			response.setResponse(newOrden);
			response.setCode("SUCCESS");
			response.setMessage("SUCCESS");
		}
		else {
			response.setCode("SUCCESS");
			response.setMessage("ERROR");
		}
		
		return response;
	}
	
	public ResponseDto updateOrden(int ordenid, Ordenes orden) {
		ResponseDto response = new ResponseDto();
		
		orden.setOrdenid(ordenid);
		
		Ordenes newOrden = ordenesRepository.save(orden);
		
		if (newOrden != null) {
			response.setResponse(newOrden);
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
