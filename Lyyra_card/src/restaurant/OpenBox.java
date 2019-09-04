package restaurant;

import java.util.Scanner;

public class OpenBox {
	
	public static double openBox(Scanner reader) {

		double beginningBalance = 0;
		
		System.out.println("Abriendo caja.");
		
		while (beginningBalance == 0) {
			System.out.println("Con cuantos euros abrimos caja? ");
			beginningBalance = Double.parseDouble(reader.nextLine());			
		}
	
		return beginningBalance;
	}
	
}
