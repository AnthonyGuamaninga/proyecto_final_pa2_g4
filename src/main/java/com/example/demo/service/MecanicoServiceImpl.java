package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Mecanico;
import com.example.demo.repo.IMecanicoRepo;
@Service
public class MecanicoServiceImpl implements IMecanicoService {

	@Autowired
	private IMecanicoRepo iMecanicoRepo;
	@Override
	public void ingresar(Mecanico mecanico) {
		// TODO Auto-generated method stub
		this.iMecanicoRepo.insertar(mecanico);
	}

	@Override
	public void actualizar(Mecanico mecanico) {
		// TODO Auto-generated method stub
		this.iMecanicoRepo.actualizar(mecanico);
	}

	@Override
	public Mecanico buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iMecanicoRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iMecanicoRepo.eliminar(id);
	}

}
