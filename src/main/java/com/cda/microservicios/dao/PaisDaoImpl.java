package com.cda.microservicios.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.cda.microservicios.model.Pais;
import com.cda.microservicios.model.Provincia;

@Repository
public class PaisDaoImpl implements PaisDao {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Pais> getNombreProvincia(Provincia provincia){
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		
		CriteriaQuery<Pais> criteriaQuery = criteriaBuilder.createQuery(Pais.class);
		Root<Pais> root = criteriaQuery.from(Pais.class);
		TypedQuery<Pais> query = entityManager.createQuery(criteriaQuery.select(root).
				where(criteriaBuilder.equal(root.get("provincia"), provincia)));
		
		
		return query.getResultList();
	}
	
	
	
}
