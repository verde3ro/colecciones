package com.appstracta;

import com.appstracta.bean.Usuario;

import java.util.Stack;

public class StackApp {

	public static void main(String[] args) {
		//Rellenando Pila.
		Stack<Usuario> usuarios = cargar();

		//Traer si borrarrlo de la pila
		System.out.println("Último elemento en la pila " + usuarios.peek().getNombre());

		// Se imprime pila
		imprimir(usuarios);
		//Traer y borra de la pila
		System.out.println("Último elemento en la pila y se borra " + usuarios.pop());
		imprimir(usuarios,1, "Raúl");
		vaciar(usuarios);
		imprimir(usuarios);
	}

	// Crea pila
	private static Stack<Usuario> cargar(){
		//Se instancia utilizando new Stack<>()
		Stack<Usuario> usuarios = new Stack<>();

		// usando add
		usuarios.add(new Usuario(1, "Jorge", "12345", true));
		// usando push
		usuarios.push(new Usuario(2, "Miguel", "6789", true));
		usuarios.push(new Usuario(3, "verde3ro", "ElChido", true));

		return usuarios;
	}

	private static void imprimir(Stack<Usuario> usuarios){
		System.out.println(" ***** Imprimiendo datos de los usarios *****\n");

		for (Usuario usuario: usuarios) {
			if (usuario.getId() == 1) {
				usuario.setNombre("Maria");
			}

			System.out.println("ID :: " + usuario.getId());
			System.out.println("Nombre :: " + usuario.getNombre());
			System.out.println("Password :: " + usuario.getPassword());
			System.out.println("Activo :: " + usuario.isActivo());
		}
	}

	// Sobrecarga de metodo
	private static void imprimir(Stack<Usuario> usuarios, int id, String nombre) {
		System.out.println(" ***** Imprimiendo datos de los usarios *****\n");

		for (Usuario usuario: usuarios) {
			if (usuario.getId() == id) {
				usuario.setNombre(nombre);
			}

			System.out.println("ID :: " + usuario.getId());
			System.out.println("Nombre :: " + usuario.getNombre());
			System.out.println("Password :: " + usuario.getPassword());
			System.out.println("Activo :: " + usuario.isActivo());
		}
	}

	private static void vaciar(Stack<Usuario> usuarios) {
		System.out.println(" **** Se vacía la pila ***\n");

		while (!usuarios.empty()) {
			usuarios.pop();
		}
	}

}
