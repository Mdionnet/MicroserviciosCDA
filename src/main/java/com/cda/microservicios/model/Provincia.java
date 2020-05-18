package com.cda.microservicios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="provincia")
public class Provincia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProvincia;
	
	private String nombre;
	
	private String ubicacionGeografica;
	
	@ManyToOne
	@JoinColumn(name = "pais_id")
	private Pais pais;

	public long getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(long idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacionGeografica;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacionGeografica = ubicacion;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
