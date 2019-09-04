package plate;

import java.util.Scanner;

public class TestPlate {

	// Metodo main
	// _________________________________________________
	   public static void main(String[] args) {
	
		   // Create dbPlate for Plate
		   // ______________________________________
		      PlateDB db = new PlateDB("Plate");
		      
		   // Ask user from menu by scanner
		   // ______________________________________		      
		      Scanner reader = new Scanner(System.in);
	   		 
		      InitialMenuPlate.initialMenuPlate(reader, db);

		      System.out.println("The End !!!");
	}
}