package com.maynar.springmvc.mvc.controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.maynar.springmvc.mvc.validadores.PersonaNombreNotNullValidator;

/**
 * Permite que todos los controladores gestionados por
 * RequestMappingHandlerMapping tengan esta config comun dentro del paquete
 * indicado
 * 
 * @author rmaynar
 *
 */
@ControllerAdvice("com.maynar.springmvc.mvc.controller")
//@SessionAttributes("generos")
public class ConfirguracionControladores {
	// Asociado a todas las requests
	@ModelAttribute("generos")
	public String[] generos() {
		return new String[] { "Masculino", "Femenino" };
	}
	
	/**
	 * comentado para los simpsons
	 */
//	@InitBinder
//	public void initBinder(final WebDataBinder binder) {
//		binder.addValidators(new PersonaNombreNotNullValidator());
//	}
}
