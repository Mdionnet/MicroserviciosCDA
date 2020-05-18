package com.cda.microservicios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_PAIS")
	private long id;

	@Column(name="NOMBRE_PAIS")
	private String nombre;
	
	@Column(name="COORDENADAS_PAIS")
	private String coordenadas;
	
	@Column(name="CLIMA_PAIS")
	private String clima;

	public long getIdPais() {
		return id;
	}

	public void setIdPais(long idPais) {
		this.id = idPais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

}
