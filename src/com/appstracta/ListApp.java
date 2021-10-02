package com.appstracta;

import com.appstracta.bean.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ListApp {

	public static void main(String[] args) {
		List<Usuario> usuarios = cargar();
		System.out.println("Tamaño de la Lista :: " + usuarios.size());
		System.out.println("Elemento seleccionado :: " + usuarios.get(2).getNombre());
		imprimir(usuarios);
		// Remover elemento
		usuarios.remove(1);
		imprimir(usuarios);
		usuarios.add(new Usuario(2, "Miguel", "6789", true));
		imprimir(usuarios);
	}

	private static List<Usuario> cargar() {
		List<Usuario> usuarios = new ArrayList<>();

		usuarios.add(new Usuario(1, "Jorge", "12345", true));
		usuarios.add(new Usuario(2, "Miguel", "6789", true));
		usuarios.add(new Usuario(3, "verde3ro", "ElChido", true));

		return usuarios;
	}

	private static void imprimir(List<Usuario> usuarios) {
		System.out.println(" ***** Imprimiendo datos de los usarios *****\n");

		usuarios.forEach(System.out::println);
	}

}
