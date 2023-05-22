package ejercicios;

import java.util.LinkedHashSet;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos una colección LinkedHashSet para añadir datos a ella y evitar que no
		// se repita ninguno
		LinkedHashSet<Integer> collection = new LinkedHashSet<Integer>();

		// Guardará los números aleatorios que se van generando
		int aleatorios;

		// Mientras el tamaño de la colección de la colección sea menor que 20, va a
		// generar una cantidad de números aleatorios y los irá añadiendo a la colección
		while (collection.size() < 20) {
			aleatorios = (int) (Math.random() * 100);
			collection.add(aleatorios);
		}

		// Imprimimos la colección
		System.out.println(collection);

	}

}
