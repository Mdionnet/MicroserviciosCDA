package com.cda.microservicios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "localidad")
public class Localidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_LOCALIDAD")
	private long id;

	@Column(name="NOMBRE_LOCALIDAD")
	private String nombreLocalidad;
	
	@Column(name="CANTIDAD_BARRIOS")
	private int cantidadBarrios;
	
	@ManyToOne
	@JoinColumn(name = "partido_id")
	private Partido partido;
	public long getIdLocalidad() {
		return id;
	}

	public void setIdLocalidad(long idLocalidad) {
		this.id = idLocalidad;
	}

	public String getNombreLocalidad() {
		return nombreLocalidad;
	}

	public void setNombreLocalidad(String nombreLocalidad) {
		this.nombreLocalidad = nombreLocalidad;
	}

	public int getCantidadBarrios() {
		return cantidadBarrios;
	}

	public void setCantidadBarrios(int cantidadBarrios) {
		this.cantidadBarrios = cantidadBarrios;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}


}
