package PackPLA2PAC1;

public class Persona {
	
	private String nombre;
	private Fecha fechaNacimiento;
	private Hora horaNacimiento;
	private String dni;
	
	
	public Persona(String nombre, Fecha fechaNacimiento, Hora horaNacimiento, String dni) {
	    this.nombre = nombre;
	    this.fechaNacimiento = fechaNacimiento;
	    this.horaNacimiento = horaNacimiento;
	    this.dni = dni;
	}
	
	
	public void imprimirDatos() {
	   System.out.println("");
	   System.out.print("Persona-DNI: ");
	   System.out.println(dni);
	   System.out.println("Persona-NOMBRE: " + nombre);
	   System.out.print("Persona-FECHA DE NACIMIENTO: ");
	   fechaNacimiento.imprimir();
	   System.out.print("Persona-HORA DE NACIMIENTO: ");
	   horaNacimiento.imprimir();
	   
	   System.out.println("Persona-OTRA FECHA NACIMIENTO: " + fechaNacimiento.getFecha());
	   
       System.out.println("Persona-FECHA ACTUAL:  " + fechaNacimiento.getFechaActual());

	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	
/*	public String getFechaActual() {
		Date date = new Date();
		DateFormat datehour = fechaNacimiento.getFechaActual();
		return datehour.format(date);
	}  */
	
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
}
