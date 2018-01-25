package com.maynar.springmvc.mvc.services;

import org.springframework.stereotype.Service;

import com.maynar.springmvc.entities.Simpson;

public interface SimpsonsService {

	public Simpson find(Simpson s);

	public Simpson delete(Simpson s);

	public Simpson update(Simpson s);

	public Simpson create(Simpson s);

}
