package com.sergio.archivobusiness.entity;

public class Usuario extends Persona {

	private String Nombre_Usuario;
	private String Contra;
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_Usuario() {
		return Nombre_Usuario;
	}
	
	public void setNombre_Usuario(String nombre_Usuario) {
		Nombre_Usuario = nombre_Usuario;
	}
	
	public String getContra() {
		return Contra;
	}
	
	public void setContra(String contra) {
		Contra = contra;
	}

	@Override
	public String toString() {
		return "Usuario [Nombre_Usuario=" + Nombre_Usuario + ", Contrase�a=" + Contra + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", cedula=" + cedula + ", numeroTelefonico=" + numeroTelefonico + ", id="
				+ id + "]";
	}
	
	
}
