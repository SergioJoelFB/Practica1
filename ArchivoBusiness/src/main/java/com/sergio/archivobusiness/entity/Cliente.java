package com.sergio.archivobusiness.entity;

public class Cliente extends Persona {

	private Long id;

	public Long getId() {
		return id;
	}
		
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", numeroTelefonico=" + numeroTelefonico + "]";
	}

}
