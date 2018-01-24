package com.maynar.springmvc.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.View;

import com.maynar.springmvc.mvc.services.Servicio;

@Controller
@RequestMapping(path = "/saludo2")
public class OtroControlador {
	//Beans de logica y servicio
	@Autowired
	@Qualifier("otraVista")
	private View otraVista;
	
	@Autowired
	private Servicio servicio;
	
	@RequestMapping(path = "/bienvenida2", method = RequestMethod.GET)
	public String bienvenida(Map<String,Object> model) {
		return "vistaBienvenida";
	}
	
	@RequestMapping(path = "/despedida2", method = RequestMethod.GET)
	public View despedida(Model model, @RequestParam int id) {
		model.addAttribute("saludo", "hola a todos");
		return otraVista;
	}

}
