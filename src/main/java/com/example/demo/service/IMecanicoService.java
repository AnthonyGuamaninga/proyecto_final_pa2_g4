package com.example.demo.service;

import com.example.demo.modelo.Mecanico;

public interface IMecanicoService {

	public void ingresar(Mecanico mecanico);
	public void actualizar(Mecanico mecanico);
	public Mecanico buscar(Integer id);
	public void borrar(Integer id);
	
}
