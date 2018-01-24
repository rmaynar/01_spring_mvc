package com.maynar.springmvc.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;

import com.maynar.springmvc.mvc.dto.Persona;
import com.maynar.springmvc.mvc.services.Servicio;

@Controller
@RequestMapping(path = "/saludo")
public class Controlador {
	//Beans de logica y servicio
	@Autowired
	@Qualifier("miVista")
	private View vista;
	
	@Autowired
	private Servicio servicio;
	/**
	 * El ViewResolver resuelve el nombre a la vista
	 * Busca un mensaje de bienvenida por su id (tenemos varios msj de bienvenida) y lo completa
	 * con la información del objeto Persona que recibe por parámetro
	 **/
	@RequestMapping(path = "/bienvenida/{id}", method = RequestMethod.GET)
	public String bienvenida(Map<String,Object> model, Persona persona, @PathVariable int id) {
		return "index";
	}
	
	/**
	 * Metodo que busca un mensaje de despedida para retornarlo
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping(path = "/despedida", method = RequestMethod.GET)
	public View despedida(Model model, @RequestParam int id) {
		model.addAttribute("saludo", "hola a todos");
		return vista;
	}
	
	/**
	 * Recibe una persona en json, le cambia el nombre y devuelve en xml
	 * @param persona
	 * @param nombreNuevo
	 * @return
	 */
	@RequestMapping(path = "/cambioDeNombre", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_XML_VALUE, method = RequestMethod.POST)
	@ResponseBody public Persona cambiarElNombrePersona(@RequestBody Persona persona, @RequestParam String nombreNuevo) {
		persona.setNombre(nombreNuevo);
		return persona;
	}
	
}
