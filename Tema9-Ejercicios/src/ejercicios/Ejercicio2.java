package ejercicios;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		LinkedHashSet<String> collection = new LinkedHashSet<String>();
		Scanner read = new Scanner(System.in);
		String palabras = "";

		while (!palabras.equals("fin")) {
			System.out.println("Introduce una palabra: ");
			palabras = read.next();
			if (!palabras.equals("fin")) {
				collection.add(palabras);
			}
		}

		System.out.println(collection);
	}

}
