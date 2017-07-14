package com.sergio.archivobusiness.entity;

public class Factura {

	private String fecha_Creacion;
	private String nombre_Producto;
	private Double cantidad_Producto;
	private String descripcion_Producto;
	private Long id;
	
	public String getFecha_Creacion() {
		return fecha_Creacion;
	}
	
	public void setFecha_Creacion(String fecha_Creacion) {
		this.fecha_Creacion = fecha_Creacion;
	}
	
	public String getNombre_Producto() {
		return nombre_Producto;
	}
	
	public void setNombre_Producto(String nombre_Producto) {
		this.nombre_Producto = nombre_Producto;
	}
	
	public Double getCantidad_Producto() {
		return cantidad_Producto;
	}
	
	public void setCantidad_Producto(Double cantidad_Producto) {
		this.cantidad_Producto = cantidad_Producto;
	}
	
	public String getDescripcion_Producto() {
		return descripcion_Producto;
	}
	
	public void setDescripcion_Producto(String descripcion_Producto) {
		this.descripcion_Producto = descripcion_Producto;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Factura [fecha_Creacion=" + fecha_Creacion + ", nombre_Producto=" + nombre_Producto
				+ ", cantidad_Producto=" + cantidad_Producto + ", descripcion_Producto=" + descripcion_Producto
				+ ", id=" + id + "]";
	}
	
	
}
