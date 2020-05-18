package com.cda.microservicios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="barrio")
@Entity
public class Barrio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_BARRIO")
	private long id;
	
	@Column(name="NOMBRE_BARRIO")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "localidad_id")
	private Localidad localidad;

	public long getIdBarrio() {
		return id;
	}

	public void setIdBarrio(long idBarrio) {
		this.id = idBarrio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
}
