package com.ExamenSegundaEV;

public class Visitante {

	
	private String Email;
	private String contraseña;
	
	
	
	public Visitante(String email, String contraseña) {
		super();
		Email = email;
		this.contraseña = contraseña;
	}
	
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

}
