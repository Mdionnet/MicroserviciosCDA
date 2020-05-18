package com.cda.microservicios.dao;

import java.util.List;

import com.cda.microservicios.model.Pais;
import com.cda.microservicios.model.Provincia;

public interface PaisDao {
	
	public List<Pais> getNombreProvincia(Provincia provincia);

}
