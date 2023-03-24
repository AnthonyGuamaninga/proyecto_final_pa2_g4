package com.example.demo.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.CamposParaReserva;
import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Reserva;
import com.example.demo.service.IReservaService;

@Controller
@RequestMapping("/reservas")
public class ReservaController {
	
	@Autowired
	private IReservaService iReservaService;

	@GetMapping("/reservarVehiculo")
	public String reservarVehiculo(CamposParaReserva camposParaReserva) {
		return "vistaReservarVehiculo";
	}
	
	@GetMapping("/realizarValidacion")
	public String realizarValidacion(@ModelAttribute CamposParaReserva camposParaReserva ) {
		String cedula = camposParaReserva.getCliente().getCedula();
		String placa = camposParaReserva.getVehiculo().getPlaca();
		LocalDateTime fechaInicio = camposParaReserva.getReserva().getFechaInicio();
		LocalDateTime fechaFin = camposParaReserva.getReserva().getFechaFin();
		System.out.println("cedula "+cedula+" placa "+placa+" fechaInicio "+fechaInicio);
		this.iReservaService.reservar(cedula, placa, fechaInicio, fechaFin);
		return "vistaRealizado";
	}
	
//	@GetMapping("/reservas/realizarValidacion")
//	public String realizarValidacion(Reserva reserva) {
//	  // hacer algo con la reserva y el cliente
//	  return "vistaResultado";
//	}

}
