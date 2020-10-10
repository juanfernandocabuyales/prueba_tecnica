package com.prueba.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.prueba.dto.response.BaseResponse;

import org.springframework.http.HttpStatus;

@ControllerAdvice
public class BaseController {

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public BaseResponse processRuntimeException(Exception ex) throws Exception {
		ex.printStackTrace();
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setCodigoRespuesta("1");
		baseResponse.setMensajeRespuesta("Se ha presentado un inconveniente al");
		return baseResponse;
	}
}
