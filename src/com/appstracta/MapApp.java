package com.appstracta;

import com.appstracta.bean.Usuario;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
	public static void main(String[] args) {
		Map<Integer, Usuario> usuarios = cargar();
		imprimir(usuarios);

		System.out.println("Tamaño :: " + usuarios.size());
		System.out.println(" ***** Se imprime solo un valor **** \n");
		System.out.println(usuarios.get(2));

		usuarios.remove(2);

		imprimir(usuarios);

		System.out.println("Existe key " + usuarios.containsKey(2));

		if (!usuarios.isEmpty()) {
			System.out.println("Entro aqui");
		}
	}

	public static Map<Integer, Usuario> cargar() {
		// Declaracion de mapa con polimorfismo
		Map<Integer, Usuario> usuarios = new HashMap<>();

		// Se agregan registros de usuario al mapa
		usuarios.put(3, new Usuario(1, "Jorge", "jorge2019", true));
		usuarios.put(5, new Usuario(2, "Maria", "369822", true));
		usuarios.put(2, new Usuario(3, "verde3ro", "El_chido", true));

		return usuarios;
	}

	private static void imprimir(Map<Integer, Usuario> usuarios) {
		System.out.println(" ***** Se imprime usuarios **** \n");

		for (Map.Entry<Integer, Usuario> mapa : usuarios.entrySet()){
			System.out.println("Key ::: " + mapa.getKey() + ", Valor ::: " + mapa.getValue());
		}

		System.out.println(" *****\n Se imprime usuarios con programción funcional **** \n");
		usuarios.forEach((k, usuario) -> System.out.println("Key : " + k + ", Valor : " + usuario));
	}
}
