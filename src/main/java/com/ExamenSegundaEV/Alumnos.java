package com.ExamenSegundaEV;

public class Alumnos {

	
	private String Nombre;
	private String Apellido;
	private String Email;
	private String FechaNacimiento;
	
	
	public Alumnos(String nombre, String apellido, String email, String fechaNacimiento) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Email = email;
		FechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	
	
}
