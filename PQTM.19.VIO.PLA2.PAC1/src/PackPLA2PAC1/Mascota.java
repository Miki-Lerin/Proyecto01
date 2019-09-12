package PackPLA2PAC1;

public class Mascota {
	
	private String name;
	private String especie;
	private String raza;
	private String tipoPelo;
	private String color;
	private double peso;
	private Fecha fechaNacio;
	
	public Mascota(String name, String especie, String raza, String tipoPelo, 
			String color, double peso, Fecha fechaNacio) {
		this.name = name;
		this.especie = especie;
		this.raza = raza;
		this.tipoPelo = tipoPelo;
		this.color = color;
		this.peso = peso;
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

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getTipoPelo() {
		return tipoPelo;
	}

	public void setTipoPelo(String tipoPelo) {
		this.tipoPelo = tipoPelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Fecha getFechaNacio() {
		return fechaNacio;
	}

	public void setFechaNacio(Fecha fechaNacio) {
		this.fechaNacio = fechaNacio;
	}

	@Override
	public String toString() {
		return "Mascota [name=" + name + ", especie=" + especie + ", raza=" + raza + ", tipoPelo=" + tipoPelo
				+ ", color=" + color + ", peso=" + peso + ", fechaNacio=" + fechaNacio + "]";
	}
}
