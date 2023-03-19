package com.example.demo.repo;

import com.example.demo.modelo.Mecanico;

public interface IMecanicoRepo {

	public void insertar(Mecanico mecanico);
	public void actualizar(Mecanico mecanico);
	public Mecanico buscar(Integer id);
	public void eliminar(Integer id);
}
