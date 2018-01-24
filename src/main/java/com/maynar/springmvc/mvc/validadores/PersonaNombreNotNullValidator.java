package com.maynar.springmvc.mvc.validadores;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.maynar.springmvc.mvc.dto.Persona;

public class PersonaNombreNotNullValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return Persona.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		/**
		 * Invocamos la lógica necesaria para validar		
		 */
		if(((Persona)arg0).getNombre()==null || ((Persona)arg0).getNombre().equals("")) {
			arg1.rejectValue("nombre","formulario.persona.error.nombre","Error personalizado");
		}
		
	}

}
