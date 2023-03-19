package com.example.demo.repo;

import java.util.List;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.ClienteDTO;

public interface IClienteRepo {
	
	public void  insertar(Cliente cliente);
	public void actualizar(Cliente cliente);
	public Cliente buscar(String cedula);
	public void eliminar(String cedula);
	
	public List<ClienteDTO> buscarApellido(String apellido);
	
	public List<Cliente> reporte();
}
