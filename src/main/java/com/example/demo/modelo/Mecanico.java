package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "mecanico")
public class Mecanico {
	
	@Id
	@SequenceGenerator(name="seq_meca", sequenceName = "seq_meca", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_meca")
	@Column(name="meca_id")
	private Integer id;
	@Column(name="meca_nombre")
	private String nombre;
	@Column(name="meca_apellido")
	private String apellido;
	@Override
	public String toString() {
		return "Mecanico [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

}
