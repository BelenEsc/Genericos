package clasespropias;

public class HerenciaGenericos {

	public static void main(String[] args) {

		Empleado Admini = new Empleado("Elena", 45, 1500);
		Jefe DirComercial = new Jefe("ana", 17, 3500);
		Empleado JefeComercial = DirComercial;
		
		Pareja <Empleado> Admin= new Pareja<>();
		Pareja <Jefe> Jefe = new Pareja<>();
//		Pareja <Empleado> equis = Jefe;
		Pareja.getTrabajador(Admin);
		Pareja.getTrabajador(Jefe);
		
		
	}

}
