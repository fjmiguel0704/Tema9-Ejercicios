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

		// Creamos la coleccion TreeSet para los números del eutomillon, agregar datos a
		// ella y ordenar sus datos
		TreeMap<Integer, Integer> numero = new TreeMap<Integer, Integer>();
		// Creamos la coleccion TreeSet para las estrellas del eutomillon, agregar datos
		// a ella y ordenar sus datos
		TreeMap<Integer, Integer> estrellas = new TreeMap<Integer, Integer>();

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Mientras el contador sea menor a 7, se incrementará
		while (cont <= 7) {
			// Si contador está entre 0 y 4 (ambos incluidos), se pedirán los 5 numeros del
			// euromillon
			if (cont >= 0 && cont <= 4) {
				System.out.println("Introduce tus 5 primeros números del euromillón: ");
				numeros = read.nextInt();
				// Y si ya se encuentra ese número, se incrementará su valor dependiendo del
				// numero de veces que se encuentre
				if (numero.containsKey(numeros)) {
					numero.replace(numeros, valorNum++);
				}
				// Añadimos a la coleccion el número y su valor
				numero.put(numeros, valorNum);
			}

			// Si el contador está entre 5 y 6 (ambos incluidos, se pedirán las 2 estrellas
			// del euromillon
			if (cont >= 5 && cont <= 6) {
				System.out.println("Introduce las 2 estrellas de tu euromillón: ");
				numeros = read.nextInt();
				// Y si ya se encuentra esa estrella, se incrementará su valor dependiendo del
				// numero de veces que se encuentre
				if (estrellas.containsKey(numeros)) {
					estrellas.replace(numeros, valorEstre++);
				}
				// Añadimos a la coleccion la estrella y su valor
				estrellas.put(numeros, valorEstre);
			}
			// Incrementamos el contador
			cont++;
		}

		// Imprimimos la serie completa del euromillón(numero y estrellas)
		System.out.println(numero + " " + estrellas);

	}

}
