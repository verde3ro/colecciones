package com.appstracta;

import com.appstracta.bean.Empleado;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApp {

	public static void main(String[] args) {
		List<String> nombres = obtenerEmpleados()
				.stream()
				.filter(empleado -> empleado.getSalario() > 15000.00 || empleado.getNombre().equals("Raúl"))
				.map(Empleado::getNombre) // Transforma
				.sorted()
				.skip(1)
				.limit(3)
				.distinct()
				.collect(Collectors.toList());

		System.out.println(nombres);
	}

	private static List<Empleado> obtenerEmpleados() {
		// Con programacion funcional
		return Stream.of(new Empleado(1, "Raúl", "Desarrollo", 20000.00),
						new Empleado(12, "Alejandro", "Redes", 633.00),
						new Empleado(20, "Jose", "Base de datos", 40.000),
						new Empleado(53, "Alberto", "Desarrollo", 20000.00),
						new Empleado(66, "Luis", "Base de Datos", 306.66),
						new Empleado(78, "Sergio", "Redes", 20000.00),
						new Empleado(89, "Raúl", "Infraestructura", 2100.00),
						new Empleado(101, "Maria", "QA", 20000.00))
				.collect(Collectors.toList());
	}
}
