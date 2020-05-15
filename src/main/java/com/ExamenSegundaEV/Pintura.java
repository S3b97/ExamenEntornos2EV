package com.ExamenSegundaEV;

public class Pintura {

	private String Nombre;
	private String Tecnica;
	private String Altura;
	private String Anchura;
	
	
	public Pintura(String nombre, String tecnica, String altura, String anchura) {
		super();
		Nombre = nombre;
		Tecnica = tecnica;
		Altura = altura;
		Anchura = anchura;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTecnica() {
		return Tecnica;
	}
	public void setTecnica(String tecnica) {
		Tecnica = tecnica;
	}
	public String getAltura() {
		return Altura;
	}
	public void setAltura(String altura) {
		Altura = altura;
	}
	public String getAnchura() {
		return Anchura;
	}
	public void setAnchura(String anchura) {
		Anchura = anchura;
	}
	
	
}
