package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		int opc;
		String nomProduct;
		double precio;

		//
		HashMap<String, Double> productos = new HashMap<String, Double>();
		ArrayList<Integer> stock = new ArrayList<Integer>();

		Scanner read = new Scanner(System.in);

		do {
			System.out.println();
			System.out.println("PRODUCTOS");
			System.out.println("----------------------------");
			System.out.println("1. Alta de producto");
			System.out.println("2. Baja de producto");
			System.out.println("3. Listar existencias");
			System.out.println("0. Salir");
			System.out.println();
			System.out.println("Introduce una opción: ");
			opc = read.nextInt();
			read.nextLine();

			switch (opc) {
			case 1:
				System.out.println("Introduce el nombre del prodcuto: ");
				nomProduct = read.next();
				System.out.println("Precio del producto: ");
				precio = read.nextDouble();
				read.nextLine();
				if (!productos.containsKey(nomProduct)) {
					productos.put(nomProduct, precio);
					stock.add(1);
				} else {
					System.out.println("Este producto ya existe");
				}

				break;
			case 2:
				System.out.println("Introduce el nombre del prodcuto a quitar: ");
				nomProduct = read.next();
				if (productos.containsKey(nomProduct)) {
					productos.remove(nomProduct);
					stock.remove(1);
				} else {
					System.out.println("El producto no existe");
				}

				break;
			case 3:
				System.out.println(productos + " " + stock);
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		} while (opc != 0);

	}
}
