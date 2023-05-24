package ejercicio5b;

public class Ejercicio5B implements Comparable<Ejercicio5B> {

	private String nombre = "";
	private double precio = 0;

	public Ejercicio5B() {
		super();
	}

	public Ejercicio5B(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	public Ejercicio5B(String nombre, double precio) {
		super();

		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	@Override
	public String toString() {
		String res = "Nombre: " + nombre;
		res += "\nPrecio: " + precio;
		return res;
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;

		Ejercicio5B pro = (Ejercicio5B) obj;

		if (this.nombre.equals(pro.nombre)) {
			res = true;
		}
		return res;
	}

	@Override
	public int compareTo(Ejercicio5B o) {
		int res = 0;
		res = this.nombre.compareTo(o.nombre);
		return res;
	}

}