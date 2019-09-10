package PackPLA2PAC1;

public class Mascota {
	
	private String name;
	private String raza;
	private Fecha fechaNacio;
	
	public Mascota(String name, String raza, Fecha fechaNacio) {
		super();
		this.name = name;
		this.raza = raza;
		this.fechaNacio = fechaNacio;
	}
	
	public void imprimirDatosMascota() {
		   System.out.println("");
		   System.out.println("Mascota-NOMBRE: " + name);
		   System.out.println("Mascota-RAZA: " + raza);
		   System.out.print("Mascota-FECHA DE NACIMIENTO: ");
		   fechaNacio.imprimir();
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Fecha getFechaNacio() {
		return fechaNacio;
	}

	public void setFechaNacio(Fecha fechaNacio) {
		this.fechaNacio = fechaNacio;
	}

	@Override
	public String toString() {
		return "Mascota [name=" + name + ", raza=" + raza + ", fechaNacio=" + fechaNacio + "]";
	}
	
}
