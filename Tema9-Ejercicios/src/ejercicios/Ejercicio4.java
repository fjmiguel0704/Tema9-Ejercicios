package ejercicios;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Guardará los numeros introducidos por el usuario
		int numeros;
		// Contador para la coleccion
		int cont = 0;
		// Valor inicial para las claves de número
		int valorNum = 1;
		// Valor inicial para las claves de estrellas
		int valorEstre = 1;

		// Creamos la coleccion TreeSet para agregar datos a ella y ordenar sus datos
		TreeMap<Integer, Integer> numero = new TreeMap<Integer, Integer>();
		TreeMap<Integer, Integer> estrellas = new TreeMap<Integer, Integer>();

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Mientras
		while (cont <= 7) {
			if (cont >= 0 && cont <= 4) {
				System.out.println("Introduce tus 5 primeros números del euromillón: ");
				numeros = read.nextInt();
				if (numero.containsKey(numeros)) {
					numero.replace(numeros, valorNum++);
				}
				numero.put(numeros, valorNum);
			}
			if (cont >= 5 && cont <= 6) {
				System.out.println("Introduce las 2 estrellas de tu euromillón: ");
				numeros = read.nextInt();
				if (estrellas.containsKey(numeros)) {
					estrellas.replace(numeros, valorEstre++);
				}
				estrellas.put(numeros, valorEstre);
			}
			cont++;
		}

		System.out.println(numero + " " + estrellas);

	}

}
