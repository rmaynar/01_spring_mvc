package com.maynar.springmvc.mvc.services.impl;

import org.springframework.stereotype.Service;

import com.maynar.springmvc.entities.Simpson;
import com.maynar.springmvc.mvc.services.SimpsonsService;
@Service
public class SimpsonServiceImpl implements SimpsonsService {

	@Override
	public Simpson delete(Simpson s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Simpson update(Simpson s) {
		// TODO Auto-generated method stub
		return null;

	}

	@Override
	public Simpson create(Simpson s) {
		System.out.println("Insertando simpson");
		if(s.getNombre().equals("Liza")) {
			return null;
		}
		return s;

	}

	@Override
	public Simpson find(Simpson s) {
		// TODO Auto-generated method stub
		s.setEdad(15);
		Simpson padre = new Simpson("Homer", 42, null);
		s.setPadre(padre);
		return s;
	}

}
