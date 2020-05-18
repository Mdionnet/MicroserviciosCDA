package com.cda.microservicios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="cliente")
@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CLIENTE")
	private Long id;
	
	@Column(name="NOMBRE_CLIENTE")
	private String nombre;
	
	@Column(name="APELLIDO_CLIENTE")
	private String apellido;
	
	@Column(name="DOCUMENTO_CLIENTE")
	private int documento;
	
	@ManyToOne
	@JoinColumn(name = "domicilio_id")
	private Domicilio domicilio;
	
	public Long getIdCliente() {
		return id;
	}
	public void setIdCliente(Long idCliente) {
		this.id = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
}
