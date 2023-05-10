package ejercicios;

import java.util.LinkedHashSet;

public class Ejercicio1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> collection = new LinkedHashSet<Integer>();
		int aleatorios;

		while (collection.size() < 20) {
			aleatorios = (int) (Math.random() * 100);
			collection.add(aleatorios);
		}

		System.out.println(collection);

	}

}
