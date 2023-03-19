package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Mecanico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MecanicoRepoImpl implements IMecanicoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Mecanico mecanico) {
		// TODO Auto-generated method stub
		this.entityManager.persist(mecanico);
	}

	@Override
	public void actualizar(Mecanico mecanico) {
		// TODO Auto-generated method stub
		this.entityManager.merge(mecanico);
	}

	@Override
	public Mecanico buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Mecanico.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

}
