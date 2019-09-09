package restaurant;

import java.util.Scanner;

public class CobroCaja {
	
	public static void cobroCaja(Scanner reader, double price, MovimentDB dbmov) {
		
		System.out.println("Nos paga ");
		
		double paga = Double.parseDouble(reader.nextLine());
		
		if (paga != price) {
		    System.out.println("no son iguales");
       	    WriteMoviment.writeMoviment(2, "R", "Cambio", (paga - price), 0.0, dbmov);
		}    
	}
}
