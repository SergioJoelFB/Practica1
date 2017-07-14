package com.sergio.archivobusiness.entity;

public class Producto {

	private String marca;
	private Double cantidad;
	private String fecha_vencimiento;
	private String Descripcion;
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	
	@Override
	public String toString() {
		return "Producto [marca=" + marca + ", cantidad=" + cantidad + ", fecha_vencimiento=" + fecha_vencimiento
				+ ", Descripcion=" + Descripcion + "]";
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	
	
}
