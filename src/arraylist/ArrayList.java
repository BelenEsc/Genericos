package arraylist;

public class ArrayList {

	private Object[] datosElemento;
	private int i = 0;

	public ArrayList(int z) {
		datosElemento = new Object[z];

	}

	public Object getElemento(int i) {
		return datosElemento[i];
	}

	public void addElemento(Object o) {
		datosElemento[i] = o;
		i++;
	}
}
