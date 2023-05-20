package clasespropias;

import java.util.GregorianCalendar;

public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] stringes = new String[3];
		stringes[0] = "hola";
		stringes[1] = "como";
		stringes[2] = "vas";

//		Integer[] integeres = new Integer[6];
//		integeres[0] = 3;
//		integeres[1] = 4;
//		integeres[2] = 6;
//		integeres[3] = 6;
//		integeres[4] = 6;
//		integeres[5] = 6;
//
//		Empleado listaEmpleado[] = { new Empleado("Anna", 45, 45), new Empleado("juana", 40, 80) };
//
//		System.out.println(misMatrices.devuelve(stringes));
//		System.out.println(misMatrices.devuelve(integeres));
//		System.out.println(misMatrices.devuelve(listaEmpleado));
		System.out.println(misMatrices.devuelveMenor(stringes));
		GregorianCalendar fechas[] = { new GregorianCalendar(2005, 12, 7), new GregorianCalendar(2005, 12, 7),
				new GregorianCalendar(2005, 12, 7) };
		System.out.println(misMatrices.devuelveMenor(fechas));

	}
}

class misMatrices {

//	public static <T> String devuelve(T[] t) {
//		return t.length + " elementos";
//	}

	public static <T extends Comparable> T devuelveMenor(T[] t) {

		if (t == null || t.length == 0) {
			return null;
		}

		T menor = t[0];
//		System.out.println("el menor es: " + menor);
		for (int i = 1; i < t.length; i++) {

			int x = menor.compareTo(t[i]);// compare: si el elemento de la derecha es menor, tira un positivo, si el
											// elemento de la derecha es mayor, tira un negavtivo
//			System.out.println("equis " + x);
			if (x > 0) {
				menor = t[i];
			}
		}

		return menor;
	}
}

class Empleado {
	private String nombre;
	private int edad;
	private double ingreso;

	public Empleado(String nombre, int edad, double ingreso) {
		this.nombre = nombre;
		this.edad = edad;
		this.ingreso = ingreso;
	}

	public String toString() {
		return "el nombre es " + nombre + ", tiene " + edad + " anios, y su ingreso es: " + ingreso;
	}
}

class Jefe extends Empleado {
	public Jefe(String nombre, int edad, int salario) {
		super(nombre, edad, salario);
	}
	
	double incentivo (double x) {
		return x;
	}
}