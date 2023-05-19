package arraylist;

import java.io.File;

public class UsoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList nuevoArray = new ArrayList(6);
		nuevoArray.addElemento("hola");
		nuevoArray.addElemento("hola2");
		nuevoArray.addElemento("hola3");
		nuevoArray.addElemento("hola4");
		nuevoArray.addElemento("hola5");

		nuevoArray.addElemento(new File("C:\\Users\\andreabee90\\Documents\\Ficheros\\Ficheros\\azul.gif"));

		String salida = (String) nuevoArray.getElemento(5); 
//		File output = (File) nuevoArray.getElemento(1);

		System.out.println(salida);

	}

}
