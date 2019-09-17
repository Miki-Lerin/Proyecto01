package PackPLA2.PAC2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Menu {
	
	private Scanner reader;
	
	public Menu(Scanner reader) {
		this.reader = reader;
	}
		
	public void loop(Scanner reader) {	
	
		Date fechaDesde = new Date();
		Date fechaHasta = new Date();
		
	    while (true) {
	    	System.out.println("Entrar la fecha como ddMMyyyy o Quit: ");
			String fecha = reader.nextLine();
			
			if (fecha.equals("Quit")) {
				break;
			}
			
			boolean todobien = Validaciones.fechaEsValida(fecha);
			if (todobien) {
				System.out.println("Fecha correcta");
		
				DateFormat df = new SimpleDateFormat("ddMMyyyy");
				
				try {
					fechaDesde = df.parse("01012019");
					fechaHasta = df.parse(fecha);
					System.out.println("Fecha desde " + df.format(fechaDesde));
					System.out.println("Fecha Hasta " + df.format(fechaHasta));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				boolean fechaCorrecta = Validaciones.fechaMayorFechaInicial(fechaHasta);
				System.out.println("Fecha correcta --> " + fechaCorrecta);
				
				int dias = Validaciones.numeroDiasEntreDosFechas(fechaDesde, fechaHasta);
				System.out.println("Dias de diferencia: " + dias);

				String fechaCadena = df.format(fechaHasta);

				int diaint = Integer.parseInt(fechaCadena.substring(0, 2));
				int mesint = Integer.parseInt(fechaCadena.substring(2, 4));
				int anyoint = Integer.parseInt(fechaCadena.substring(4, 8));
				
				System.out.println("La fecha " + df.format(fechaHasta) + 
						" es " +
						DiaSemana.diaDeLaSemana(diaint, mesint, anyoint));
	
				break;
				
			} else {
				System.out.println("Fecha incorrecta. Vuelva a informarla");
			}
	    }
	}

	public Scanner getReader() {
		return reader;
	}

	public void setReader(Scanner reader) {
		this.reader = reader;
	}
}