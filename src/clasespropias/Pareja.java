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

}
