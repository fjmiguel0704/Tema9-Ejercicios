package ejercicios;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos la coleccion LinkedHashSet para agregar datos a ella evitar que se
		// repitan esos datos
		LinkedHashSet<String> collection = new LinkedHashSet<String>();

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Guardará las palabras introducidas por el usuario
		String palabras = "";

		// Mientras la palabra introducida sea distinta a fin, se seguirá pidiendo
		// palabras y agregando a la coleccion
		while (!palabras.equals("fin")) {
			System.out.println("Introduce una palabra: ");
			palabras = read.next();
			if (!palabras.equals("fin")) {
				collection.add(palabras);
			}
		}

		// Mostramos el contenido de la coleccion
		System.out.println(collection);
	}

}
