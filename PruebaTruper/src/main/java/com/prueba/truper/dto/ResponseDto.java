package com.prueba.truper.dto;

import lombok.Data;

@Data
public class ResponseDto {
	private Object response;
	
	private String code;
	
	private String message;
}
