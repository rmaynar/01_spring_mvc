package com.maynar.springmvc.mvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

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
}
