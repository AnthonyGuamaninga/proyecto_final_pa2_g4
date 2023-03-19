package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Cliente;

@Controller
@RequestMapping("/inicios")
public class PrincipalController {
	
	@GetMapping("/inicio")
	public String menuInicio(Cliente cliente) {
		return "MenuPrincipal";
	}
	
	@GetMapping("/cliente")
	public String clientePrincipal(Cliente cliente) {
		return "Cliente";
	}
	
	@GetMapping("/registrarCliente")
	public String registrarCliente(Cliente cliente) {
		return "vistaRegistroCliente";
	}
	
	@GetMapping("/empleado")
	public String empleadoPrincipal(Cliente cliente) {
		return "Empleado";
	}
	

}
