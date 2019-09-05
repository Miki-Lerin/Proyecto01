package herencia001;

public class Persona {
	
	private String nombre;
	private Fecha fechaNacimiento;
	private int dni;
	
	
	public Persona(String nombre, Fecha fechaNacimiento, int dni) {
	    this.nombre = nombre;
	    this.fechaNacimiento = fechaNacimiento;
	    this.dni = dni;
	}
	
	
	public void imprimirDatos() {
	   System.out.print("Persona-DNI: ");
	   System.out.println(dni);
	   System.out.println("Persona-NOMBRE: " + nombre);
	   System.out.print("Persona-FECHA DE NACIMIENTO: ");
	   fechaNacimiento.imprimir();
	   System.out.println();
	}
}
