package com.cda.microservicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cda.microservicios.dao.PaisDao;
import com.cda.microservicios.model.Pais;
import com.cda.microservicios.model.Provincia;

@Service
public class PaisService {

	@Autowired 
	PaisDao paisDao;
	
	public List<Pais> getNombreProvincia(Provincia provincia){
		return paisDao.getNombreProvincia(provincia);
		
	}
}
