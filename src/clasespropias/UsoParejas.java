package clasespropias;

public class UsoParejas {

	public static void main(String[] args) {

		Persona person1 = new Persona("Rodrigo");
		Persona person2 = new Persona("Rodriga");

		Pareja<Persona> pareja1 = new Pareja<>();
		pareja1.setValor(person1);
		pareja1.setValor(person2);
		System.out.println(pareja1.getValor());
	}
}

class Persona {
	String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;

	}
	
	public String toString() {
		return nombre;
	}
}