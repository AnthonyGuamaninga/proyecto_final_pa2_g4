package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.modelo.VehiculoDTO;
import com.example.demo.repo.IVehiculoRepo;
@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	
	@Override
	public List<VehiculoDTO> buscarVehiculosDisponiblres(String marca, String modelo) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.buscarMarcaModelo(marca, modelo);
	}

	@Override
	public void ingresar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.insertar(vehiculo);
	}

	@Override
	public List<VehiculoDTO> buscarPorMarca(String marca) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.buscarMarca(marca);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.buscar(placa);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.eliminar(placa);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.actualizar(vehiculo);
	}

}
