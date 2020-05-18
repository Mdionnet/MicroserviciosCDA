package com.cda.microservicios.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cda.microservicios.dao.ProvinciaDao;
import com.cda.microservicios.model.Provincia;

@Service
public class ProvinciaService {

	@Autowired
	ProvinciaDao provinciaDao;

	public Optional<Provincia> getNombreProvincia(Long idProvincia){
		return provinciaDao.findById(idProvincia);
	
	}
}
