package com.maynar.springmvc.mvc.services;

import com.maynar.springmvc.entities.Simpson;

public interface SimpsonsService {

	public Simpson find(Simpson s);

	public boolean delete(Simpson s);

	public Simpson update(Simpson s);

	public Simpson create(Simpson s);

}
