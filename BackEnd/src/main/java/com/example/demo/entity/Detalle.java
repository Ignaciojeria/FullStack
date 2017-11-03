package com.example.demo.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Detalle {
	
	@Id
	@Column(name="detalle_id")
	private long id;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id_documento")
	private Documento documento;
	
	@Column(name="unidad_medida")
	private String unidadDeMedida;
	
	@Column(name="precio")
	private double precio;
	
	@Column(name="cantidad")
	private int cantidad;
	
	@Column(name="subtotal")
	private double subTotal;
	
	@Column(name="descripcion")
	private String descripcion;

	public Detalle() {}
	
	
	
	public Detalle(long id, Documento documento, String unidadDeMedida, double precio, int cantidad, double subTotal,
			String descripcion) {
		this.id = id;
		this.documento = documento;
		this.unidadDeMedida = unidadDeMedida;
		this.precio = precio;
		this.cantidad = cantidad;
		this.subTotal = subTotal;
		this.descripcion = descripcion;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getUnidadDeMedida() {
		return unidadDeMedida;
	}

	public void setUnidadDeMedida(String unidadDeMedida) {
		this.unidadDeMedida = unidadDeMedida;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
