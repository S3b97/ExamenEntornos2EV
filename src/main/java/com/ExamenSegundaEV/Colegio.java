package com.ExamenSegundaEV;

 
 
 public class Colegio {

	 private String Nombre;
	 private String Direccion;
	 private String Contrase�a;
	 private String Email;
	 private String PersonaDeContacto;

	 	 
	 public Colegio(String nombre, String direccion, String contrase�a, String email, String personaDeContacto) {
		super();
		Nombre = nombre;
		Direccion = direccion;
		Contrase�a = contrase�a;
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
	public String getContrase�a() {
		return Contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		Contrase�a = contrase�a;
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
