package herencia001;

public class Empleado extends Persona {

	protected int sueldoBase;
	
	public Empleado(String nombre, Fecha fechaNacimiento,int dni, int sueldoBase) {
	    super(nombre, fechaNacimiento, dni);
	    this.sueldoBase = sueldoBase;
	}

	public int getSueldo() {
	   return sueldoBase;
	}
	
	public void imprimirDatos() {
	   super.imprimirDatos();
	   System.out.print("Empleado-SUELDO: ");
	   System.out.println(sueldoBase);
	}
}
