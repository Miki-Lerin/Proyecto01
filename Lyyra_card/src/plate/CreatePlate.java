package plate;

import java.util.Scanner;

public class CreatePlate {
	
	   public static void createPlate(Scanner reader, PlateDB db) {
		   
		   while (true) {
			   String askplate = MenusOptionsPlate.enterplate(reader);
			   
			   if (askplate.contentEquals("quit")) {
	     		   break;
			   }

			   Double askprice = MenusOptionsPlate.enterplateprice(reader);
			   
	 	    // Create object Plate
		    // _____________________
			   Plate plate = new Plate(askplate, askprice);
			   
	 	    // Ask if card is in PersonDB
		    // _______________________________
			   if (IsPlateInDB.isPlateInDB(plate, db)) {
				   db.addPlate(plate);
				   System.out.println("Se ha añadido el plato " + plate.getPlate() + " a un precio de " + plate.getPrice());
			   } else {
				   System.out.println("Ya existe el plato en la matriz");
			   }
		   }
	   }
}