package com.maynar.springmvc.mvc.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maynar.springmvc.mvc.dto.Persona;

@Controller
public class FormController {

	@ModelAttribute
	public Persona perona() {
		return new Persona();
	}
	
	@RequestMapping(path="/formulario", method = RequestMethod.GET)
	public String iniciarFormulario(Map<String,Object> model) {
		/** Esto lo realiza el ConfiguracionControladores
		//servicio.obtenerGeneros();
		model.put("genero", new String[] {"Masculino","Femenino"});
		**/
		return "formulario";
	}
	
	@RequestMapping(path="/formulario", method = RequestMethod.POST)
	public String procesarFormulario(@Valid @ModelAttribute Persona persona, Errors errors) {
		if (errors.hasErrors()) {
			System.out.println("Error en el formulario");
			//return "error";
		}
		
		return "formulario";
	}
	
}
