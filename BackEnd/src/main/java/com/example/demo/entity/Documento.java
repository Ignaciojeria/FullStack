package com.example.demo.entity;

import java.util.Date;

import java.util.List;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Documento {
	
	@Id
	@Column(name= "documento_id")
	private long id;

	

	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="folio")
	private long folio;
	
	@Column(name="nombre_contacto")
	private String nombre_contacto;
	
	@Column(name="total")
	private Double total;

	@OneToMany (mappedBy = "documento")
	private List<Detalle> detalles;




	public Documento() {}

	
	public Documento(long id, Date fecha, long folio, String nombre_contacto, Double total) {
		this.id = id;
		this.fecha = fecha;
		this.folio = folio;
		this.nombre_contacto = nombre_contacto;
		this.total = total;
	}




	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public long getFolio() {
		return folio;
	}

	public void setFolio(long folio) {
		this.folio = folio;
	}

	public String getNombre_contacto() {
		return nombre_contacto;
	}

	public void setNombre_contacto(String nombre_contacto) {
		this.nombre_contacto = nombre_contacto;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}


	public List<Detalle> getDetalles() {
		return detalles;
	}


	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}
	
	
	

}
