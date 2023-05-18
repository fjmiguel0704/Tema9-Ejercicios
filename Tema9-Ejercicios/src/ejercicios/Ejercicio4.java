package ejercicios;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio4 {

	public static void main(String[] args) {
		int numeros;
		int cont = 0;
		int valorNum = 1;
		int valorEstre = 1;

		TreeMap<Integer, Integer> numero = new TreeMap<Integer, Integer>();
		TreeMap<Integer, Integer> estrellas = new TreeMap<Integer, Integer>();

		Scanner read = new Scanner(System.in);

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
