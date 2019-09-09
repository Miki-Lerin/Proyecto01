package PackPLA2PAC1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Estudiante extends Persona {
	
	private int numeroEstudiante;
	private int puntuacionTotal;
	private int numeroCalificaciones;
	private Tarjeta numeroTarjeta;
	
	
	public Estudiante(int numeroEstudiante, String nombre, Fecha fechaNacimiento, 
			Hora horaNacimiento, String dni) {
		
	    super(nombre, fechaNacimiento, horaNacimiento, dni);

	    this.numeroEstudiante = numeroEstudiante;
	    this.puntuacionTotal = 0;
	    this.numeroCalificaciones = 0;
	    
	}
	
	
	public double getNotaMedia() {
	   return ((double) puntuacionTotal) / numeroCalificaciones;
	}
	
	public void imprimirDatos() {
	   super.imprimirDatos();
	   System.out.println("Nº.Estudiante: " + getNumeroEstudiante());
	   System.out.println("Estudiante-FECHA NACIMIENTO (con super.): " + super.getFechaNacimiento().getFecha());
	   System.out.println("Estudiante-FECHA ACTUAL (con super): " + super.getFechaNacimiento().getFechaActual());
	   System.out.println("Estudiante-NOTA MEDIA: " + getNotaMedia());
	}
	
	public void mayorEdad() {
		int fecNacimiento = super.getFechaNacimiento().getFecha();
		int fecActual = super.getFechaNacimiento().getFechaActual();
	
		int fecDif = (fecActual - fecNacimiento) / 10000;
		if (fecDif < 18) {
			System.out.println("Estudiante no es mayor de edad, ya que tiene " + fecDif + " años");
		} else {
			System.out.println("Estudiante es mayor de edad, ya que tiene " + fecDif + " años");
		}
	}
	
	public void aniversario(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYYMM");
		System.out.println("Estudiante-AÑO-MES " + Integer.parseInt(dateFormat.format(date)));
		
	
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

	public Tarjeta getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(Tarjeta numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	
}
