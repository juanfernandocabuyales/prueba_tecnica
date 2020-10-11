package com.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.prueba.dto.request.ConsultarPersonaIdRequest;
import com.prueba.dto.request.CrearActualizarPersonaRequest;
import com.prueba.dto.request.GeneralRequest;
import com.prueba.dto.response.ConsultarPersonaIdResponse;
import com.prueba.dto.response.CrearActualizarPersonaResponse;
import com.prueba.dto.response.GeneralResponse;
import com.prueba.interfaces.IPersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController extends BaseController {

	@Autowired
	private IPersonaService personaService;

	@PostMapping(value = "/consultarPersonaId", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> consultarPersonaId(@RequestBody GeneralRequest request){

		Gson gson = new Gson();

		ConsultarPersonaIdRequest consultarPersonaIdRequest = gson.fromJson(request.getPeticion(), ConsultarPersonaIdRequest.class);

		ConsultarPersonaIdResponse consultarPersonaIdResponse = personaService.consultarPersonaId(consultarPersonaIdRequest);

		GeneralResponse resp = new GeneralResponse();
		resp.setMensaje(gson.toJson(consultarPersonaIdResponse));

		return new ResponseEntity<GeneralResponse>(resp, HttpStatus.OK);
	}

	@PutMapping(value="/actualizarPersona",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> actualizarPersona(@RequestBody GeneralRequest request){

		Gson gson = new Gson();

		CrearActualizarPersonaRequest crearActualizarPersonaRequest = gson.fromJson(request.getPeticion(), CrearActualizarPersonaRequest.class);

		CrearActualizarPersonaResponse crearActualizarPersonaResponse = personaService.actualizarPersona(crearActualizarPersonaRequest);

		GeneralResponse resp = new GeneralResponse();
		resp.setMensaje(gson.toJson(crearActualizarPersonaResponse));

		return new ResponseEntity<GeneralResponse>(resp, HttpStatus.OK);
	}
}
