package PackPLA2.PAC2;

import java.util.Scanner;

public class Menu {
	
	private Scanner reader;
	
	public Menu(Scanner reader) {
		this.reader = reader;
	}
		
	public void loop(Scanner reader) {	
	
	    while (true) {
	    	System.out.println("Entrar la fecha como ddMMyyyy o Quit: ");
			String fecha = reader.nextLine();
			
			if (fecha.equals("Quit")) {
				break;
			}
			
			boolean todobien = Validaciones.fechaEsValida(fecha);
			if (todobien) {
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