package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		// Guardará la opción elegida del menú
		int opc;
		// Guardará el nombre del producto
		String nomProduct;
		// Guardará el precio del producto
		double precio;

		// Creamos una coleccion para guardar los productos y su precio, sin importar
		// el orden de estos
		HashMap<String, Double> productos = new HashMap<String, Double>();
		// Creamos una coleccion para almacenar el stock de cada uno de los productos,
		// pudiendo ser en muchos de ellos el mismo stock
		ArrayList<Integer> stock = new ArrayList<Integer>();

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Haz esto mientras ->
		do {
			// Mostramos el menú de opciones y le pedimos una opcion al usuario
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
			// Si es 1, agregamos un nuevo producto. Pedimos el nombre y precio del
			// producto, y si no existe lo añadimos
			// a la coleccion, si existe mostramos un mensaje de error
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

			// Si es 2, eliminamos un producto. Pedimos el nombre del producto, y si
			// existe lo eliminamos de la coleccion, si no existe mostramos un mensaje de
			// error
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
			// Si es 3, mostramos la lista de productos con su precio y stock
			case 3:
				System.out.println(productos + " " + stock);
				break;
			// Si es 0, salimos del programa
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				// Si la opcion es distinta a las anteriores, mostramos un mensaje de error
				System.out.println("Opción incorrecta");
			}
		} while (opc != 0); // ->Mientras la opcion sea distinta a 0

	}
}
