package herencia001;

public class TestEmpleadoComision {

	public static void imprimirListado(Persona[] personas) {
		System.out.println("DNI Nombre Fecha de Nacimiento");
		System.out.println("------------------------------------------------------------");
		for (Persona p : personas) {
		  System.out.printf("%-9d %-30s %s\n", p.getDni(), p.getNombre());
		  p.getFechaNacimiento().imprimir();
		}
	}
	
	public static void imprimirListadoExtendido(Persona[] personas) {
		System.out.println("Lista de personas");
		System.out.println("------------------------------------------------------------");
		for (Persona p : personas) {
		   p.imprimirDatos();
		}
	}

	public static void main(String[] args) {
		EmpleadoComision ec = new EmpleadoComision("Fuckencio Martinez",new Fecha(15, 3, 1979), 123456, 1000, 20);
		ec.vender(200);
		System.out.println("Sueldo: " + ec.getSueldo());
		System.out.println("");
		ec.imprimirDatos();
		System.out.println("---------------");
		
		Persona p1 = new Empleado("Jordi Gasol", new Fecha(25, 3, 1985), 123456, 1300);
		Empleado e1 = (Empleado) p1;
		e1.imprimirDatos();
		
		System.out.println("---------------");
		
		//Error de ejecucion asignacion de clases
		/*Persona p2 = new Estudiante("Jordi", new Fecha(25, 3, 1985),123456);
		Empleado e2 = (Empleado) p2;
		e2.imprimirDatos();
		System.out.println("---------------");*/
		// Error de compilación asignacion de clases
		/*Persona p3 = new Persona("Pere", new Fecha(25, 8, 1995),123456, 1500);
		Empleado e3 = (Empleado) p3;
		e2.imprimirDatos();
		System.out.println("---------------");*/
		
		Persona p4 = new EmpleadoComision("Robert Martinez",new Fecha(5, 12, 2001), 12855456, 1500, 22);
		Empleado e4 = (Empleado) p4;
		e4.imprimirDatos();
		System.out.println("---------------");
		Persona[] personas = new Persona[4];
		personas[0] = new Persona("David Fernández Esteban", new Fecha(23, 5, 1980), 47839244);
		personas[1] = new Empleado("Enrique Martín Martín", new Fecha(1, 1, 1981), 38493212, 1600);
		personas[2] = new Estudiante("Ignacio Castiñeiras Perez", new Fecha(2, 2, 1983), 50120234);
		personas[3] = new EmpleadoComision("Laura Díaz Agrela", new Fecha(26, 6, 1987), 10938464, 1000, 20);
		imprimirListado(personas);
		
		System.out.println("---------------\n\n\n\n");
		
	    imprimirListadoExtendido(personas);
 
	}
}
