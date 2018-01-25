package com.maynar.springmvc.entities;

public class Simpson {

	private String nombre;
	private int edad;
	private Simpson padre;
	public Simpson() {
		super();
	}
	public Simpson(String nombre, int edad, Simpson padre) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.padre = padre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Simpson getPadre() {
		return padre;
	}
	public void setPadre(Simpson padre) {
		this.padre = padre;
	}
	
	
	
}
