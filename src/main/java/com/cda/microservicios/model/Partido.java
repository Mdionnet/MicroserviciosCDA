package com.cda.microservicios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "partido")
public class Partido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPartido;

	private String nombrePartido;
	private String cantidadLocalidades;
	
	@ManyToOne
	@JoinColumn(name = "provincia_id")
	private Provincia provincia;
	
	public long getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(long idPartido) {
		this.idPartido = idPartido;
	}

	public String getNombrePartido() {
		return nombrePartido;
	}

	public void setNombrePartido(String nombrePartido) {
		this.nombrePartido = nombrePartido;
	}

	public String getCantidadLocalidades() {
		return cantidadLocalidades;
	}

	public void setCantidadLocalidades(String cantidadLocalidades) {
		this.cantidadLocalidades = cantidadLocalidades;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

}
