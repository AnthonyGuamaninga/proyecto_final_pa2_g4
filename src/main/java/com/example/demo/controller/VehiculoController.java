package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.modelo.VehiculoDTO;
import com.example.demo.service.IVehiculoService;

@Controller
@RequestMapping("/vehiculos")
public class VehiculoController {
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@GetMapping("/vehiculoDisponible")
	public String buscarVehiculo(Vehiculo vehiculo) {
		return "vistaBuscarVehiculosPorMarcaModelo";
	}
	
	@GetMapping("/buscarVehiculos")
	public String buscarVehiculos(Vehiculo vehiculo, Model model) {
		String marca= vehiculo.getMarca();
		String modelo= vehiculo.getModelo();
		List<VehiculoDTO> vehiculos = this.iVehiculoService.buscarVehiculosDisponiblres(marca, modelo);
		vehiculos.stream().forEach(x->System.out.println(x));
		model.addAttribute("vehiculos", vehiculos);
		return "vistaVehiculosDisponiblesMarcaModelo";
	}
	
	@GetMapping("/reservarVehiculo")
	public String reservarVehiculo() {
		return "";
	}

}
