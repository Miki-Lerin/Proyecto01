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
	    	System.out.println("Entrar la fecha o Quit: ");
			String fecha = reader.nextLine();
			
			if (fecha.equals("Quit")) {
				break;
			}
			
			boolean todobien = Validaciones.fechaEsValida(fecha);
			if (todobien) {
				System.out.println("Fecha correcta");
		
				DateFormat df = new SimpleDateFormat("ddMMyyyy");
				
				try {
					fechaHasta = df.parse(fecha);
					fechaDesde = df.parse("01012019");
					System.out.println("Fecha desde " + df.format(fechaDesde));
					System.out.println("Fecha Hasta " + df.format(fechaHasta));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				int dias = Validaciones.numeroDiasEntreDosFechas(fechaDesde, fechaHasta);
				System.out.println("Dias de diferencia: " + dias);
	
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