package ejercicios;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio3 {
	public static void main(String[] args) {
		TreeSet<String> collection = new TreeSet<String>();
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
