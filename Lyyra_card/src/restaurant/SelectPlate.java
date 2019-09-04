package restaurant;

import java.util.Scanner;
import plate.*;

public class SelectPlate {

	// showMenu
	// _________________________________________________
	   public static void showMenu(Scanner reader, PlateDB db2, MovimentDB dbmov) {
		   
		    int ii = 0;	
		   
		    System.out.println("*********************************************");
		    System.out.println(" P L A T O S  D E L  D I A                   ");
		    System.out.println("*********************************************");			   
 		    for(int i=0; i < db2.arraySize(); i++) {
 			   ii = i+1;
			   if (db2.getPlate(i).getPlate().length() >= 14) {
					System.out.println(ii + ".- " + db2.getPlate(i).getPlate() + "\t" + db2.getPlate(i).getPrice());					   
			   } else {
					System.out.println(ii + ".- " + db2.getPlate(i).getPlate() + "\t\t" + db2.getPlate(i).getPrice());				   
			   }
		    }		   
		    System.out.println("\n" + (ii + 1) + ".- Pagar");  
		    
		    inputplate(reader, db2, dbmov);
   
	   }
	   
	   public static void inputplate(Scanner reader, PlateDB db, MovimentDB dbMov) {
	        System.out.println("Seleccione plato");
	        int option = Integer.parseInt(reader.nextLine());
	        
	        System.out.println(db.getPlate(option));
	        
	   }
	   
	   
}