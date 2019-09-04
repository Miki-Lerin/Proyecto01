package plate;

import java.util.Scanner;

public class RemovePlate {
	
	
	// _______________________________
	// remove plat
	// _______________________________	   
	   public static void removePlat(Scanner reader, PlateDB db) {
		   
		   while (true) {
			   String askplate = MenusOptionsPlate.enterplatetoremove(reader);
			   
			   if (askplate.contentEquals("quit")) {
	     		   break;
			   }

			   if (!IsPlateInDB.isPlateInDB(askplate, db)) {
				   System.out.println("No existe el plato " + askplate);
				   System.out.println("Vuelva a entrar el plato");
		//		   System.out.println("Pulse INRO");
			   } else {
				   
			 	    // Trabajar con plato a quitar
				    // _______________________________
				 	   for (int i=0; i < db.arraySize(); i++) {
				 		   
				 		   if (db.getPlate(i).getPlate().contentEquals(askplate)) {
				 			   Plate myplate = db.getPlate(i);
				 			   db.getArray().remove(myplate);
				 		   }
					   }				   
			   }
		   }

		   System.out.println("RemovePlate --> La matriz contiene --> " + db.getArray());

	   }		
}
