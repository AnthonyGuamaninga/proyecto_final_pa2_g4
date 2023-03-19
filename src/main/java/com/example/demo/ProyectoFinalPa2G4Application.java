package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Reserva;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repo.IReservaRepo;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IReservaService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class ProyectoFinalPa2G4Application implements CommandLineRunner {

	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IVehiculoService iVehiculoService;
	@Autowired
	private IReservaService iReservaService;
	
	@Autowired
	private IReservaRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalPa2G4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// ---------------- vista: CLIENTES
		// ---------------------------------------------
		// a)
//		System.out.println("literal 1a");
//		List<VehiculoDTO> vehiculos = this.iVehiculoService.buscarVehiculosDisponiblres("Chevrolet", "D Max");
//		vehiculos.stream().forEach(x -> System.out.println(x));
		// b)
//		System.out.println("literal 1b");
//		this.iReservaService.reservar("1788542038", "FGB-7865", LocalDateTime.of(2020, 03,03,12,12), LocalDateTime.of(2020, 03,10,12,12));
		
		// c)
//		System.out.println("literal 1c");
//		Cliente cliente = new Cliente();
//		cliente.setApellido("Carvajal");
//		cliente.setCedula("1222222");
//		cliente.setFechaNacimiento(LocalDateTime.of(2001, 02, 14, 1, 4));
//		cliente.setGenero("M");
//		cliente.setNombre("Alberto");
//		cliente.setRegistro("C");
//		cliente.setTipo("NOVIP");
//		this.clienteService.registrarse(cliente);
		
		// d)
//		System.out.println("literal 1d");
//		Cliente clienteMod = this.clienteService.buscar("1222222");
//		clienteMod.setNombre("Julian");
//		this.clienteService.actualizarDatos(clienteMod);

		// ------------------- vista EMPLEADOS -----------------------------
		// a)
//		System.out.println("literal 2a");
//		Cliente cliente3 = new Cliente();
//		cliente3.setApellido("Pozo");
//		cliente3.setCedula("2212121");
//		cliente3.setFechaNacimiento(LocalDateTime.of(2001, 02, 14, 1, 4));
//		cliente3.setGenero("F");
//		cliente3.setNombre("Samara");
//		cliente3.setRegistro("E");
//		cliente3.setTipo("VIP");
//		this.clienteService.registrarse(cliente3);

		// b)
//		System.out.println("literal 2b");
//		List<ClienteDTO> clientes = this.clienteService.buscarPorApellido("Pozo");
//		clientes.stream().forEach(x-> System.out.println(x));
//			// el actualizar si funca
//		this.clienteService.eliminar("1222222");
		
		// c)
//		System.out.println("literal 2c");
//		Vehiculo vehiculo = new Vehiculo();
//		vehiculo.setAnio("1999");
//		vehiculo.setAvaluo(new BigDecimal(200));
//		vehiculo.setCilindraje("2V");
//		vehiculo.setEstado("D");
//		vehiculo.setMarca("KIA");
//		vehiculo.setModelo("Stonic");
//		vehiculo.setNumeroPuertas("4");
//		vehiculo.setPais("Europa");
//		vehiculo.setPlaca("PDZ-3030");
//		vehiculo.setValorDia(new BigDecimal(30));
//		this.iVehiculoService.ingresar(vehiculo);

		// d)
//		System.out.println("literal 2d");
//		List<VehiculoDTO> vehiculos = this.iVehiculoService.buscarPorMarca("Chevrolet");
//		vehiculos.stream().forEach(x-> System.out.println(x));
//		Vehiculo vehiculoMod = this.iVehiculoService.buscar("PDZ-3030");
//		vehiculoMod.setAvaluo(new BigDecimal(23000));
//		this.iVehiculoService.actualizar(vehiculoMod);
//		this.iVehiculoService.eliminar("PDZ-3030");
		
		// e)
//		System.out.println("literal 2e");
//		this.iReservaService.retirarVehiculoReservado(1);

		// f)
//		System.out.println("literal 2f");
//		// vistas
		
		// a)
//		System.out.println("literal 3a");
//		List<Reserva> reservas =  this.iReservaService.reporte(LocalDateTime.of(2020, 03,01,12,12), LocalDateTime.of(2020, 03,15,12,12));
//		reservas.stream().forEach(x-> {
//			if(x!=null) {
//				System.out.println(x);
//				Cliente cliente = x.getCliente();
//				Vehiculo vehiculo = x.getVehiculo();
//				System.out.println("Cliente -> "
//						+ "Cedula: "+cliente.getCedula()
//						+ "\tApellido: "+cliente.getApellido());
//				System.out.println("Vehiculo -> "
//						+ "Placa: "+vehiculo.getPlaca()
//						+ "\tMarca: "+vehiculo.getMarca()
//						+ "\tModelo: "+vehiculo.getModelo());
//			}else {
//				System.out.println("null");
//			}
//		});
		
		// b)
//		System.out.println("literal 3b");
//		List<Cliente> clientes= this.clienteService.reporte();
//		clientes.stream().forEach(x-> {
//			System.out.println(x);
//			List<Reserva> reservas = x.getReservas();
//			if(!reservas.isEmpty()) {
//				for(Reserva r: reservas) {
//					System.out.println("Reserva -> "
//							+ "Valor IVA: "+r.getIva()
//							+ "\tValor Total: "+r.getValorTotal());
//				}
//			}
//		});
		
	}

}
