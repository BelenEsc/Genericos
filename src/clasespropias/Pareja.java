package clasespropias;

public class Pareja<T> {

	private T primero;

	public Pareja() {

		primero = null;

	}

	public void setValor(T nuevoSalor) {
		primero = nuevoSalor;

	}

	public T getValor() {
		return primero;
	}
	
	public static void getTrabajador(Pareja<? extends Empleado> p) {
			Empleado primero = p.getValor();
		 System.out.println(primero);
	}

}
