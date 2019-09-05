package herencia001;

public class TestEmpleadoComision {

	public static void main(String[] args) {

	  EmpleadoComision ec = new EmpleadoComision("Fuckencio Martinez",new Fecha(15, 3, 1979), 123456, 1000, 20);
	  ec.vender(200);
	  System.out.println("Test-Sueldo: " + ec.getSueldo());
	  System.out.println("---------------");
	  ec.imprimirDatos();
	}
}
