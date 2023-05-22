package ejercicios;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio3 {
	public static void main(String[] args) {
		// Creamos la coleccion TreeSet para agregar datos a ella y ordenar sus datos
		TreeSet<String> collection = new TreeSet<String>();

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
