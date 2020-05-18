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
@Table(name = "partido")
public class Partido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_PARTIDO")
	private long id;

	@Column(name="NOMBRE_PARTIDO")
	private String nombrePartido;

	@Column(name="CANTIDAD_LOCALIDADES")
	private String cantidadLocalidades;
	
	@ManyToOne
	@JoinColumn(name = "provincia_id")
	private Provincia provincia;
	
	public long getIdPartido() {
		return id;
	}

	public void setIdPartido(long idPartido) {
		this.id = idPartido;
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
