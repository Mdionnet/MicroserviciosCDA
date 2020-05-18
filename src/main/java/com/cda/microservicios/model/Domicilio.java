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
@Table(name = "domicilios")
public class Domicilio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_DOMICILIO")
	private long id;
	
	@Column(name="NUMERACION")
	private int numeracion;
	
	@Column(name="CALLE")
	private String calle;
	
	@Column(name="ENTRE_CALLE_UNO")
	private String entreCalleUno;
	
	@Column(name="ENTRE_CALLE_DOS")
	private String entreCalleDos;

	@ManyToOne
	@JoinColumn(name = "barrio_id")
	private Barrio barrio;
	
	public long getIdDomicilio() {
		return id;
	}

	public void setIdDomicilio(long idDomicilio) {
		this.id = idDomicilio;
	}

	public int getNumeracion() {
		return numeracion;
	}

	public void setNumeracion(int numeracion) {
		this.numeracion = numeracion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getEntreCalleUno() {
		return entreCalleUno;
	}

	public void setEntreCalleUno(String entreCalleUno) {
		this.entreCalleUno = entreCalleUno;
	}

	public String getEntreCalleDos() {
		return entreCalleDos;
	}

	public void setEntreCalleDos(String entreCalleDos) {
		this.entreCalleDos = entreCalleDos;
	}

	public Barrio getBarrio() {
		return barrio;
	}

	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}
}