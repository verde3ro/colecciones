package com.appstracta.bean;

import java.io.Serializable;

public class Usuario implements Serializable {
	private static final long serialVersionUID = -4407903817612391341L;

	private int id;
	private String nombre;
	private String password;
	private boolean activo;

	public Usuario() {
	}

	public Usuario(int id, String nombre, String password, boolean activo) {
		this.id = id;
		this.nombre = nombre;
		this.password = password;
		this.activo = activo;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Usuario{" +
				"id=" + id +
				", nombre='" + nombre + '\'' +
				", password='" + password + '\'' +
				", activo=" + activo +
				'}';
	}

}
