package com.appstracta;

import com.appstracta.bean.Usuario;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {

	public static void main(String[] args) {
		Queue<Usuario> usuarios = cargar();
		System.out.println("Tamaño de la Queue :: " + usuarios.size());
		System.out.println("Primer elemento:: " + usuarios.peek().getNombre());
		imprimir(usuarios);
		System.out.println("Primer elemento y se borra :: " + usuarios.poll().getNombre());
		imprimir(usuarios);
		// Borra la cola
		usuarios.clear();
		imprimir(usuarios);
	}

	private static Queue<Usuario> cargar() {
		// se declara Queue
		Queue<Usuario> usuarios = new LinkedList<>();

		usuarios.add(new Usuario(1, "Jorge", "12345", true));
		usuarios.add(new Usuario(2, "Miguel", "6789", true));
		usuarios.add(new Usuario(3, "verde3ro", "ElChido", true));

		return usuarios;
	}

	private static void imprimir(Queue<Usuario> usuarios ) {
		System.out.println(" ***** Imprimiendo datos de los usarios *****\n");

		// foreach lamda
		usuarios.forEach(usuario -> {
			if (usuario.getId() == 3) {
				usuario.setNombre("Raúl");
			}

			System.out.println(usuario);
		});
	}

}
