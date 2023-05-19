package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsoEmpleado {

	public static void main(String[] args) {

		ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		Empleado xy = new Empleado("Carmen", 55, 2000);

		listaEmpleados.add(new Empleado("Ana0", 45, 2500));
		listaEmpleados.add(new Empleado("Juan1", 55, 2000));
		listaEmpleados.add(new Empleado("Luisa2", 55, 2000));
		listaEmpleados.add(new Empleado("Luisa3", 55, 2000));
		listaEmpleados.add(new Empleado("Luisa4", 55, 2000));
		listaEmpleados.add(new Empleado("Luisa5", 55, 2000));
		listaEmpleados.add(new Empleado("Luisa6", 55, 2000));
		listaEmpleados.add(new Empleado("Luisa7", 55, 2000));
		listaEmpleados.add(xy);
 
		System.out.println(listaEmpleados.indexOf(xy));
		listaEmpleados.set(3, xy);
		System.out.println(listaEmpleados.get(2));
//		for (Empleado x : listaEmpleados) {
//			System.out.println(x);
//		}

		Iterator<Empleado> iterador = listaEmpleados.iterator();
		while (iterador.hasNext()) {
			System.out.println(iterador.next());

		}

//		for (int i = 0; i < listaEmpleados.size(); i++) {
//			System.out.println(listaEmpleados.get(i));
//		}
		System.out.println(listaEmpleados.size());
	}
}

class Empleado {
	String nombre;
	int edad;
	double ingreso;

	public Empleado(String nombre, int edad, double ingreso) {
		this.nombre = nombre;
		this.edad = edad;
		this.ingreso = ingreso;
	}

	public String toString() {
		return "el nombre es " + nombre + ", tiene " + edad + " anios, y su ingreso es: " + ingreso;
	}
}