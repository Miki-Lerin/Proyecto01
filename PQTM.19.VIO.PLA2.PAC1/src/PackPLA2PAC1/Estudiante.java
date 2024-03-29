package PackPLA2PAC1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Estudiante extends Persona {
	
	private int numeroEstudiante;
	private int puntuacionTotal;
	private int numeroCalificaciones;
//	private ArrayList<Card> cardList = new ArrayList<>();
	private List<Credit> creditList = new ArrayList<>();
	private List<Mascota> mascotaList = new ArrayList<>();
	
	
	public Estudiante(int numeroEstudiante, String nombre, Fecha fechaNacimiento, 
			Hora horaNacimiento, String dni, double estatura) {
		
	    super(nombre, fechaNacimiento, horaNacimiento, dni, estatura);

	    this.numeroEstudiante = numeroEstudiante;
	    this.puntuacionTotal = 0;
	    this.numeroCalificaciones = 0;
	}
	
	
	public double getNotaMedia() {
	   return ((double) puntuacionTotal) / numeroCalificaciones;
	}
	
	public void imprimirDatos() {
	   super.imprimirDatos();
	   System.out.println("N�.Estudiante: " + getNumeroEstudiante());
	   System.out.println("Estudiante-FECHA NACIMIENTO (con super.): " + super.getFechaNacimiento().getFecha());
	   System.out.println("Estudiante-FECHA ACTUAL (con super): " + super.getFechaNacimiento().getFechaActual());
	   System.out.println("Estudiante-NOTA MEDIA: " + getNotaMedia());
	}
	
	public void imprimirTarjetas() {
		creditList.forEach(name -> System.out.println("Estudiante-TARJETA N�.: " + name.getNumCard() + " con un limite de: " + name.getCreditLimit()));
	}
		
	public void imprimirMascotas() {
		mascotaList.forEach(mascotas -> System.out.println("Estudiante-MASCOTA: " + mascotas.getRaza()));
	}
	
	public void mayorEdad() {
		int fecNacimiento = super.getFechaNacimiento().getFecha();
		int fecActual = super.getFechaNacimiento().getFechaActual();
	
		int fecDif = (fecActual - fecNacimiento) / 10000;
		if (fecDif < 18) {
			System.out.println("Estudiante es menor de edad, ya que tiene " + fecDif + " a�os");
		} else {
			System.out.println("Estudiante es mayor de edad, ya que tiene " + fecDif + " a�os");
		}
	}
	
	public void aniversario(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYYMM");
		System.out.println("Estudiante-A�O-MES " + Integer.parseInt(dateFormat.format(date)));
	}
	

	public void nuevaCalificacion(int puntos) {
	    puntuacionTotal += puntos;
	    numeroCalificaciones++;
	}
	
		
	public int getNumeroEstudiante() {
		return numeroEstudiante;
	}

	public void setNumeroEstudiante(int numeroEstudiante) {
		this.numeroEstudiante = numeroEstudiante;
	}


	public List<Credit> getCreditList() {
		return creditList;
	}

	public void setCreditList(List<Credit> creditList) {
		this.creditList = creditList;
	}


	public List<Mascota> getMascotaList() {
		return mascotaList;
	}


	public void setMascotaList(List<Mascota> mascotaList) {
		this.mascotaList = mascotaList;
	}
}
