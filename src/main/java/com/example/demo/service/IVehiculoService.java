package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.modelo.VehiculoDTO;

public interface IVehiculoService {
	
	public void ingresar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo buscar(String placa);
	public void eliminar(String placa);
	
	public List<VehiculoDTO> buscarVehiculosDisponiblres(String marca, String modelo);
	
	public List<VehiculoDTO> buscarPorMarca(String marca);
	

}
