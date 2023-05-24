package ejercicio5b;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class FicheroProducto {

	public static TreeSet<Ejercicio5B> leerFichero() {
		TreeSet<Ejercicio5B> productos = new TreeSet<>();
		Ejercicio5B p;
		String nombre;
		double precio;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("src\\ejercicio5\\productos.txt"));
			String linea = br.readLine();
			String[] datos;
			while (linea != null) {
				datos = linea.split(" ");

				nombre = datos[0];
				precio = Double.parseDouble(datos[1]); // Devuelve double, tipo primitivo

				p = new Ejercicio5B(nombre, precio);
				productos.add(p);

				linea = br.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("ERROR al abrir el fichero");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("ERROR al leer el fichero");
			System.out.println(e.getMessage());
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("ERROR al cerrar el búfer");
					System.out.println(e.getMessage());
				}
			}
		}

		return productos;

	}

	public static void escribirFichero(TreeSet<Ejercicio5B> productos) {
		BufferedWriter bw = null;
		String nombre;
		double precio;
		try {
			bw = new BufferedWriter(new FileWriter("src\\ejercicio5\\productos.txt"));

			for (Ejercicio5B p : productos) {
				nombre = p.getNombre();
				precio = p.getPrecio();

				bw.write(nombre + " " + precio);
				bw.newLine();
			}

			bw.flush();

		} catch (IOException e) {
			System.out.println("Error al abrir el fichero");
			System.out.println(e.getMessage());
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					System.out.println("Error al cerrar el búfer");
					System.out.println(e.getMessage());
				}
			}
		}
	}

}