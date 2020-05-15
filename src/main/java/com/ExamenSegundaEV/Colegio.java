package com.ExamenSegundaEV;

 
 
 public class Colegio {

	 private String Nombre;
	 private String Direccion;
	 private String Contraseña;
	 private String Email;
	 private String PersonaDeContacto;

	 	 
	 public Colegio(String nombre, String direccion, String contraseña, String email, String personaDeContacto) {
		super();
		Nombre = nombre;
		Direccion = direccion;
		Contraseña = contraseña;
		Email = email;
		PersonaDeContacto = personaDeContacto;
	
	 
	 }
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getContraseña() {
		return Contraseña;
	}
	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPersonaDeContacto() {
		return PersonaDeContacto;
	}
	public void setPersonaDeContacto(String personaDeContacto) {
		PersonaDeContacto = personaDeContacto;
	}
	
	 
}
