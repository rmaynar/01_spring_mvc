package com.maynar.springmvc.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maynar.springmvc.entities.Simpson;
import com.maynar.springmvc.mvc.services.SimpsonsService;

@Controller
@ComponentScan(basePackages="com.maynar.springmvc.mvc.services")
public class ControladorSimpsons {
	//Beans de logica y servicio
	
	@Autowired
	private SimpsonsService servicioSimpsons;
	
	/**
	 * Recibe una persona en json, le cambia el nombre y devuelve en json
	 * @param persona
	 * @param nombreNuevo
	 * @return
	 */
	@RequestMapping(path = "/simpsons/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	@ResponseBody public Simpson obtenerSimpson(@PathVariable String id) {
		Simpson simpson = new Simpson();
		simpson.setNombre(id);
		simpson = servicioSimpsons.find(simpson);
		return simpson;
	}
	
	/**
	 * Recibe una persona en json, le cambia el nombre y devuelve en json
	 * @param persona
	 * @param nombreNuevo
	 * @return
	 */
	@RequestMapping(path = "/simpsons", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	@ResponseBody 
	public ResponseEntity<Simpson> insertarSimpson(@RequestBody Simpson simpson) {
		
		HttpStatus estado = HttpStatus.CREATED;
		simpson = servicioSimpsons.create(simpson);
		if(simpson==null) {
			estado = HttpStatus.FORBIDDEN;
		}
		ResponseEntity<Simpson> respuesta = new ResponseEntity<Simpson>(simpson, estado);
		
		return respuesta;
	}
	/**
	 * Recibe una persona en json, le cambia el nombre y devuelve en json
	 * @param persona
	 * @param nombreNuevo
	 * @return
	 */
	@RequestMapping(path = "/simpsons/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.DELETE)
	@ResponseBody 
	public ResponseEntity<String> eliminarSimpson(@PathVariable String id){
		
		HttpStatus estado = HttpStatus.OK;
		Simpson simpson = new Simpson();
		simpson.setNombre(id);
		ResponseEntity<String> respuesta = null;
		if(!servicioSimpsons.delete(simpson)) {
			estado = HttpStatus.FORBIDDEN;
			respuesta = new ResponseEntity<String>("{Mensaje:\"Eliminado con éxito\"}", estado);
		}else {
			respuesta = new ResponseEntity<String>("{Mensaje:\"Eliminado con éxito\"}", estado);
		}
		return respuesta;
	}
	
}
