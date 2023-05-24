package ejercicio5b;

import java.util.Scanner;
import java.util.TreeSet;

public class PrincipalProducto {

	public static void main(String[] args) {

		TreeSet<Ejercicio5B> productos = FicheroProducto.leerFichero();

		Ejercicio5B p;
		int opc;
		String nombre;
		double precio;
		Scanner sc = new Scanner(System.in);

		do {
			menu();
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {
			case 1:// Dar de alta el producto
				System.out.println("Introduzca el nombre del producto:");
				nombre = sc.nextLine();

				System.out.println("Introduzca el precio del producto:");
				precio = sc.nextDouble();
				sc.nextLine();

				p = new Ejercicio5B(nombre, precio);

				if (productos.add(p)) {
					System.out.println("Añadido correctamente");
				} else {
					System.out.println("El producto ya existe");
				}

				break;
			case 2:// Baja de producto
				System.out.println("Introduzca el nombre del producto:");
				nombre = sc.nextLine();

				p = new Ejercicio5B(nombre);

				if (productos.remove(p)) {
					System.out.println("Eliminado exitosamente");
				} else {
					System.out.println("El producto no existe");
				}

				break;
			case 3: // Listar
				for (Ejercicio5B prod : productos) {
					System.out.println(prod);
					System.out.println();
				}
				break;
			case 4:
				FicheroProducto.escribirFichero(productos);
				break;
			case 0: // Salir
				System.out.println("Saliendo del sistema...");
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opc != 0);

		sc.close();
	}

	private static void menu() {
		System.out.println("Seleccione una opción");
		System.out.println("1. Alta producto");
		System.out.println("2. Baja producto");
		System.out.println("3. Listar existencias");
		System.out.println("4. Guardar");
		System.out.println("0. Salir");
	}
}