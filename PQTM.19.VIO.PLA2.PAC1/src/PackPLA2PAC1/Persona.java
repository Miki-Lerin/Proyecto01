package PackPLA2PAC1;

public class Persona {
	
	private String nombre;
	private Fecha fechaNacimiento;
	private Hora horaNacimiento;
	private String dni;
	private double estatura;
	
	
	public Persona(String nombre, Fecha fechaNacimiento, Hora horaNacimiento, String dni, double estatura) {
	    this.nombre = nombre;
	    this.fechaNacimiento = fechaNacimiento;
	    this.horaNacimiento = horaNacimiento;
	    this.dni = dni;
	    this.estatura = estatura;
	}
	
	
	public void imprimirDatos() {
	   System.out.println("");
	   System.out.print("Persona-DNI: ");
	   System.out.println(dni);
	   System.out.println("Persona-ESTATURA: " + estatura);
	   System.out.println("Persona-NOMBRE: " + nombre);
	   System.out.print("Persona-FECHA DE NACIMIENTO: ");
	   fechaNacimiento.imprimir();
	   System.out.print("Persona-HORA DE NACIMIENTO: ");
	   horaNacimiento.imprimir();
	   
	   System.out.println("Persona-OTRA FECHA NACIMIENTO: " + fechaNacimiento.getFecha());
	   
       System.out.println("Persona-FECHA ACTUAL:  " + fechaNacimiento.getFechaActual());

	}
	
	public void soyMasAltoQue(Persona p) {
         if(this.estatura > p.getEstatura()) {
        	System.out.println("Persona- Yo " + this.nombre + " soy más alto que " + p.getNombre());
        } else { if (this.estatura < p.getEstatura()) {
        	System.out.println("Persona- Yo " + this.nombre + " soy más bajo que " + p.getNombre());
        } else {
        	System.out.println("Persona- Yo " + this.nombre + " soy igual de alto que " + p.getNombre());        	
        }
         }
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

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
}
