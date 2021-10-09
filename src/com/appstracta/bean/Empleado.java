package com.appstracta.bean;

import java.io.Serializable;

public class Empleado implements Serializable {
	private static final long serialVersionUID = -3518832851408572026L;

	private int id;
	private String nombre;
	private String departamento;
	private double salario;

	public Empleado() {
	}

	public Empleado(int id, String nombre, String departamento, double salario) {
		this.id = id;
		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
