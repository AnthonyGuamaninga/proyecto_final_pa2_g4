package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.ClienteDTO;

public interface IClienteService {
	//buscar por cedula (id)
	public Cliente buscar(String cedula);
	public void registrarse(Cliente cliente);
	public void actualizarDatos(Cliente cliente);

	public void eliminar(String cedula);
	
	public List<ClienteDTO> buscarPorApellido(String apellido);
	
	public List<Cliente> reporte();


	
}
