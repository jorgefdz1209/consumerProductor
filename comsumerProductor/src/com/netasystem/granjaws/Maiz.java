package com.netasystem.granjaws;

public class Maiz {
	private Integer cantidad;
	private String descripcion;
	
	public Maiz() {
		super();
	}
	public Maiz(Integer cantidad, String descripcion) {
		super();
		this.cantidad = cantidad;
		this.descripcion = descripcion;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Maiz [cantidad=" + cantidad + ", descripcion=" + descripcion + "]";
	}
}