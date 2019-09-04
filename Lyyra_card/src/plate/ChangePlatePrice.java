package plate;

import java.util.Scanner;

public class ChangePlatePrice {
	
	
	// _______________________________
	// remove plat
	// _______________________________	   
	   public static void changeplateprice(Scanner reader, PlateDB db) {
		   
		   while (true) {
			   String askplate = MenusOptionsPlate.enterplatetoremove(reader);
			   
			   if (askplate.contentEquals("quit")) {
	     		   break;
			   }

			   if (!IsPlateInDB.isPlateInDB(askplate, db)) {
				   System.out.println("No existe el plato " + askplate);
				   System.out.println("Vuelva a entrar el plato");
	//			   System.out.println("Pulse INRO");
			   } else {
				   
				   Double askprice = MenusOptionsPlate.enterplateprice(reader);
				   
			 	    // Trabajar con plato a cambiar precio
				    // ______________________________________
				 	   for (int i=0; i < db.arraySize(); i++) {
				 		   
				 		   if (db.getPlate(i).getPlate().contentEquals(askplate)) {
				 			   Plate myplate = db.getPlate(i);
				 			   myplate.setPrice(askprice);
				 			   db.getPlate(i).setPrice(myplate.getPrice());
				 		   }
					   }				   
			   }
		   }

		   System.out.println("ChangePlatePrice --> La matriz contiene --> " + db.getArray());

	   }
}
