package com.ExamenSegundaEV;

public class Visitante {

	
	private String Email;
	private String contrase�a;
	
	
	
	public Visitante(String email, String contrase�a) {
		super();
		Email = email;
		this.contrase�a = contrase�a;
	}
	
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

}
